import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random rand = new Random();

        int lin = rand.nextInt(4) + 2, col = rand.nextInt(4) + 2;

        int[][] matA = new int[lin][col], matB = new int[lin][col], matC = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matA[i][j] = rand.nextInt(10);
                matB[i][j] = rand.nextInt(10);
                matC[i][j] = matA[i][j] - matB[i][j];
            }
        }

        System.out.println("Matriz A - Matriz B = Matriz C\n");

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(matA[i][j] + " - " + matB[i][j] + " = " + matC[i][j]);
            }
        }

    }
}
