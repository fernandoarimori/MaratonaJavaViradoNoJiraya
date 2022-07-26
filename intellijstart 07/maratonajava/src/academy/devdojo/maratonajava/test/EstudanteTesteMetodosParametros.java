package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.intrometodo.Estudante;
import academy.devdojo.maratonajava.intrometodo.imprimeestudante;

public class EstudanteTesteMetodosParametros {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        imprimeestudante impressora = new imprimeestudante();

        estudante1.name = "Fernando";
        estudante1.age = 31;
        estudante1.sex = 'M';

        estudante2.name = "Wallyyy";
        estudante2.age = 22;
        estudante2.sex = 'F';

        System.out.println(estudante1);
        System.out.println(estudante2);

        System.out.println("------------");
        System.out.println(estudante1.name);
        System.out.println(estudante1.age);
        System.out.println(estudante1.sex);

        System.out.println(estudante2.name);
        System.out.println(estudante2.age);
        System.out.println(estudante2.sex);
        System.out.println("------------");

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        System.out.println(estudante1);
        System.out.println(estudante2);



    }
}
