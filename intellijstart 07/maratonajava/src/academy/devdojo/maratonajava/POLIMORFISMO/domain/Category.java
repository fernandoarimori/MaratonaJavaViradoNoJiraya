package academy.devdojo.maratonajava.POLIMORFISMO.domain;

public enum Category {
    NAO_PARTICIPANTE("Nao participante"),
    CLASSIC("Classic"),
    BODYBUILDER("Bodybuilder");

    public final String CATEGORY;

    Category(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }
}
