package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.util.Date;

public class ClassDateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println("----------");
        Date date2 = new Date(1661432538483L);
        System.out.println(date2);
    }
}
