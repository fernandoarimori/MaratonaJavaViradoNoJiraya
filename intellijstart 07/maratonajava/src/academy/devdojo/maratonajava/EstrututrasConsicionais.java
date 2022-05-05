package academy.devdojo.maratonajava;

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
}
