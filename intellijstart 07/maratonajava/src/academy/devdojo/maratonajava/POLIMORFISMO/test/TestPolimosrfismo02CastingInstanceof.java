package academy.devdojo.maratonajava.POLIMORFISMO.test;

import academy.devdojo.maratonajava.POLIMORFISMO.domain.Atleta;
import academy.devdojo.maratonajava.POLIMORFISMO.domain.PessoaCompetidora;
import academy.devdojo.maratonajava.POLIMORFISMO.service.AtletaCategoria;

public class TestPolimosrfismo02CastingInstanceof {
    public static void main(String[] args) {
        //test de narrowcasting
        PessoaCompetidora morph = new Atleta("Fernando", 31);
        //Castinf de Atleta e objeto que faz red para PessoaCompetitiva, pegando atributo de atleta.
        System.out.println(((Atleta) morph).getTranform());
        System.out.println(morph);
        AtletaCategoria.calcularPesoMorph(morph);
        System.out.println("-------------");
        System.out.println(morph);
        AtletaCategoria.categoria((Atleta) morph);
        System.out.println(morph);
    }
}
