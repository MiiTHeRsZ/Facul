import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Random rand = new Random();

        int lin = rand.nextInt(4) + 2, col = rand.nextInt(4) + 2, menorVal;

        int[][] mat = new int[lin][col];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rand.nextInt(100);
            }
        }

        menorVal = mat[0][0];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (menorVal > mat[i][j]) {
                    menorVal = mat[i][j];
                }
            }
        }

        System.out.println("O menor valor é " + menorVal);
    }
}
