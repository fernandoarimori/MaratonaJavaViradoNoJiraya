package academy.devdojo.maratonajava.estaticos.domain;

public class Bodybuilder {
    private String name;
    private char pecs;
    private String pelo;
    private boolean hairy;
    private static String body = "muscular";
    private float height;

    static{
        System.out.println("MUSCLE FREAK SHOW!");
    }
    {
        System.out.println("MUSCLE FREAK");
    }

    public Bodybuilder(String name, char pecs, float height, String pelo) {
        this.name = name;
        this.pecs = pecs;
        this.height = height;
        this.pelo = pelo;
    }

    public Bodybuilder(String name, char pecs, float height, String pelo, boolean hairy) {
        this(name, pecs, height, pelo);
        this.hairy = hairy;
    }

    public void getHairy(Bodybuilder x){
        x.hairy=true;
        if (x.hairy == true) {
            x.pelo = "hairy";
        }
    }

    public void turnIntoBulking(Bodybuilder x){
        x.pecs = 'Z';
        System.out.println(x.name +"has " +x.height + "kg but he feels he's getting more mass, muscle gut growing");
        x.height = x.height + 200f;
        x.hairy = true;
        x.getHairy(x);
        System.out.println("Now "+ x.name+ " got fucking " +x.height+"kg get "+ this.pelo+" and poses for the camera");
    }

    public void pose(Bodybuilder x){
        System.out.println(this.name);
        System.out.println(this.pecs);
        System.out.println(this.height);
        System.out.println(this.pelo);
        System.out.println(this.hairy);
        System.out.println(Bodybuilder.body);
    }



    //get/set


    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPecs() {
        return pecs;
    }

    public void setPecs(char pecs) {
        this.pecs = pecs;
    }

    public boolean isHairy() {
        return hairy;
    }

    public void setHairy(boolean hairy) {
        this.hairy = hairy;
    }

    public static String getBody() {
        return body;
    }

    public static void setBody(String body) {
        Bodybuilder.body = body;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}




