package academy.devdojo.maratonajava.objetosemarrays.domain;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }
    //^obrigado o time a ter um nome

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
