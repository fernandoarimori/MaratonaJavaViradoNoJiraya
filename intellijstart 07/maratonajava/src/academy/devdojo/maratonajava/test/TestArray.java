package academy.devdojo.maratonajava.test;


import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {

        String[] numAluno = new String[5];
        Float[] notaAluno = new Float[5];
        Scanner inpAluno = new Scanner(System.in);
        Scanner inpNota = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno: ");
            numAluno[i] = inpAluno.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota do aluno: ");
            notaAluno[i] = inpNota.nextFloat();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno: " + numAluno[i]+ " " + "nota: " + notaAluno[i]);
        }


/**
 for (String tabela : numAluno
 ) {
 System.out.println("Aluno: " + tabela);
 }
 for (Float notaTabela: notaAluno){
 System.out.println("Nota: "+ notaTabela);
 }
 **/
    }
}
