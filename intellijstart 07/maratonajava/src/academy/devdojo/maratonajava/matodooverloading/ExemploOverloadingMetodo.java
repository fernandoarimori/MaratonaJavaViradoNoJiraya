package academy.devdojo.maratonajava.matodooverloading;

public class ExemploOverloadingMetodo {
    public static void main(String[] args) {
        anime desenho = new anime();
        desenho.init("Naruto", "Aventura", 10);
        desenho.init("Naruto", "Aventura", 10, 7.8f);
        desenho.imprime();
    }
}
