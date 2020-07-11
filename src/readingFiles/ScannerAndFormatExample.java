package readingFiles;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class ScannerAndFormatExample {
    public static void main(String[] args) throws IOException {

        Scanner scanner = null;
        double sum = 0;

        try {
            String path = System.getProperty("user.dir") + "\\src\\readingFiles\\numbers.txt";

            FileReader fr = new FileReader(path);
            scanner = new Scanner(new BufferedReader(fr));
            scanner.useLocale(Locale.US);

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble())
                    sum += scanner.nextDouble();
                else
                    scanner.next();
            }
        } finally {
            if(scanner != null)
                scanner.close();

            System.out.println(sum);
        }

    }
}