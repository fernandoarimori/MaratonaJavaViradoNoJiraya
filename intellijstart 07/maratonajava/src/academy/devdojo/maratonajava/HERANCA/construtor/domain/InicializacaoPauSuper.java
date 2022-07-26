package academy.devdojo.maratonajava.HERANCA.construtor.domain;

public class InicializacaoPauSuper {
    private String nome;

    static {
        System.out.println("Inicializacao SSUPER STATIC");
    }
    {
        System.out.println("Inicializacao SUPER SEM SER STATIC");
    }

    public InicializacaoPauSuper(String nome) {
        this.nome = nome;
        System.out.println("Dentro do contrutor SUPER");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
