package academy.devdojo.maratonajava.ScannerTokenDelimitadors;

import java.util.Scanner;

public class ScannerTokenDelimitadoresText01 {
    public static void main(String[] args) {
        String texto = "A, B, C, D, 200, true"; //letra=token ,=delimitador
        String[] nomesSeparador = texto.split(",");
        for (String s : nomesSeparador) {
            System.out.println(s.trim());
        }
        System.out.println("====== Split em Scanner ==========");
        Scanner scanner =  new Scanner(texto);
        scanner.useDelimiter(","); // default o delimitador é " ".
        while (scanner.hasNext()){
            System.out.println(scanner.next().trim());
        }

        System.out.println("===========Dando split com tipagem======");
        Scanner scanner2 =  new Scanner(texto);
        scanner2.useDelimiter(", ");
        while (scanner2.hasNext()){
            if (scanner2.hasNextInt()){
                int i = scanner2.nextInt();
                int o = i+5;
                System.out.println("Int do split: "+ (i));
                System.out.println("Int do split: "+ (o));
            }else if (scanner2.hasNextBoolean()){
                boolean b = scanner2.nextBoolean();
                System.out.println("Boolean do split: " + b);
            }else {
                System.out.println(scanner2.next().trim());
            }

        }
    }
}
