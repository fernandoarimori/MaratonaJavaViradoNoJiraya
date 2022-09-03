package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime timeAgora = LocalTime.now();
        LocalTime timeEsp = LocalTime.of(22,31,10,123412312);
        System.out.println(timeEsp);
        System.out.println(timeAgora);
        System.out.println(timeAgora.getNano());
        System.out.println(timeEsp.getHour());
        System.out.println(timeEsp.getMinute());
        System.out.println(timeEsp.getSecond());
        System.out.println(timeEsp.getNano());
        System.out.println(timeEsp.MIDNIGHT);
        System.out.println(timeEsp.MIN); //-> Menor horário do dia
        System.out.println(timeEsp.MAX); //-> Maior horário do dia
        System.out.println(timeEsp.MAX.getNano());

    }
}
