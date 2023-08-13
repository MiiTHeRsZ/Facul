import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int[][] mat = new int[2][3];
        int res = 0;

        Random rand = new Random();

        System.out.println("Matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = rand.nextInt(16);
                res += mat[i][j];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + res);
    }
}
