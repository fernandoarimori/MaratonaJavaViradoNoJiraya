package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domainPT1.Professor;

public class Professortest1 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.name = "Mario";
        professor1.sex = 'M';
        professor1.age = 44;


        System.out.println("Nome: "+professor1.name+ " Idade: " + professor1.age+ " Sexo: " + professor1.sex);
    }
}
