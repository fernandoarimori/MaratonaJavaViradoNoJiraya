package academy.devdojo.maratonajava.objetosemarrays.domain;

public class Bodybuilder {
    private String name;
    private Team team;

    public Bodybuilder(String name) {
        this.name = name;
    }

    public void bodybuilderPose(){
        System.out.println(this.name);
        if (team != null){
            System.out.println(team.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}


