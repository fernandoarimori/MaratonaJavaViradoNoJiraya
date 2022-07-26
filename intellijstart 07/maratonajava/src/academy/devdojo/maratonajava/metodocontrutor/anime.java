package academy.devdojo.maratonajava.metodocontrutor;

public class anime {
    private String name;
    private String genero;
    private int epi;
    private float rate;
    private String studio;

    public anime(String nome, String genero, int epi, float rate){
        this.name = nome;
        this.genero = genero;
        this.epi = epi;
        this.rate = rate;
    }

    public anime(String nome, String genero, int epi, float rate, String studio){
        this(nome, genero, epi, rate);
        this.studio = studio;
    }

    public anime(){
        System.out.println("Contrutor dentro do contrutor");
    }





    public void imprime(){
        System.out.println(this.name+" "+ this.genero+" "+ this.epi+" "+ this.rate+" "+this.studio);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpi() {
        return epi;
    }

    public void setEpi(int epi) {
        this.epi = epi;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
