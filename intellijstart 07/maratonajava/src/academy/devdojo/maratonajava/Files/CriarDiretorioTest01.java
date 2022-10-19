package academy.devdojo.maratonajava.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriarDiretorioTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("pasta");
        boolean isDiretoryCreated = file.mkdir();
        System.out.println(isDiretoryCreated);

        File arquivo = new File(file, "arquivo.txt");
        boolean isFileCreated = arquivo.createNewFile();
        System.out.println(isFileCreated);


        File arquivoRenomeado = new File(file, "arquivo_rename.txt");
        boolean isRenamed = arquivo.renameTo(arquivoRenomeado);
        System.out.println(isRenamed);

        File fileRename = new File("pasta_renomeada");
        boolean isDiretoryRenamed = file.renameTo(fileRename);
        System.out.println(isDiretoryRenamed);
        String str= ("Ta na hora de jantar");
        FileWriter fw = new FileWriter(arquivoRenomeado,true);
        fw.write(str);
        fw.flush();
        fw.close();





    }
}
