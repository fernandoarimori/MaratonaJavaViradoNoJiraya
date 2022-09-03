package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String dataEscrita = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat dateFormat = new SimpleDateFormat(dataEscrita);
        System.out.println(dateFormat.format(new Date()));
        try {
            System.out.println(dateFormat.parse("2022.08.30 d.C. at 11:27:11 BRT"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }


}
