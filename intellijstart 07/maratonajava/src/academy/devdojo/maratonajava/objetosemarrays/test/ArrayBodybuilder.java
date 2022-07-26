package academy.devdojo.maratonajava.objetosemarrays.test;

import academy.devdojo.maratonajava.objetosemarrays.domain.Bodybuilder;

public class ArrayBodybuilder {
    public static void main(String[] args) {
        Bodybuilder bbder1 = new Bodybuilder("Jay Cuttle");
        Bodybuilder bbder2 = new Bodybuilder("Ronnie Coleman");
        Bodybuilder bbder3 = new Bodybuilder("Art Atwood");
        Bodybuilder[] bbders = {bbder1, bbder2, bbder3};
        for (Bodybuilder bbder : bbders) {
            bbder.bodybuilderPose();
        }
    }
}

