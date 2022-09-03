package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        LocalDateTime testTime = LocalDateTime.of(1969,10,23,22,32,12);
        System.out.println(now); //-> Zulu time, horário mundial fixo UTC+0
        System.out.println(testTime);
        System.out.println(now.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(1,1_000_000_000_000L));
    }
}
