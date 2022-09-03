package academy.devdojo.maratonajava.POLIMORFISMO.domain;

public abstract class PessoaCompetidora implements Pesagem {
    protected String name;
    protected int age;


    public PessoaCompetidora(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
