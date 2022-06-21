package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionaispt03 {
    public static void main(String[] args) {
        int[][]  arrayOne = new int[3][];
        arrayOne[0] = new int [2];
        arrayOne[1] = new int [3];
        arrayOne[2] = new int [1];

        for(int[] counT : arrayOne){
            System.out.print("\n");
            for (int num: counT){
                System.out.print(" " + num);
            }
        }


        System.out.println("------------------");

        arrayOne[0] = new int [2];
        arrayOne[1] = new int []{40, 54, 23};
        arrayOne[2] = new int []{11111};

        for(int[] counT : arrayOne){
            System.out.print("\n");
            for (int num: counT){
                System.out.print(" " + num);
            }
        }


        System.out.println("------------------");

        int[][] arrayInt2 = {{1,2,3}, {4,3}, {3,1,2}};

        for(int[] counT : arrayInt2){
            System.out.print("\n");
            for (int num: counT){
                System.out.print(" " + num);
            }
        }


    }
}
