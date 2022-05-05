package academy.devdojo.maratonajava;

public class LogicOperator {
    public static void main(String[] args) {
        // $$ (and), || (or), !(not)
        int age = 31;
        float salary = 3500F;
        float salary2 = 10000F;
        boolean isUnderThirtyLegal = age < 29 && salary >= 3381;
        boolean isOverThirtyLegal = age >= 29 && salary > 4612;
        boolean isOverThirtyLegaltrue = age >= 29 && salary2 > 4612;
        System.out.println("Under 30 legal: " + isUnderThirtyLegal);
        System.out.println("Over 30 legal: " + isOverThirtyLegal);
        System.out.println("Over 30 legal: " + isOverThirtyLegaltrue);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");

        float contaUm = 3440F;
        float contaDois = 8000F;
        boolean isBuyAble = contaUm >= contaDois || contaDois > contaUm; //or,if one of them is true
        System.out.println("Posso comprar um ps5: "+ isBuyAble);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("ATRIBUIAOO"); // == += -+ *= /= %=
        int contadorUm = 1000;
        int contadorDois = 700;
        contadorUm += 500;
        System.out.println(contadorUm);
        contadorDois -= 500;
        System.out.println(contadorDois);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        float multUm = 100;
        float divUm = 24;
        System.out.println(multUm *= 10);
        System.out.println(divUm /= 3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        int restaUm = 10;
        System.out.println(restaUm %=3);






    }
}
