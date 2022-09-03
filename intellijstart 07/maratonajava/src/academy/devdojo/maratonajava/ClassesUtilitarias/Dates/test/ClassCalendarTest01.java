package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.util.Calendar;
import java.util.Date;

public class ClassCalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        System.out.println(c.getFirstDayOfWeek());
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Primeiro dia da semana e domingo");
        }
        System.out.println("Semana do ano: " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Dia do mes: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Mes do ano: " + c.get(Calendar.MONTH));
        System.out.println("--------------");
        System.out.println("Metodo c.add adiciona, passandco como argumento Calendar.--, VIRANDO O MES/ANO: ");
        c.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c.getTime());
        System.out.println("Metodo .roll adiciona tem SEM VIRADA DE MES OU ANO: ");
        c2.roll(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c2.getTime());



    }
}
