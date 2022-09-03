package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate ldtNow = LocalDate.now();
        LocalDate ldtNowPlus2T = LocalDate.now().plusYears(2).plusMonths(10);
        Period p1 = Period.between(ldtNow,ldtNowPlus2T);
        System.out.println(p1);
        Period p2 = Period.ofDays(34);
        System.out.println(p2);
        Period p3MonthsYears = Period.ofMonths(34);
        System.out.println(p3MonthsYears);
        System.out.println(p3MonthsYears);

    }



}

