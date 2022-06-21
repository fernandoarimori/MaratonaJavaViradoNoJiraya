package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExerciseSwitch {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7, imprima se e dia util ou final de semana (1 domingo)

        Scanner input = new Scanner(System.in);
        System.out.println("Digite que dia e hoje, enumerado:  (1=domingo)");
        byte dia = input.nextByte();
        String nome;
        boolean fds;

        switch (dia) {
            case 1:
                fds = true;
                nome = fds == true ? "Hojé e domingo e final de semana " : "Hoje é domingo";
                System.out.println(nome);
                break;
            case 2:
                fds = true;
                nome = fds == false ? "Hojé e domingo e final de semana " : "Hoje é segunda e nao e final de semana";
                System.out.println(nome);
                break;
            case 3:
                fds = true;
                nome = fds == false ? "Hojé e domingo e final de semana " : "Hoje é terca e nao e final de semana";
                System.out.println(nome);
                break;
            case 4:
                fds = true;
                nome = fds == false ? "Hojé e domingo e final de semana " : "Hoje é quarta e nao e final de semana";
                System.out.println(nome);
                break;
            case 5:
                fds = true;
                nome = fds == false ? "Hojé e domingo e final de semana " : "Hoje é quinta e nao e final de semana";
                System.out.println(nome);
                break;
            case 6:
                fds = true;
                nome = fds == false ? "Hoje e domingo e final de semana " : "Hoje é sexta e nao e final de semana";
                System.out.println(nome);
                break;
            case 7:
                fds = true;
                nome = fds == true ? "Hoje e sabado e final de semana " : "Hoje e domingo";
                System.out.println(nome);
                break;
            default:
                System.out.println("Entrada inválida, tente novamente");
        }
    }
}
