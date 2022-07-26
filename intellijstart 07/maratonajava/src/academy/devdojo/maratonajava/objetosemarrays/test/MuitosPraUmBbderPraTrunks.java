package academy.devdojo.maratonajava.objetosemarrays.test;

import academy.devdojo.maratonajava.objetosemarrays.domain.Probbder;
import academy.devdojo.maratonajava.objetosemarrays.domain.Trunksdobbder;

public class MuitosPraUmBbderPraTrunks {
    public static void main(String[] args) {
        Trunksdobbder trunk1 = new Trunksdobbder("Pink trunk");
        Trunksdobbder trunk2 = new Trunksdobbder("Baby Blue trunk");
        Trunksdobbder [] trunks  = {trunk1, trunk2};
        Probbder bbder = new Probbder("Antonie",trunks);

        bbder.pose();
    }
}
