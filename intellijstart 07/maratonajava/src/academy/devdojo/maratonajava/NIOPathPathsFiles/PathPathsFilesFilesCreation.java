package academy.devdojo.maratonajava.NIOPathPathsFiles;

import java.io.IOException;
import java.nio.file.*;

public class PathPathsFilesFilesCreation {
    public static void main(String[] args) throws IOException {
        Path origin = Paths.get("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta", "subPasta");
        if (Files.notExists(origin)){
            Files.createDirectory(origin);
        }
        ////
        Path target = Paths.get("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta\\subPasta", "subSubPasta", "pastaFinal");
        if (Files.notExists(target)){
            Files.createDirectories(target);
        }
        ////
        Path arquivo = Paths.get("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta\\subPasta\\subSubPasta\\pastaFinal","lala.txt");
        if (Files.notExists(arquivo)) {
            Files.createFile(arquivo);
        }
        Path newFile = Paths.get(arquivo.getParent().toString(),"lala_renew.txt");
        Files.copy(arquivo,newFile,StandardCopyOption.REPLACE_EXISTING);

    }
}
