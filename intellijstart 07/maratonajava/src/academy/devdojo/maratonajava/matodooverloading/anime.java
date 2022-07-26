package academy.devdojo.maratonajava.matodooverloading;

public class anime {
    private String name;
    private String genero;
    private int epi;
    private float rate;

    public void init(String nome, String genero, int epi){
        this.name = nome;
        this.genero = genero;
        this.epi = epi;
    }

    public void init(String nome, String genero, int epi, float rate){
        this.init(nome, genero, epi);
        this.rate = rate;
    }

    public void imprime(){
        System.out.println(this.name+ this.genero+ this.epi+ this.rate);
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
}
