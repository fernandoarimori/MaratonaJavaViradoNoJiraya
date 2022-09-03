package academy.devdojo.maratonajava.ClasseAbstratas.test;

import academy.devdojo.maratonajava.ClasseAbstratas.domain.Baleia;
import academy.devdojo.maratonajava.ClasseAbstratas.domain.TipoMamiferos;

public class TesteMamifero {
    public static void main(String[] args) {
        Baleia baleia = new Baleia("Orca", "Poucos", TipoMamiferos.AQUATICO);
        System.out.println(baleia);
        String tipoBaleia = TipoMamiferos.AQUATICO.habitatDeCada();
        System.out.println(tipoBaleia);
        baleia.estarVivo();
    }
}
