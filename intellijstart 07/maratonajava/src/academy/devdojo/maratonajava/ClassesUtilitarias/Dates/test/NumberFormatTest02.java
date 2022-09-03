package academy.devdojo.maratonajava.ClassesUtilitarias.Dates.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        String one = "123122.32";
        String two = "12312";
        System.out.println(Double.parseDouble(one));
        System.out.println(Integer.parseInt(two));
        System.out.println("---PARSE MOEDA---");
        Locale us = Locale.US;
        NumberFormat nfUs= NumberFormat.getCurrencyInstance(us);
        String x = "123123.32";
        String y = "$123123.32";
        try {
            System.out.println(nfUs.parse(y));
        } catch (ParseException e) {
            throw new RuntimeException("Erro");
        }


    }
}

















