package academy.devdojo.maratonajava.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferefFileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter(file, true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("linha nova");
            bw.newLine(); //o append do File Write vai para uma nova linha independente do OS.
            bw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
//        file.delete();
    }
}
