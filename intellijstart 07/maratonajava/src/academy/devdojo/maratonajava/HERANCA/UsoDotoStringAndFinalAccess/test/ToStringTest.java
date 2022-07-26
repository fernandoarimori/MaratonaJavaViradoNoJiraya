package academy.devdojo.maratonajava.HERANCA.UsoDotoStringAndFinalAccess.test;

import academy.devdojo.maratonajava.HERANCA.UsoDotoStringAndFinalAccess.domain.BbdrToString;
import academy.devdojo.maratonajava.HERANCA.UsoDotoStringAndFinalAccess.domain.Trunktype;

public class ToStringTest {
    public static void main(String[] args) {
        BbdrToString bbder = new BbdrToString("DEREK");
        Trunktype trunk = new Trunktype();
        //bbder.TRUNKTYPE = trunk2;
        //bbder.TRUNKTYPE = new trunk2;
        //não pode alterar a instancia mesmo criando um novo objeto
        System.out.println(bbder.toString());
        bbder.TRUNKTYPE.setType("Vynil");
        System.out.println(bbder.TRUNKTYPE.getType());

        bbder.setCategory("Mr.Olympia");
        bbder.imprime();

    }
}
