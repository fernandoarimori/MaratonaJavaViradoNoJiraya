package academy.devdojo.maratonajava.ClassesUtilitarias.strings.test;

public class StringPerformace {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        contagem(100_000);
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start) + "ms");


        System.out.println("-------------------");
        start = System.currentTimeMillis();
        contagemBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + "ms");


        System.out.println("-------------------");
        start = System.currentTimeMillis();
        contagemBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + "ms");

    }

    public static void contagem(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += 1;
        }
    }

    public static void contagemBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void contagemBuffer(int tamanho) {
        StringBuffer sbr = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbr.append(i);
        }
    }

}
