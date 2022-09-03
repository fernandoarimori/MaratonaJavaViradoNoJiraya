package academy.devdojo.maratonajava.POLIMORFISMO.test;

import academy.devdojo.maratonajava.POLIMORFISMO.domain.Atleta;
import academy.devdojo.maratonajava.POLIMORFISMO.service.AtletaCategoria;

public class TestPolimosrfismo01 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Jason", 23);
        atleta1.calcularPeso();
        System.out.println(atleta1);
        AtletaCategoria.categoria(atleta1);
        System.out.println(atleta1.printt());
    }
}
