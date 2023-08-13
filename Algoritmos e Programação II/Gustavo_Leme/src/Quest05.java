import java.util.Random;

public class Quest05 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int lin = 4, col = 3;
        int[][] matA = new int[lin][col];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                matA[i][j] = rnd.nextInt(75);
            }
        }
        
        int[][] matB = matrizTransp(matA, lin, col);
        
        System.out.println("Matriz A");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz B");
        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[i].length; j++) {
                System.out.print(matB[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] matrizTransp(int[][] matA, int lin, int col) {
        int[][] matB = new int[col][lin];

        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[i].length; j++) {
                matB[i][j] = matA[j][i];
            }
        }

        return matB;
/* 
        1 2 3 4     1 5 8
        5 6 3 8     2 6 3
        8 3 6 3     3 3 6
                    4 8 3 */
    }
}
