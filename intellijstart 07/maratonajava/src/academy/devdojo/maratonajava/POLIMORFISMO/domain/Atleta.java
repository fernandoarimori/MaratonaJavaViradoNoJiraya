package academy.devdojo.maratonajava.POLIMORFISMO.domain;

import java.util.Scanner;

public class Atleta extends PessoaCompetidora {
    private double peso;
    private String tranform = "Massive bodybuilder";
    public Category category;
    public Atleta(String name, int age) {
        super(name, age);
    }

    @Override
    public double calcularPeso() {
        Scanner inputPeso = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        peso = inputPeso.nextDouble();
        peso =(peso<=0)? null : peso;
        return peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Atleta{" +                ", name='" + name + '\'' +
                ", age=" + age +
                "peso=" + peso +
                ", category=" + category +

                '}';
    }

    public String printt() {
        return "Atleta{" +                ", name='" + name + '\'' +
                ", age=" + age +
                "peso=" + peso +
                ", category=" + category.CATEGORY +

                '}';
    }

    public String getTranform() {
        return tranform;
    }
}
