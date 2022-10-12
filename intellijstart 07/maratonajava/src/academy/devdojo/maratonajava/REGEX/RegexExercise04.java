package academy.devdojo.maratonajava.REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise04 {
    public static void main(String[] args) {
        //[] range
        // ? 0 ou uma ocorrencia
        //* zero ou mais ocorrencia
        //+ um ou mais ocorrencia
        //() agrupamento
        //$ fim da linha
        // {x,z} x até z
        // | e.i: o(v|c)o -> busca ovo ou oco
        // . e.i: 1.4 = 1r4, 114, 1s4 , coringa


        String regex = "([\\da-zA-Z._-])+@([\\da-zA-Z])+([.][a-zA-z]+)+";
        String texto  = "liffy.d@hotmail.com, 123jotaro4@gmail.com, #$@!zoro@gmail.br, teste@gmail.com, sakura@gmail, teste@gmailcom, teste@gmail.com.br";
//        String comparacaoNumerica = "0123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto "+ texto);
//        System.out.println("Indice"+ comparacaoNumerica);
        System.out.println("Regex "+ regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group() );
        }
        System.out.println("=================================================");
        System.out.println("=================================================");


    }
}
