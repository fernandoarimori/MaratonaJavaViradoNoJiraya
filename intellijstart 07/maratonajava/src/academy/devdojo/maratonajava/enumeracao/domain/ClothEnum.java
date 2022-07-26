package academy.devdojo.maratonajava.enumeracao.domain;

public enum ClothEnum {
    UNDERWEAR {
        @Override
        public String tipoDePose(String pose) {
            pose = "Souble bi";
            return pose;
        }
    },
    SHINY_TRUNK {
        @Override
        public String tipoDePose(String pose) {
            pose = "MASSIVE LADS";
            return pose;
        }
    };


    public abstract String tipoDePose(String pose);
}
