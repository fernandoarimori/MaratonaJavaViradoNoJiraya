package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterExercise01 {
    public static void main(String[] args) {
        DayOfWeek[] days = DayOfWeek.values();
        for (DayOfWeek day: days
             ) {
            switch (day){
                case THURSDAY:
                    System.out.println("Hoje: " + day+ " e o proximo dia util e "+ day.plus(4));
                    break;
                case FRIDAY:
                    System.out.println("Hoje: " + day+ " e o proximo dia util e "+ day.plus(3));
                    break;
                case SATURDAY:
                    System.out.println("Hoje: " + day+ " e o proximo dia util e "+ day.plus(2));
                    break;
                case SUNDAY:
                    System.out.println("Hoje: " + day+ " e o proximo dia util e "+ day.plus(1));
                    break;
                default:
                    System.out.println("Hoje: " + day+ " e o proximo dia util e "+ day.plus(1));
                    break;
            }
        }





//        DayOfWeek hoje = DayOfWeek.values(LocalDate.now().withDayOfMonth());
//        DayOfWeek friday = DayOfWeek.FRIDAY ;
//        DayOfWeek saturday = DayOfWeek.SATURDAY;
//        DayOfWeek sunday = DayOfWeek.SUNDAY;
//        String sextaFDS = hoje == friday? "x" :"y";
//        System.out.println(sextaFDS);
    }
}

