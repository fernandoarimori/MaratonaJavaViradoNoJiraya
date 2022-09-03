package academy.devdojo.maratonajava.POLIMORFISMO.service;

import academy.devdojo.maratonajava.POLIMORFISMO.domain.Atleta;
import academy.devdojo.maratonajava.POLIMORFISMO.domain.Category;
import academy.devdojo.maratonajava.POLIMORFISMO.domain.PessoaCompetidora;


public class AtletaCategoria {

    public static double calcularPesoMorph(PessoaCompetidora x) {
        if (x instanceof Atleta) {
            Atleta morph = (Atleta) x;
            ((Atleta) x).setPeso(120);
        }
        return ((Atleta) x).getPeso();
    }


    public static String categoria(Atleta x) {
        if (x.getPeso() <= 70) {
            System.out.println("Infelizmente não pode participar.");
            x.category = Category.NAO_PARTICIPANTE;
            return x.category.CATEGORY;
        } else {
            if (x.getPeso() > 70 && x.getPeso() <= 100) {
                x.category =Category.CLASSIC;
                return x.category.CATEGORY;
            }
            x.category =Category.BODYBUILDER;
            return x.category.CATEGORY;
        }
    }
}