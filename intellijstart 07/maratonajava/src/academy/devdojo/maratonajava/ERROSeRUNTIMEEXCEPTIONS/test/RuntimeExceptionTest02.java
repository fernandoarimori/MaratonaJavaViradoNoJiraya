package academy.devdojo.maratonajava.ERROSeRUNTIMEEXCEPTIONS.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(dividir(1, 0));
        System.out.println("---");
    }


    private static int dividir(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Divisor nao pode ser zero");
        }
        return a / b;
    }
}
