package academy.devdojo.maratonajava.ClassesUtilitarias.Dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime ldtNow = LocalDateTime.now();
        LocalDateTime ldtNowPlus2T = LocalDateTime.now().plusYears(2);
        LocalDateTime ldtNowPlus2TPlus3M = LocalDateTime.now().plusYears(2).plusMinutes(32).plusSeconds(324);
        Duration d1 = Duration.between(ldtNow,ldtNowPlus2T);
        System.out.println(d1);
        Duration d2 = Duration.between(ldtNow,ldtNowPlus2TPlus3M);
        Duration days2Hours = Duration.ofDays(29);
        System.out.println(d2);
        System.out.println(days2Hours);
    }
}
