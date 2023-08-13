import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int res = 0;

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = rand.nextInt(11);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int y = 1;
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < y; j++) {
                res += mat[i][j];
            }
            y++;
        }
        System.out.println("\nA soma dos elementos abaixo da diagonal da matriz é: " + res);
    }
}
/*
    0  1  2  3
  0
  1 01
  2 02 12
  3 03 13 23
 */
