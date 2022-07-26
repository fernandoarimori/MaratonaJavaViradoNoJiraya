package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domainPT1.CalculadoraExemploMetodo;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        CalculadoraExemploMetodo calculadora = new CalculadoraExemploMetodo();
        calculadora.somaDoiNumeros();
        System.out.println("----------------");
        calculadora.diminuiDoiNumeros();

        System.out.println("----------------");
        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        int x = inp1.nextInt();
        int y = inp2.nextInt();
        calculadora.multiplicaoDeDoiNumerosAleatorios(x,y);

        System.out.println("----------------");
        Scanner inp3 = new Scanner(System.in);
        Scanner inp4 = new Scanner(System.in);
        double div1 = inp3.nextDouble();
        double div2 = inp4.nextDouble();
        double resultadoDiv = calculadora.divisaoDoisNumeros(div1,div2);
        System.out.println(resultadoDiv);

        System.out.println("----------------");
        System.out.println("----------------");

        int exemploArray[] = {1,2,3,4,5};
        calculadora.somaVarArgs(exemploArray);


    }
}
