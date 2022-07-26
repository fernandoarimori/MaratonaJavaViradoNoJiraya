package academy.devdojo.maratonajava.exercicioassiciacao.test;

import academy.devdojo.maratonajava.exercicioassiciacao.domain.Aluno;
import academy.devdojo.maratonajava.exercicioassiciacao.domain.Professor;
import academy.devdojo.maratonajava.exercicioassiciacao.domain.Seminario;

public class TestSeminario {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", 13);
        Aluno aluno2 = new Aluno("Eduardo", 23);
        Aluno aluno3 = new Aluno("Debora", 33);
        Aluno alunos[] = {aluno1, aluno3};
        Aluno alunos2[] = {aluno2};
        Seminario seminario1 = new Seminario("Educa1", "Lugar x");
        Seminario seminario2 = new Seminario("Educa2", "Lugar y",alunos);
        Seminario seminario3 = new Seminario("Educa3", "Lugar z",alunos);
        Seminario[] seminarios ={seminario2,seminario3};
        Professor professor1 = new Professor("Bruno","Fisica",seminarios);
        seminario2.setProfessor(professor1);
        aluno1.setSeminario(seminario2);
        aluno3.setSeminario(seminario2);
        aluno2.setSeminario(seminario3);
        seminario2.setProfessor((professor1));

        System.out.println("---Alunos---");
        aluno1.imprime(aluno1);
        aluno2.imprime(aluno2);
        aluno3.imprime(aluno3);
        System.out.println("---Professores---");
        professor1.imprime();
        System.out.println("---Seminarios---");
        seminario1.imprime();
        seminario2.imprime();
    }
}
