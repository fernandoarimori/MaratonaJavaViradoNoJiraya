package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate lDate = LocalDate.parse("2024-12-30");
        LocalTime lTime = LocalTime.parse("23:13:55.23425623");
        LocalDateTime localDatePlusTime = lDate.atTime(lTime);
        LocalDateTime localTimePlusDate = lTime.atDate(lDate);
        System.out.println(localDatePlusTime);
        System.out.println(localTimePlusDate);
        System.out.println(localTimePlusDate.getDayOfMonth());
        System.out.println(localTimePlusDate.getDayOfWeek());
    }
}
