package academy.devdojo.maratonajava.exercicioassiciacao.domain;

public class Aluno {
    private String nome;
    private int idade;

    private Seminario seminario;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(Aluno x){
        System.out.println(x.nome);
        System.out.println(x.idade);
        if(x.seminario != null){
            System.out.println(seminario.getNome());
        }else {
            System.out.println("Este alunon nao esta cadastrado em nenhum seminario");
        }
        System.out.println("--------");
    }

    //get.set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
