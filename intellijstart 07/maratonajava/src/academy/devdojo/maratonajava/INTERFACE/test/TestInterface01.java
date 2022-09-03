package academy.devdojo.maratonajava.INTERFACE.test;

import academy.devdojo.maratonajava.INTERFACE.domain.DatabaseLoad;
import academy.devdojo.maratonajava.INTERFACE.domain.FileLoad;
import academy.devdojo.maratonajava.INTERFACE.domain.Loader;

public class TestInterface01 {
    public static void main(String[] args) {
        DatabaseLoad databaseLoad = new DatabaseLoad();
        FileLoad fileLoad = new FileLoad();
        databaseLoad.load();
        fileLoad.load();
        databaseLoad.checkAccess();
        fileLoad.checkAccess();
        DatabaseLoad.exemploDeMetodoNaInternface();
        Loader.exemploDeMetodoNaInternface();
    }
}
