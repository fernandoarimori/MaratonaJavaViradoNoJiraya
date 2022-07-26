package academy.devdojo.maratonajava.enumeracao.test;

import academy.devdojo.maratonajava.enumeracao.domain.BodsybuilderEnu;
import academy.devdojo.maratonajava.enumeracao.domain.ClothEnum;
import academy.devdojo.maratonajava.enumeracao.domain.TipoAtletaEnum;

public class TestAtletaEnum {
    public static void main(String[] args) {
        BodsybuilderEnu atleta1= new BodsybuilderEnu("Doug", TipoAtletaEnum.CLASSIC, ClothEnum.UNDERWEAR);
        BodsybuilderEnu atleta2= new BodsybuilderEnu("Derek", TipoAtletaEnum.BODYBUILDER, ClothEnum.SHINY_TRUNK);
        BodsybuilderEnu atleta3= new BodsybuilderEnu("Art", TipoAtletaEnum.MROLYMPIA, ClothEnum.SHINY_TRUNK);

        System.out.println(atleta1);
        System.out.println(atleta2);
        System.out.println(atleta3);
        System.out.println("-----------------");
        System.out.println(atleta1.getClothEnum().tipoDePose(" "));
        System.out.println(atleta2.getClothEnum().tipoDePose(" "));

    }
}
