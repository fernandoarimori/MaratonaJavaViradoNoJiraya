package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.test;

import academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.domain.ExceptionFilha;
import academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.domain.ExceptionPai;

import java.io.FileNotFoundException;


public class OverrideException {
    public static void main(String[] args) {
        ExceptionPai classePai = new ExceptionPai();
        ExceptionFilha classeFilha = new ExceptionFilha();
        classeFilha.salvar();

        //Classe pai necessita de tratanento por ter throw de Exception, o OVERRIDE DE METÓDO NÃO VÊM COM SEUS THROWS
        try {
            classePai.salvar();
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
