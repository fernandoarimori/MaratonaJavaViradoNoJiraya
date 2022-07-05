package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.intrometodo.Estudante;
import academy.devdojo.maratonajava.intrometodo.UsoDoThis;

public class EstudanteMetodoComThis {
    public static void main(String[] args) {

        UsoDoThis imprime = new UsoDoThis();

        imprime.name = "Fernando";
        imprime.age = 31;
        imprime.sex = 'M';

        imprime.imprime();

        imprime.name = "sadasd";
        imprime.age = 21;
        imprime.sex = 'F';

        imprime.imprime();






    }
}
