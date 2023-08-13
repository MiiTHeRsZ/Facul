import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        Random rand = new Random();

        int lin = rand.nextInt(4) + 2, col = rand.nextInt(4) + 2, maiorVal;

        int[][] mat = new int[lin][col];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rand.nextInt(10);
                System.out.print(mat[i][j] + " ");
            }
            System.err.println();
        }

        maiorVal = mat[0][0];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (maiorVal < mat[i][j]) {
                    maiorVal = mat[i][j];
                }
            }
        }

        System.out.println("O menor valor é " + maiorVal);

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (maiorVal == mat[i][j]) {
                    System.out.println("MatrizA[" + i + "][" + j + "] = " + maiorVal);
                }
            }
        }
    }
}
