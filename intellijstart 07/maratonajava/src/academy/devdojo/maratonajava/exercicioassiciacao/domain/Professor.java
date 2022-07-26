package academy.devdojo.maratonajava.exercicioassiciacao.domain;

public class Professor {
    private String nome;
    private String esp;

    private Seminario[] seminarios;

    public Professor(String nome, String esp, Seminario[] seminarios) {
        this.nome = nome;
        this.esp = esp;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println("Espacializado em: " + this.esp);
        if (this.seminarios == null) {
            System.out.println("Nao esta presente em nenhum seminario");
            return;
        } else {
            System.out.println("Estara nos seminarios: ");
            for (Seminario seminarios: seminarios){
                System.out.println(seminarios.getNome());
            }
        }
        System.out.println("--------");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
