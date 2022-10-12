package academy.devdojo.maratonajava.Files;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        File file2 = new File("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\src\\academy\\devdojo\\maratonajava");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo foi creado");
            boolean isTrue = file.exists();
            System.out.println("Arquivo existe: " + isTrue);
            boolean isAFile = file.isFile();
            System.out.println("O arquivo e um arquivo: " + isAFile);
            boolean isADirectory = file.isDirectory();
            System.out.println("O arquivo e um diretorio: " + isADirectory);
            boolean isHidden = file.isHidden();
            System.out.println("O arquivo e oculto: " + isHidden);
            System.out.println("File path: " + file.getPath());
            System.out.println("File absolute path: " + file.getAbsolutePath());
            //MAIS IMPORTANTE, QUANDO ELE FOI MODIFICADO
            System.out.println("File quando foi modificado: " + new Date(file.lastModified()));
            System.out.println("File quando foi modificado: " + Instant.ofEpochMilli(file.lastModified()));//UCT:0
            System.out.println("File quando foi modificado: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            String str = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toString();
            str = str.substring(0,10);
            System.out.println(str);

            Date str2 = new Date((file.lastModified()));
            DateFormat formated = new SimpleDateFormat("dd-mm-yyyy");
            String str2Formated = formated.format(str2);
            System.out.println(str2Formated);


            boolean isFileDeleted = file.delete();
            if (isFileDeleted) {
                System.out.println("Arquivo foi deletado" + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
