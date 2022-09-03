package academy.devdojo.maratonajava.INTERFACE.domain;

public class FileLoad implements Loader{
    @Override
    public void load() {
        System.out.println("Loading files...");
    }

    @Override
    public void checkAccess() {
        System.out.println("Checando acesso ao arquivo");
    }
}
