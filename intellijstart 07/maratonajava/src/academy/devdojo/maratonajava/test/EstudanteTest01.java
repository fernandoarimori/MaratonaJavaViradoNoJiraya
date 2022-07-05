package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domainPT1.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Fernando";
        estudante.age = 31;
        estudante.sex = 'M';

        System.out.println(estudante.name+' '+estudante.age+' '+estudante.sex+"\n objeto sem o .(estudandete.nome, imprime apenas a variável de referência)\n"+ estudante);

    }
}
