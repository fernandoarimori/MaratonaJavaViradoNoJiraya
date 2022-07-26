package academy.devdojo.maratonajava.exercicioassiciacao.domain;

public class Seminario {
    private String nome;
    private Professor professor;
    private String local;
    private Aluno alunos[];

    public Seminario(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario (String nome, String local, Aluno alunos[]){
        this(nome, local);
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.nome);
        if(this.professor != null){
            System.out.println("Apresentado por" + professor.getNome());
        }else {
            System.out.println("Seminario cancelado! (Sem professor)");
            return;
        }
        if (alunos == null) return;
        System.out.println("Lista de alunos presentes: ");
        for (Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
        System.out.println("---------");
    }

//get/set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
