package academy.devdojo.maratonajava.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise02 {
    public static void main(String[] args) {
        //Busca por META CARACTERES, caracteres específicos
        // \d = digitos
        String regex = "\\d";
        String texto = "qw231eq w@^ ^%ee123q we\rff#d#@fas3d\f";
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

        // \D -> tudo que não é digito, incluindo caradcteres espercificos
        String regex2 = "\\D";
        String texto2 = "qw231eq w@^ ^%ee123q we\rff#d#@fas3d\f";
        String comparacaoNumerica2 = "0123456789";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("Texto "+ texto2);
        System.out.println("Indice"+ comparacaoNumerica2);
        System.out.println("Regex "+ regex2);
        System.out.println("Posicoes encontradas: ");
        while (matcher2.find()){
            System.out.println(matcher2.start()+" "+matcher2.group() );
        }
        System.out.println("=================================================");
        System.out.println("=================================================");

        // \s(espaço em branco basico) \t \n \f \r -> Espaços em branco
        // \S tudo menos espaco em branco
        String regex3 = "\\S";
        String texto3 = "qw23\r1eq w@^ ^%ee\t123q we\rff#d#@fas3d";
        String comparacaoNumerica3 = "0123456789";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(texto3);
        System.out.println("Texto "+ texto3);
        System.out.println("Indice"+ comparacaoNumerica3);
        System.out.println("Regex "+ regex3);
        System.out.println("Posicoes encontradas: ");
        while (matcher3.find()){
            System.out.println(matcher3.start()+" "+matcher3.group() );
        }
        System.out.println("=================================================");
        System.out.println("=================================================");

        // \w = a-z, A-Z, digitos, _
        // \W = contrario do \w

        String regex4 = "\\W";
        String texto4 = "qw23\r1eq w@^ ^%ee\t123q__we\rff#d#@fas3d";
        String comparacaoNumerica4 = "0123456789";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(texto4);
        System.out.println("Texto "+ texto4);
        System.out.println("Indice"+ comparacaoNumerica4);
        System.out.println("Regex "+ regex4);
        System.out.println("Posicoes encontradas: ");
        while (matcher4.find()){
            System.out.println(matcher4.start()+" "+matcher4.group() );
        }
        System.out.println("=================================================");
        System.out.println("=================================================");

    }
}
