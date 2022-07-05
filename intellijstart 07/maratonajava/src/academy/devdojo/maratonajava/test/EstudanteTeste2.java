package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domainPT1.Estudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.name = "Llul";

        System.out.println(estudante.name);
        System.out.println(estudante.sex);
        System.out.println(estudante.age);

        System.out.println("\n------\n");

        System.out.println(estudante2.name);
        System.out.println(estudante2.name);
        System.out.println(estudante2.sex);
        System.out.println(estudante2.age);

    }
}
