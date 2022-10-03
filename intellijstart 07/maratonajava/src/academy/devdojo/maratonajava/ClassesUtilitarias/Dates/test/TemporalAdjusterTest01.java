package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDateTime now2 = LocalDateTime.now();
        now.plusDays(30);
        System.out.println("now.plusDays(30) Adiciona virando o mês");
        System.out.println(now.plusDays(30));
        System.out.println("------------");
        now.withDayOfMonth(30);
        System.out.println("now.withDayOfMonth(30); Adiciona virando o mês");
        System.out.println(now.withDayOfMonth(30));
        System.out.println("-------------");
        System.out.println("Hoje: "+ now);
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Proxima terca da semana "+ now);
        System.out.println("----------------");
        now2 = LocalDateTime.now().with(ChronoField.DAY_OF_MONTH,6);
        System.out.println(now2);

    }
}
