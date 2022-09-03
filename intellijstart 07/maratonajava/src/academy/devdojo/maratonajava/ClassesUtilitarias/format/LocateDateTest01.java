package academy.devdojo.maratonajava.ClassesUtilitarias.format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocateDateTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Locale locBR = new Locale("pt","BR");
        Locale locJA = new Locale("ja","JP");
        Locale locCZ = new Locale("cze","CZ");
        Locale locCAN = new Locale("fr","CA");
        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL,locBR);
        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL,locJA);
        DateFormat dfCZ = DateFormat.getDateInstance(DateFormat.FULL,locCZ);
        DateFormat dfCAN = DateFormat.getDateInstance(DateFormat.FULL,locCAN);
        System.out.println(dfBR.format(calendar.getTime()));
        System.out.println(dfJA.format(calendar.getTime()));
        System.out.println(dfCZ.format(calendar.getTime()));
        System.out.println(dfCAN.format(calendar.getTime()));

        System.out.println("-----");
        System.out.println(locCZ.getDisplayCountry());
        System.out.println(locJA.getDisplayCountry());
        System.out.println(locCAN.getDisplayCountry());
        System.out.println(locBR.getDisplayCountry());

    }
}
