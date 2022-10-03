package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        String datetest1 = date.format(DateTimeFormatter.ISO_DATE_TIME);
        String datetest2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String datetest3 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(" "+datetest2+" "+datetest3);
        LocalDate parseTest = LocalDate.parse("2022-10-03", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parseTest1 = LocalDate.parse("2022-10-03T20:25:04.7104684-03:00", DateTimeFormatter.ISO_DATE_TIME);
        LocalDate parseTest3 = LocalDate.parse("20221003", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parseTest);
        System.out.println(parseTest1);
        System.out.println(parseTest3);

        LocalDateTime now = LocalDateTime.now();
        String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format1);



        //Formatacao especifica
        DateTimeFormatter formatBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nowFormatBR = LocalDate.now().format(formatBr);
        System.out.println(nowFormatBR);
    }
}
