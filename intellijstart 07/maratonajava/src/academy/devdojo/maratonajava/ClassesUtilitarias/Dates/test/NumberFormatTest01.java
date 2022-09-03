package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.text.NumberFormat;

import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale jp = Locale.JAPAN;
        Locale ca = Locale.CANADA;
        Locale it = Locale.ITALY;
        NumberFormat[] listNumber = new NumberFormat[3];
        listNumber[0] = NumberFormat.getInstance(jp);
        listNumber[1] = NumberFormat.getInstance(ca);
        listNumber[2] = NumberFormat.getInstance(it);
        double val = 10_000_000.1331D;
        for (NumberFormat numberFormat : listNumber) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(val));
        }
        System.out.println("CURRENCY AND PARSE------------------");
        NumberFormat[] nl = new NumberFormat[3];
        nl[0] = NumberFormat.getInstance(jp);
        nl[1] = NumberFormat.getInstance(ca);
        nl[2] = NumberFormat.getInstance(it);
        double val2 = 100_000.133D;
        for (NumberFormat x : nl) {
            System.out.println(x.getMaximumFractionDigits());
            System.out.println(x.format(val2));
        }
    }
}
