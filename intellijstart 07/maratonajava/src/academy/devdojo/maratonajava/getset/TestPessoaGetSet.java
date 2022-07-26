package academy.devdojo.maratonajava.getset;

public class TestPessoaGetSet {
    public static void main(String[] args) {
        PessoaGetSet pessoa1 = new PessoaGetSet();
        pessoa1.setName("Fernando");
        pessoa1.setAge(31);

        System.out.println(pessoa1.getName());
        System.out.println(pessoa1.getAge());
    }
}
