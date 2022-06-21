package academy.devdojo.maratonajava.introducao;

public class EstrututrasConsicionais {
    public static void main(String[] args) {
        boolean carro = true;
        if(carro){
            System.out.println("Foi atropelhado!");
        }
        if(!carro){ //! nope
            System.out.println("Foi atropelhado!");
        }else {
            System.out.println("Safe");
        }
        System.out.println("\n~~~~~EXERCISE~~~~\n"); //else if
        /**
         * Se o jogador tiver menos de 15 anos: Juvenil;
         * Entre 15 e 18: Prejuvenil;
         * De 18 para cima veio
         */
        int age = 17;
        if(age<15){
            System.out.println("Voce e um juvenil");
        } else if (age >=15 && age<18) {
            System.out.println("Voce e prejuvenil");
        }else {
            System.out.println("Voce e veio");
        }

        System.out.println("~Fora do if.~");
    }

    public static class OperatorStudy {
        public static void main(String[] args) {
            // + - * /
            int mais = 1+1;
            int menos = 1-1;
            int mult = 3*2;
            int div = 6/3;
            System.out.println("\n+ - * /");
            System.out.println(mais);
            System.out.println(menos);
            System.out.println(mult);
            System.out.println(div);

            //resto %
            System.out.println("\n*Resto");
            int semResto = 30 % 3;
            int comResto = 31 % 2;
            System.out.println("Sem resto " + semResto);
            System.out.println("Com resto " + comResto);

            //maior que menor que < <= >= > == != [OPERADORES LÓGICOS] apenas retornam boolean
            int maiorQ = 123;
            int menorQ = 10;
            int menorQExemploComIgual = 10;
            System.out.println(maiorQ > menorQ);
            System.out.println(menorQ >= menorQExemploComIgual);
            System.out.println("\nOutro exemplo: ");
            boolean equal = 10==10;
            boolean difference = 9!=10;
            boolean differenceFake = 9==10;
            boolean isTenBiggerThanNine = 10>9;
            boolean isTenBiggerThanNineFake = 10<9;
            System.out.println(isTenBiggerThanNine);
            System.out.println(isTenBiggerThanNineFake);
            System.out.println("equal "+ equal);
            System.out.println("difference: "+ difference);
            System.out.println("difference fake: "+ differenceFake);
        }
    }
}
