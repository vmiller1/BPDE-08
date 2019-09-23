package de.telran;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

    public static void copyBinFile(String fileName, String newFileName) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(fileName);
            out = new FileOutputStream(newFileName);

            int c;
            while ((c = in.read()) != -1 ) {
                out.write(c);
            }
        } finally {
            if (in != null)
                in.close();
            if (out !=null)
                out.close();
        }

    }
}
