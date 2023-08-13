import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
        Random rand = new Random();

        int lin = rand.nextInt(4) + 2, col = rand.nextInt(4) + 2;

        int[][] matA = new int[lin][col], matB = new int[col][lin], matC = new int[lin][lin];

        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                matA[i][j] = rand.nextInt(10);
                System.out.print(matA[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[i].length; j++) {
                matB[i][j] = rand.nextInt(10);
                System.out.print(matB[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matC.length; i++) {
            for (int j = 0; j < matC[i].length; j++) {
                matC[i][j] = 0;
                for (int k = 0; k < matA[i].length; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
