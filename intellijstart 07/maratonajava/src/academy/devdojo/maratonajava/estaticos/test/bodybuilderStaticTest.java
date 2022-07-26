package academy.devdojo.maratonajava.estaticos.test;

import academy.devdojo.maratonajava.estaticos.domain.Bodybuilder;

public class bodybuilderStaticTest {
    public static void main(String[] args) {
        Bodybuilder bodybuilderSem = new Bodybuilder("James",'X',100,"");
        Bodybuilder bodybuilderCom = new Bodybuilder("James",'X',110,"Medio",true);
        bodybuilderSem.pose(bodybuilderSem);
        bodybuilderSem.getHairy(bodybuilderSem);
        bodybuilderSem.pose(bodybuilderSem);
        Bodybuilder.setBody("GIGAMUSCLE");
        bodybuilderSem.turnIntoBulking(bodybuilderSem);
        System.out.println("----------");
        bodybuilderSem.pose(bodybuilderSem);

    }
}
