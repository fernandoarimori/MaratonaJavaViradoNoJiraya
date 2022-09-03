package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplosCatch {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de array out of bounds exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de out of bounds exception");
        } catch (NullPointerException e) {
            System.out.println("Dentro de NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }

        try {
            erroException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void erroException() throws SQLException, FileNotFoundException {

    }
}
