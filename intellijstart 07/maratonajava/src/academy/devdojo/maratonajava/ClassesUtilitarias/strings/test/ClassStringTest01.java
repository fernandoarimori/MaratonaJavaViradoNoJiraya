package academy.devdojo.maratonajava.ClassesUtilitarias.strings.test;

public class ClassStringTest01 {
    public static void main(String[] args) {
        String nome = "Fernando";
        String nome2 = "Fernando";
        nome.concat(" Castilho Arimori");
        System.out.println(nome == nome2); //Igualdade de referência
        nome = nome.concat(" Castilho Arimori");
        System.out.println(nome == nome2);


        //Nunca usado:
        String nome3 = new String("Fernando");
        System.out.println("----------------");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());


    }
}
