package academy.devdojo.maratonajava.ClasseAbstratas.domain;

public enum TipoMamiferos {
    AQUATICO{
        @Override
        public String habitatDeCada() {
            String x;
            x = "Aquatico";
            return x;
        }
    },
    TERRESTRE{
        @Override
        public String habitatDeCada() {
            String x;
            x = "Terrestre";
            return x;
        }
    };

    public abstract String habitatDeCada();

}
