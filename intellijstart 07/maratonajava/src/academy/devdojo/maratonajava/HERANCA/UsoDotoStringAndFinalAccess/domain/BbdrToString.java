package academy.devdojo.maratonajava.HERANCA.UsoDotoStringAndFinalAccess.domain;

public class BbdrToString extends Category {
    private String name;
    public static final String SIZE = "MASSIVE";
    public final Trunktype TRUNKTYPE = new Trunktype();

 //   @Override
    //   public void imprime(){
//        Não da para subsescrever mesmo com notation @Override, porque na superclasse Category o método tem
//    modificador de acesso final.
    //   }

    @Override
    public String toString() {
        return "BbdrToString{" +
                "name='" + name + '\'' + this.SIZE +
                '}';
    }


    public BbdrToString(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
