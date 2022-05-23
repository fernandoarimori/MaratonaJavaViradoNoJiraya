package academy.devdojo.maratonajava;

public class operadorternari {
    public static void main(String[] args) {
        int age=20;

        String resp = age<15 ? "você é um juvenil" : age>=15 && age>18 ? "Vcoê é prejuvenil" : "você é veio";
        System.out.println(resp);
    }
}
