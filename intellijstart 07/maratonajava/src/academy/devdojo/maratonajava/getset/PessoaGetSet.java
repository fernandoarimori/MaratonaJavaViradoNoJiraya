package academy.devdojo.maratonajava.getset;

public class PessoaGetSet {
    private String name;
    private int age;

    public void setName(String  name){
        this.name=name;
    }

    public void setAge(int age){
        if(age<=0){
            System.out.println("Idade invalida");
            return;
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

}


