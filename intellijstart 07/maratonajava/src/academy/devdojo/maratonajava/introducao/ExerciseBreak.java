package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExerciseBreak {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezess ele pode ser parcelado. Valor da parcela >= 1000
        Scanner inp = new Scanner(System.in);
        System.out.println("Digite o valor do carro a ser comprado: ");
        float car = inp.nextFloat();


        for (int i = 1; car%1000<=1000 ; i++) {
            car -= 1000;
            if(car<=1000) {
                float last =(car+1000)%1000;
                System.out.println("Número da parcela de 1000 e de " + i + " e uma ultima parcela de "+ last);

                break;

            }

        }
    }
}
