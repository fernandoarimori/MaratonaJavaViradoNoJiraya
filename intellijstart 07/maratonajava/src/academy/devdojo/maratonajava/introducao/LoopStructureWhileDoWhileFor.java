package academy.devdojo.maratonajava.introducao;

public class LoopStructureWhileDoWhileFor {
    public static void main(String[] args) {
        int i = 0;

        while(i<=10){
            System.out.println("Only while "+ i++);
        }


        int e = 0;

        do{
            System.out.println("Inside do-while " + ++e);
        }while(e<=10);


        for(int count =0;count <=10;count +=2){
            System.out.println("For = "+ count);
        }
    }
}
