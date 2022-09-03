package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.test;

import java.io.File;
import java.io.IOException;

public class ThrowTry {
    public static void main(String[] args) throws IOException{
        crateFile();
    }

    public static void crateFile() throws IOException {
        File file = new File(".idea/arquivo\\test.txt");
        try {
            boolean isCrated = file.createNewFile();
            System.out.println("Criado arquivo: "+ isCrated);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }

    }
}
