package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.test;

public class RuntimeExcerptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println(abreConexao());
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Erro ao escrever no aquivo");
            String x = "Conexao aberta";
            return x;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fecha o o recurso liberado pelo SO");
        }
        return null;
    }
}

