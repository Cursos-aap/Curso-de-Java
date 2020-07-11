package readingFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "\\src\\readingFiles\\numbers.txt";

        FileInputStream in = null;
        FileOutputStream out = null;

        try {

            in = new FileInputStream(path + "\\text.txt");
            out = new FileOutputStream(path + "\\new_file.txt");
            int temp;

            while ((temp = in.read()) != -1) {
                out.write(temp);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}
