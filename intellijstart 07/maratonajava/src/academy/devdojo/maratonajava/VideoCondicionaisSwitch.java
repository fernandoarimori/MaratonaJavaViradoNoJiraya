package academy.devdojo.maratonajava;

import java.util.Scanner;

public class VideoCondicionaisSwitch {
    public static void main(String[] args) {
        //imprima o dia da semana considerando domingo como dia 1

        Scanner userInp = new Scanner(System.in);
        System.out.println("Digite o  número com o dia da semana: (1 sendo domingo)");
        byte UserInp = userInp.nextByte();

        switch (UserInp) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
    }
}
