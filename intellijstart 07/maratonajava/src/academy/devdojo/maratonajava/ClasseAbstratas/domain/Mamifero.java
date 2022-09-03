package academy.devdojo.maratonajava.ClasseAbstratas.domain;

public abstract class Mamifero extends SerVivo {
    protected String name;
    protected String quantidadePelo;

    public Mamifero(String name, String quantidadePelo) {
        this.name = name;
        this.quantidadePelo = quantidadePelo;
        this.somQueFaz();
    }

    @Override
    public void estarVivo() {
        System.out.println("To vivo!!");
    }

    public abstract void somQueFaz();

}
