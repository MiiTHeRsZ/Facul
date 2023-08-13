import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int x = 5, y = 3;
        int[][] mat = new int[x][y], transMat = new int[y][x];

        Random rand = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat[i][j] = rand.nextInt(11);
                transMat[j][i] = mat[i][j];
            }
        }
        System.out.println("Matriz Original:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(transMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
