package academy.devdojo.maratonajava.objetosemarrays.domain;

public class Probbder {
    private String name;
    private Trunksdobbder[] trunks;


    public void pose() {
        System.out.println(this.name + " can choose:");
        if (trunks != null) {
            for (Trunksdobbder trunk : trunks) {
                System.out.println(trunk.getType());
            }
            System.out.println("to pose");
        }
    }

    public Probbder(String name, Trunksdobbder[] trunks) {
        this.name = name;
        this.trunks = trunks;
    }

    public Probbder(String name) {
        this.name = name;
    }

    public Probbder(Trunksdobbder[] trunks) {
        this.trunks = trunks;
    }

    public Trunksdobbder[] getTrunks() {
        return trunks;
    }

    public void setTrunks(Trunksdobbder[] trunks) {
        this.trunks = trunks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
