package academy.devdojo.maratonajava.objetosemarrays.test;

import academy.devdojo.maratonajava.objetosemarrays.domain.Bodybuilder;
import academy.devdojo.maratonajava.objetosemarrays.domain.Team;

public class BodybuilderTeamUmPraTodos {
    public static void main(String[] args) {
        Bodybuilder bbder = new Bodybuilder("Derek Drun");
        Team team = new Team("Evogen");
        //cadastro em time
        bbder.setTeam(team);
        //
        bbder.bodybuilderPose();
    }
}
