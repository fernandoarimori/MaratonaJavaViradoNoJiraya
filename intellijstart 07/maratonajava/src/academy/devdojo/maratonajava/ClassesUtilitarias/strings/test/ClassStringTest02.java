package academy.devdojo.maratonajava.ClassesUtilitarias.strings.test;

import java.util.Locale;

public class ClassStringTest02 {
    public static void main(String[] args) {
        String nome = "Marcel";
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.indexOf('r'));
        System.out.println(nome.replace("el","elo"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0,4));//->Vai do index 0  ao 3 (4-1)
        System.out.println("--------------");
        String nome2 = "123 456 789";
        System.out.println(nome2.indexOf("789"));
    }
}
