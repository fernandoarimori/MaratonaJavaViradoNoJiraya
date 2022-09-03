package academy.devdojo.maratonajava.ClasseAbstratas.domain;

public class Baleia extends Mamifero {
    public Baleia(String name, String quantidadePelo) {
        super(name, quantidadePelo);
    }

    @Override
    public void somQueFaz() {
        System.out.println("MOOOORRR!!");
    }

    public TipoMamiferos tipoMamiferos;

    public Baleia(String name, String quantidadePelo, TipoMamiferos tipoMamiferos) {
        super(name, quantidadePelo);
        this.tipoMamiferos = tipoMamiferos;
    }

    @Override
    public String toString() {
        return "Baleia{" +
                "tipoMamiferos=" + tipoMamiferos +
                ", name='" + name + '\'' +
                ", quantidadePelo='" + quantidadePelo + '\'' +
                '}';
    }

    public TipoMamiferos getTipoMamiferos() {
        return tipoMamiferos;
    }

    public void setTipoMamiferos(TipoMamiferos tipoMamiferos) {
        this.tipoMamiferos = tipoMamiferos;
    }
}
