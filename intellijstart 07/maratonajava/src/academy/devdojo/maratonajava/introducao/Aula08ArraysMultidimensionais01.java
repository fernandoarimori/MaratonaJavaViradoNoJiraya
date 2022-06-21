package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01{
    public static void main(String[] args) {
        int[][] test1 = new int[2][3];

        test1[0][0] = 32;
        test1[0][1] = 322;
        test1[0][2] = 1;

        test1[1][0] = 321;
        test1[1][1] = 3221;
        test1[1][2] = 11;

        for (int i = 0; i < test1.length; i++) {
            for (int j = 0; j < test1[i].length; j++) {
                System.out.println(test1[i][j]);

            }
        }

    }
}


























