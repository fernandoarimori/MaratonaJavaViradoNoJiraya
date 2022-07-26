package academy.devdojo.maratonajava.HERANCA.test;

import academy.devdojo.maratonajava.HERANCA.domain.FuncionarioHeranca;
import academy.devdojo.maratonajava.HERANCA.domain.PessoaHeranca;

public class TestHeranca1 {
    public static void main(String[] args) {
        PessoaHeranca pessoa1 = new PessoaHeranca("Lucas");

        pessoa1.setIdade(23);
        pessoa1.setCpf("1111111");
        pessoa1.imprime();

        FuncionarioHeranca pessoa2= new FuncionarioHeranca("Kleber",1543.65f);

        pessoa2.setIdade(32);
        pessoa2.setCpf("312312");

        System.out.println("----");
        pessoa2.imprime();
    }
}
