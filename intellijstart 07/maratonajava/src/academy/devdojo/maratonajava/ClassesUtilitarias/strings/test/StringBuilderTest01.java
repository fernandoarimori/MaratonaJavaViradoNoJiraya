package academy.devdojo.maratonajava.ClassesUtilitarias.strings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Fernando";
        nome.concat(" Castilho Arimori");
        System.out.println(nome);
        nome = nome.concat(" Castilho Arimori");
        System.out.println(nome);

        System.out.println("------------");
        //StringBuilder nomeBuilder = new StringBuilder(16); ->Capacidade começa em 16 e conforme passa-se *2
        StringBuilder nomeBuilder = new StringBuilder("Fernando");
        System.out.println(nomeBuilder);
        nomeBuilder.append(" Castilho").append(" Arimori");
        System.out.println(nomeBuilder);
        nomeBuilder.replace(0,8,"Derek");
        System.out.println(nomeBuilder);
        nomeBuilder.reverse();
        System.out.println(nomeBuilder);
        nomeBuilder.reverse();
        nomeBuilder.insert(3,'\u0103');
        System.out.println(nomeBuilder);


    }
}
