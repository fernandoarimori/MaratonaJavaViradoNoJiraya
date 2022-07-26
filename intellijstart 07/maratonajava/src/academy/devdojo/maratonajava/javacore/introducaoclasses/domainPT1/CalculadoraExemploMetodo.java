package academy.devdojo.maratonajava.javacore.introducaoclasses.domainPT1;


public class CalculadoraExemploMetodo {
    public void somaDoiNumeros(){
        System.out.println(10+10);
    }

    public void diminuiDoiNumeros(){
        System.out.println(89-40);
    }

    public void multiplicaoDeDoiNumerosAleatorios(int x, int y){
        System.out.println(x*y);
    }

    public double divisaoDoisNumeros(double div1, double div2){
        if(div2==0){
            System.out.println("Esse numero e invalido");
            return 0;
        }
        return (div1/div2);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int cont: numeros){
            soma += cont;
        }
        System.out.println(soma);
    }

}
