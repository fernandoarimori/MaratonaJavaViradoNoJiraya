package academy.devdojo.maratonajava.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domainPT1.CarExercise;

public class carExercise {
    public static void main(String[] args) {
        CarExercise car1 = new CarExercise();
        CarExercise car2 = new CarExercise();
        car1.name = "Christine";
        car1.model = "Plymouth Fury";
        car1.year = 1958;
        car2.name = "Herbie";
        car2.model = "Fusca";
        car2.year = 1974;

        //car2 =car1; -> Não da para desfazer.

        System.out.println("Primeiro modelo: ");
        System.out.println("Nome: "+ car1.name +"\n"+"Modelo: "+car1.model+"\n"+"Ano: "+car1.year+"\n");

        System.out.println("Segundo modelo: ");
        System.out.println("Nome: "+ car2.name +"\n"+"Modelo: "+car2.model+"\n"+"Ano: "+car2.year);
    }
}
