package academy.devdojo.maratonajava.UmPraTodosTodosPraUm.test;

import academy.devdojo.maratonajava.UmPraTodosTodosPraUm.domain.Bodybuilder;
import academy.devdojo.maratonajava.UmPraTodosTodosPraUm.domain.Team;

public class PracticeRoom {
    public static void main(String[] args) {
        Bodybuilder bodybuilder1 = new Bodybuilder("Derek");
        Bodybuilder bodybuilder2 = new Bodybuilder("Hadi");
        Bodybuilder [] bodybuilders = {bodybuilder1,bodybuilder2};
        Team team = new Team("Evogen", bodybuilders);
        bodybuilder1.setTeam(team);
        bodybuilder2.setTeam(team);

        System.out.println("----Bodybuilder1----");
        bodybuilder1.print();
        System.out.println("----Bodybuilder2----");
        bodybuilder2.print();
        System.out.println("----Team----");
        team.print();

    }
}
