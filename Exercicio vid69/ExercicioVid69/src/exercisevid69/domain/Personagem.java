package exercisevid69.domain;

import java.util.Scanner;

public class Personagem {
    private String name;
    private int age;
    private float weight;
    private float height;
    private String bodytype = "normal";
    private String bodyhair = "no";
    private String cloth = "normal t-shirt and jeans";

    public void pose(Personagem x){
        System.out.println("-------------------");
        System.out.println("Your characters status:");
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.weight);
        System.out.println(x.height);
        System.out.println(x.bodyhair);
        System.out.println(x.bodytype);
        System.out.println(x.cloth);
    }
    public void creation(Personagem x){
        Scanner inputName = new Scanner(System.in);
        Scanner inputAge = new Scanner(System.in);
        Scanner inputWeight = new Scanner(System.in);
        Scanner inputHeight = new Scanner(System.in);
//        Scanner inputBodytype = new Scanner(System.in);
//        Scanner inputBodyhair = new Scanner(System.in);
//        Scanner inputCloth = new Scanner(System.in);

        System.out.println("What's your name?");
        x.name = inputName.nextLine();
        System.out.println("Your age is: ");
        x.age = inputAge.nextInt();
        System.out.println("What's your weight?");
        x.weight = inputWeight.nextFloat();
        System.out.println("What's your height?");
        x.height = inputHeight.nextFloat();
        return;
    }


    //get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getBodyhair() {
        return bodyhair;
    }

    public void setBodyhair(String bodyhair) {
        this.bodyhair = bodyhair;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }
}
