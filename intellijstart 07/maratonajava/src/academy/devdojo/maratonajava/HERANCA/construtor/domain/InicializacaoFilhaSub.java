package academy.devdojo.maratonajava.HERANCA.construtor.domain;

public class InicializacaoFilhaSub extends InicializacaoPauSuper {
    static {
        System.out.println("INICIALIZACAO STATIC FILHA");
    }
    {
        System.out.println("Dentro do INICIALIZACAO NAO STATIC FILHA");

    }

    public InicializacaoFilhaSub(String nome) {
        super(nome);
        System.out.println("Dentro do contrutor FILHA");
    }
}
