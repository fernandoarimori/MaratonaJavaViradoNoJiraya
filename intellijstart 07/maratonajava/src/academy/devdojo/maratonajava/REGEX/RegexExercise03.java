package academy.devdojo.maratonajava.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise03 {
    public static void main(String[] args) {
        String regex = "0[xX][\\da-fA-F]";
        String texto  = "0x 0X123d 0x133a oxR 0x341F";
        String comparacaoNumerica = "0123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto "+ texto);
        System.out.println("Indice"+ comparacaoNumerica);
        System.out.println("Regex "+ regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group() );
        }
        System.out.println("=================================================");
        System.out.println("=================================================");
    }
}
