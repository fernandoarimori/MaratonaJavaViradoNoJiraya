package academy.devdojo.maratonajava.UmPraTodosTodosPraUm.domain;

public class Team {
    private String name;
    private Bodybuilder [] bodybuilders;

    public Team(String name, Bodybuilder[] bodybuilders) {
        this.name = name;
        this.bodybuilders = bodybuilders;
    }

    public Team(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
        if (bodybuilders ==null) return;
        for (Bodybuilder bodybuilder: bodybuilders){
            System.out.println(bodybuilder.getName());
        }
    }

    //get/set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bodybuilder[] getBodybuilders() {
        return bodybuilders;
    }

    public void setBodybuilders(Bodybuilder[] bodybuilders) {
        this.bodybuilders = bodybuilders;
    }
}
