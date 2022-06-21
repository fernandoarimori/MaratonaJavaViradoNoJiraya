package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

//Dado um salário dado , saber quanto dever ser pago de imposto.
public class ExercicioEstruturasCondicionais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu salário anual (use . como vírgula): ");
        double salary = input.nextDouble();
        double minTax = 9.7d;
        double avrTax = 37.35d;
        double maxTax =49.50d;
        double imposto;


        if(salary == 0 || salary<34712){
            imposto = minTax;
        }else if (salary>=34712 && salary<=68502 ){
            imposto = avrTax;
        }else
            imposto = maxTax;
        double toPay;
        toPay=(imposto*salary)/100;
        System.out.println("Você tem que pagar: "+ toPay+ " eu de imposto");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");




    }
}
