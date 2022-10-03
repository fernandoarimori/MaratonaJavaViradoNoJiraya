package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.time.*;
import java.util.Map;

import static java.time.OffsetDateTime.of;

public class ZonedIdZonedDateTimeOffsetDateTimeTEST01 {
    public static void main(String[] args) {
        Map<String, String> zonedIds = ZoneId.SHORT_IDS;
        System.out.println("-ZoneId-");
        System.out.println("Lista de zonas [ID=Zona]: " + zonedIds);
        ZoneId zoneIdEu = ZoneId.of("Europe/Paris");
        System.out.println("Zona de um determinado local pelo ID: " + zoneIdEu);
        //Zona local
        System.out.println("Zona local: " + ZoneId.systemDefault());
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Local date time.now():    " + now);
        LocalDateTime nowEu = LocalDateTime.now(zoneIdEu);
        System.out.println(nowEu);

        System.out.println("-ZonedDateTime- da o horário local mais o UTC+/-");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zoned date time now : " + zonedDateTime);
        ZonedDateTime zonedDateTimeEu = now.atZone(zoneIdEu);
        System.out.println("zoned date time no id de EU: " + zonedDateTimeEu);

        System.out.println("--OffsetDateTime--HORARIO LOCAL MAIS O UTC+/-");
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        System.out.println("OffsetDateTime now:    " + offsetDateTimeNow);
        OffsetDateTime offsetDateTimeOtherPlace = OffsetDateTime.now(zoneIdEu);
        System.out.println("OffsetDateTime do EU:    " + offsetDateTimeOtherPlace);
        ZoneOffset maxUTC = ZoneOffset.MAX;
        ZoneOffset minUTC = ZoneOffset.MIN;
        System.out.println("Oddsettime max/min:  " + maxUTC + "/" + minUTC);

        System.out.println("--ZoneOffSet-- settar pelo UTC");
        ZoneOffset testeMinusFive = ZoneOffset.of("-05:00");
        OffsetDateTime offsetDateTimeMinusFive = now.atOffset(testeMinusFive);
        System.out.println("Teste de zone off set 'of' passando -5UTC de argumento -5: " + offsetDateTimeMinusFive);
        OffsetDateTime offsetDateTimeMinusFiv2 = OffsetDateTime.of(now, testeMinusFive);
        System.out.println("Teste de zone off set 'of' passando -5UTC de argumento horatio local e -5: " + offsetDateTimeMinusFiv2);

        System.out.println("--Dentro da classe instant--");
        Instant nowInsta = Instant.now();
        System.out.println("Horario universal: "+ nowInsta);
        OffsetDateTime localTimeMinusFive = nowInsta.atOffset(testeMinusFive);
        System.out.println("tempo -5UTC: com classe Instant: "+localTimeMinusFive);


    }
}
