package academy.devdojo.maratonajava.blocoinicializacao.test;

import academy.devdojo.maratonajava.blocoinicializacao.domain.Desenho;

public class DesenhoTest {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        for (int episodio: desenho.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
