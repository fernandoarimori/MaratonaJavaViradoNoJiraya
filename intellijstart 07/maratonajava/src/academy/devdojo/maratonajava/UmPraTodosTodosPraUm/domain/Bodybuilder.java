package academy.devdojo.maratonajava.UmPraTodosTodosPraUm.domain;

public class Bodybuilder {
    private String name;
    private Team team;

    public Bodybuilder(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
        if (team ==null) return;
        System.out.println(team.getName());
        }


    //get/set

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
