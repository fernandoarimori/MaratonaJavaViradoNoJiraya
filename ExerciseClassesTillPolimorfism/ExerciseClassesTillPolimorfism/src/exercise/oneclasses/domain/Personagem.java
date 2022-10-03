package exercise.oneclasses.domain;

public abstract class Personagem {
    protected String name;
    protected int age;
    protected Sex sex;
    protected BodyType bodyType;
    protected Cloth cloth;

//    public Personagem(String name, int age, Sex sex, BodyType bodyType, Cloth cloth) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.bodyType = bodyType;
//        this.cloth = cloth;
//    }

    public enum Cloth{
        SHIRT_AND__JEANS("Shirt and jeans"),
        SHORTS("Shorts"),
        UNDERWEAR("Underwear"),
        SETIN_POSING_TRUNK("Setin posing trunks"),
        SINGLET("Singlet"),
        BIKINI("Bikini");

        Cloth(String cloth) {
        }
    }

}
