package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDAteTest01 {
    private static TemporalAccessor Temporal;

    public static void main(String[] args) {
        //exemplo
        System.out.println("new Date(): "+new Date());
        System.out.println("Calendar.getInstance(): "+Calendar.getInstance());
        //
        LocalDate lDate = LocalDate.of(22, Month.AUGUST,30);
        System.out.println("LocalDate: "+lDate);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.atTime(LocalTime.now()));
    }
}
