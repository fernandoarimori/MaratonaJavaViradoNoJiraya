package academy.devdojo.maratonajava.NIOPathPathsFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize {
    public static void main(String[] args) {
//        String z = "pasta/subPasta/subSubPasta";
//        String y  ="../../pastaFinal";
//        Path x = Paths.get(z,y);
//        System.out.println(x);
//        System.out.println(x.normalize());


        //Resolve

        Path absolute = Paths.get("pasta/subPasta/subSubPasta");
        Path relative = Paths.get("pastaFinal");
        Path qwe = absolute.resolve(relative);
        System.out.println(qwe);

    }
}
