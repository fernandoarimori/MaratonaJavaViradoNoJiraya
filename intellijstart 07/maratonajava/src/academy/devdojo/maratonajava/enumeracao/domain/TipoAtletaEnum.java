package academy.devdojo.maratonajava.enumeracao.domain;

public enum TipoAtletaEnum {
    CLASSIC(1, "Classic"),
    BODYBUILDER(2, "Bodybuilder"),
    MROLYMPIA(3, "Mr Olympia");
    private final int ATLETAENUM;
    private final String ATLETAENUM2;

    TipoAtletaEnum(int ATLETAENUM, String ATLETAENUM2) {
        this.ATLETAENUM = ATLETAENUM;
        this.ATLETAENUM2 = ATLETAENUM2;
    }

    public static TipoAtletaEnum enumPeloAtributo(String x){
        for (TipoAtletaEnum tipoAtleta: values()){
            if(tipoAtleta.getATLETAENUM2().equals(x)){
                return tipoAtleta;
            }
        }
        return null;
    }

    public int getATLETAENUM() {
        return ATLETAENUM;
    }

    public String getATLETAENUM2() {
        return ATLETAENUM2;
    }
}
