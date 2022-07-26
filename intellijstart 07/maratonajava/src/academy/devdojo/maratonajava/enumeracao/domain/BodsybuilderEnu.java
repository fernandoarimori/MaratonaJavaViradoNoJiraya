package academy.devdojo.maratonajava.enumeracao.domain;

public class BodsybuilderEnu {
    private String nome;
    private TipoAtletaEnum tipoAtletaEnum;
    private ClothEnum clothEnum;


    public BodsybuilderEnu(String nome, TipoAtletaEnum tipoAtletaEnum, ClothEnum clothEnum) {
        this.nome = nome;
        this.tipoAtletaEnum = tipoAtletaEnum;
        this.clothEnum = clothEnum;
    }

    @Override
    public String toString() {
        return "BodsybuilderEnu{" +
                "nome='" + nome + '\'' +
                ", tipoAtletaEnum=" + tipoAtletaEnum.getATLETAENUM() +
                ", tipoAtletaEnum2=" + tipoAtletaEnum.getATLETAENUM2() +
                ", clothEnum=" + clothEnum +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public TipoAtletaEnum getTipoAtletaEnum() {
        return tipoAtletaEnum;
    }



    public ClothEnum getClothEnum() {
        return clothEnum;
    }
}
