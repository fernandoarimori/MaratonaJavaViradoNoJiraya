package academy.devdojo.maratonajava.INTERFACE.domain;

public class DatabaseLoad implements Loader{
    @Override
    public void load() {
        System.out.println("Loading database...");
    }
//    @Override - > Não da para subescrever método static da classe interface.
    public static void exemploDeMetodoNaInternface(){
        System.out.println("Método estático dentro do database...");
    }
}
