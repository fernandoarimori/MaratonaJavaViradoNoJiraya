package academy.devdojo.maratonajava;

public class LoopStructurept3 {
    public static void main(String[] args) {
        // Dada um nukmero de 0 a 50, imprima os primeiros 25, que brasse o lasso
        int rep = 0;
        int breaker =0;
        while (rep<=50){
            System.out.println(rep);
            if(breaker>=25){
                System.out.println("==============");
                break;
            }
            rep++;
            breaker++;
        }
        System.out.println("***"+rep);
    }
}
