package academy.devdojo.maratonajava.HERANCA.domain;

public class FuncionarioHeranca extends PessoaHeranca {
    private float salario;

    public FuncionarioHeranca(String nome,float salario) {
        super(nome);
        this.salario = salario;
    }

    public void imprime(){
        super.imprime(); //-> método da classe pai
        System.out.println(this.salario);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
