package academy.devdojo.maratonajava.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise01 {
    public static void main(String[] args) {
        String regex = "qwe";
        String texto = "qweqweeqwe";
        String comparacaoNumerica = "0123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto "+ texto);
        System.out.println("Indice"+ comparacaoNumerica);
        System.out.println("Regex "+ regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+ " ");
        }

        //Segundo exemplo eles nao considera aquele padrao quando ja foi encontrado um nele
        System.out.println("\n================---============");
        String regex2 = "aa";
        String texto2 = "aaaaaaa";
        String comparacaoNumerica2 = "0123456789";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("Texto "+ texto2);
        System.out.println("Indice"+ comparacaoNumerica2);
        System.out.println("Regex "+ regex2);
        System.out.println("Posicoes encontradas: ");
        while (matcher2.find()){
            System.out.print(matcher2.start()+ " ");
        }
        System.out.println("aa.aa.aa.a - posicoes: 0=aa:2=aa:4=aa");
    }
}
