package academy.devdojo.maratonajava.Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class BasicFilesAtributeTest01 {
    public static void main(String[] args) throws IOException {

        //3 Interfaces = BasicFileAttributes, DosFileAttributes. PosixFileAttributes (mais voltada para Unix)
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta\\subPasta\\subSubPasta\\modified.txt");
        boolean isFileCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        //Outro modo de modificar

        Path path = Paths.get("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta\\subPasta\\subSubPasta\\modified_2.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);


    }
}
