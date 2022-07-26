package exercisevid69.test;

import exercisevid69.domain.Personagem;

public class Transform {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();


        //Intro
        System.out.println("Intro");
        System.out.println("You are goint into a bar, soo how are you:");
        p1.creation(p1);

    }
}
