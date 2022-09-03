package academy.devdojo.maratonajava.INTERFACE.domain;

public interface Loader {
    final static String TAMANHO="Macro";
    int PESO=1000;
    void load();
    default void checkAccess(){
        System.out.println("Checando acesso");
    }

    public static void exemploDeMetodoNaInternface(){
        System.out.println("Método estático dentro da interface...");
    }
}
