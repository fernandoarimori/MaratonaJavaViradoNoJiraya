package academy.devdojo.maratonajava.NIOPathPathsFiles;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathPaths {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta\\arquivo.txt");
        Path p2 = Paths.get("C:", "Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta", "arquivo.txt");
        Path p3 = Paths.get("C:\\Users\\SheilaMello\\Desktop\\ESTUDO DEVDOJO\\intellijstart 07\\maratonajava\\pasta", "arquivo_rename.txt");
        Path p4 = Paths.get("C:", "Users", "SheilaMello", "Desktop", "ESTUDO DEVDOJO", "intellijstart 07", "maratonajava", "pasta", "arquivo.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
