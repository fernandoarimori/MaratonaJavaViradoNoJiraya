package academy.devdojo.maratonajava.Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
            System.out.println(fr.read());
//            char[] charFile = new char[30];
//            for (char charFiles : charFile) {
//                System.out.print(charFiles);
//            }
            int i;
            while ((i=fr.read()) != -1){
                System.out.print((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
