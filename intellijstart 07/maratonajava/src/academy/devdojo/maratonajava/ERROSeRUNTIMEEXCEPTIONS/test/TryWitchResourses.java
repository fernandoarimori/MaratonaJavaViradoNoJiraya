package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.test;

import academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.domain.Leitor1;
import academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.domain.Leitor2;

import java.io.IOException;

public class TryWitchResourses {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
