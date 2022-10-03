package exercise.oneclasses.service;

import exercise.oneclasses.domain.Acts;
import exercise.oneclasses.domain.BodyType;
import exercise.oneclasses.domain.Personagem;
import exercise.oneclasses.domain.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingUser extends Personagem implements Acts {

//    public String toEnumString(String x) {
//        switch (super.sex) {
//            case MALE:
//                x = "M";
//                return x;
//            break;
//            case FEMALE:
//                x = "F";
//                return x;
//            break;
//            default:
//                return null;
//        }

    public List CreatingUser() {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.bodyType = bodyType;
        this.cloth = cloth;
        List seuPersonagem = new ArrayList<>();
        System.out.println("Digite seu nome");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        name = input.nextLine();
        seuPersonagem.add(0, name);
        System.out.println("Digite sua idade");
        age = input2.nextInt();
        seuPersonagem.add(1, age);

        System.out.println("Digite seu sexo: M-Masculino");
        System.out.println("Digite seu sexo: F-Feminino");
        String sexChoice = input3.nextLine();
        switch (sexChoice) {
            case "M":
                sex = Sex.MALE;
                break;
            case "F":
                sex = Sex.FEMALE;
                break;
            default:
                System.out.println("Caractere invalido");

        }
        seuPersonagem.add(2, sex);
        System.out.println("body");
        String bodytype = input4.nextLine();
        switch (bodytype) {
            case "Normal":
                bodyType = BodyType.NORMAL;
                break;
            case "Fat":
                bodyType = BodyType.FAT;
                break;
            case "Muscular":
                bodyType = BodyType.MUSCULAR;
                break;
            case "Muscle Bull":
                bodyType = BodyType.MUSCLE_BULL;
                break;
            case "Bodybuilder":
                bodyType = BodyType.BODYBUILDER;
                break;
            case "Macro Bodybuilder":
                bodyType = BodyType.MACRO_BODYBUILDER;
                break;
            default:
                System.out.println("Caractere invalido");
        }
        seuPersonagem.add(2,bodyType);
        return seuPersonagem;
    }


    @Override
    public String talk() {
        return null;
    }

    @Override
    public String interact() {
        return null;
    }
}
