package academy.devdojo.maratonajava.ScannerTokenDelimitadors;

import java.util.Scanner;

public class ScanneTokenDelimitaorTest02 {
    public static void main(String[] args) {
        String texto = "A , B , C , D , 200, true";
        Scanner scanner2 = new Scanner(texto);
        scanner2.useDelimiter(", ");
        while (scanner2.hasNext()) {
            if (scanner2.hasNextInt()) {
                int i = scanner2.nextInt();
                int o = i + 5;
                System.out.println("Int do split: " + (i));
                System.out.println("Int do split: " + (o));
            } else if (scanner2.hasNextBoolean()) {
                boolean b = scanner2.nextBoolean();
                System.out.println("Boolean do split: " + b);
            } else {
                System.out.println(scanner2.next().trim());
            }

        }
    }
}
