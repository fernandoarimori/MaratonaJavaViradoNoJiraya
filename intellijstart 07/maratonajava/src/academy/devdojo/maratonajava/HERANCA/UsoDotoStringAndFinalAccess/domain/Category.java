package academy.devdojo.maratonajava.HERANCA.UsoDotoStringAndFinalAccess.domain;

public class Category {
    private String category;

    public final void imprime(){
        System.out.println(this.category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
