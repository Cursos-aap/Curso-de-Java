package readingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            ReadingFiles.printHelp();
            return;
        } else if (args.length > 1) {
            System.out.println("For now we can only read 1 file");
            ReadingFiles.printHelp();
            return;
        }

        String fileStr2read = args[0];

        File file2read = new File(fileStr2read);

        if (!file2read.exists()) {
            System.out.println("Could not find file \"" + file2read.getName() + "\", absolute path: \"" + file2read.getAbsolutePath() + "\"");
            return;
        }

        if (!file2read.isFile()) {
            System.out.println("\"" + file2read.getName() + "\" is NOT a file absolute path: \"" + file2read.getAbsolutePath() + "\"");
            return;
        }

        if (!file2read.canRead()) {
            System.out.println("\"" + file2read.getName() + "\" exists but do not have read permission, absolute path: \"" + file2read.getAbsolutePath() + "\"");
            return;
        }

        long[] start = new long[3];
        long[] end = new long[3];

        int n_tests = 10 + 1;
        while (--n_tests > 0) {
            start[0] = System.nanoTime();
            ReadingFiles.readWithScanner(file2read);
            end[0] = System.nanoTime();

            start[1] = System.nanoTime();
            ReadingFiles.readWithBufferedReader(file2read);
            end[1] = System.nanoTime();

            start[2] = System.nanoTime();
            ReadingFiles.readWithInputStream(file2read);
            end[2] = System.nanoTime();

            for (int i = 0; i < start.length; ++i)
                System.out.println(end[i] - start[i]);
            System.out.println();
        }

        //Files.readAllLines("build.xml", Charset.defaultCharset());
    }

    public static void readWithScanner(final File file2read) {
        Scanner scanner = null;
        StringBuilder strOutBuilder = new StringBuilder();

        try {
            scanner = new Scanner(file2read);

            while (scanner.hasNextLine())
                strOutBuilder.append(scanner.nextLine()).append('\n');
        } catch(FileNotFoundException ex) {
            System.err.println("Something went really really wrong!!");
            ex.printStackTrace(); // solo para development
        } finally {
            if (scanner != null)
                scanner.close();
        }

        //System.out.println(strOutBuilder.toString());
    }

    public static void readWithInputStream(final File file2read) {
        StringBuilder strOutBuilder = new StringBuilder();

        final short BUFFER_SIZE = 1024;
        int read_chars = 0;

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2read))) {
            char[] buffer = new char[BUFFER_SIZE];

            do {
                read_chars = inputStreamReader.read(buffer, 0, BUFFER_SIZE);

                if (read_chars < BUFFER_SIZE && read_chars > -1)
                    for (int i = read_chars; i < BUFFER_SIZE; ++i)
                        buffer[i] = '\0';

                strOutBuilder.append(buffer);
            } while(read_chars > -1);

        } catch(IOException ex) {
            System.err.println("Something went really really wrong!!");
            ex.printStackTrace(); // solo para development
        }

        //System.out.println(strOutBuilder.toString());
    }

    public static void readWithBufferedReader(final File file2read) {
        final short BUFFER_SIZE = 1024;

        int read_chars = 0;
        StringBuilder strOutBuilder = new StringBuilder();

        try (BufferedReader buffReader = new BufferedReader(new FileReader(file2read))) {
            char[] buffer = new char[BUFFER_SIZE];

            while (read_chars > -1) {
                read_chars = buffReader.read(buffer, 0, BUFFER_SIZE);

                if (read_chars < BUFFER_SIZE && read_chars > -1)
                    for (int i = read_chars; i < BUFFER_SIZE; ++i)
                        buffer[i] = '\0';

                strOutBuilder.append(buffer);
            }// while (read_chars > -1);
        } catch(IOException ex) {
            System.err.println("Something went really really wrong!!");
            ex.printStackTrace(); // solo para development
        }

        //System.out.println(strOutBuilder.toString());
    }

    public static void printHelp() {
        System.out.println("Usage: java ReadingFiles filename");
        System.out.println("\tfilename\tThe file to display in STDOUT");
    }
}

