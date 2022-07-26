package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.intrometodo.Estudante;
import academy.devdojo.maratonajava.intrometodo.UsoDoThis;

public class EstudanteMetodoComThis {
    public static void main(String[] args) {

        UsoDoThis x = new UsoDoThis();

        x.name = "Fernando";
        x.age = 31;
        x.sex = 'M';

        x.imprime();

        x.name = "sadasd";
        x.age = 21;
        x.sex = 'F';

        x.imprime();






    }
}
