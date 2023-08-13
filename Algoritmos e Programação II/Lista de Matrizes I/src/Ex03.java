import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random rand = new Random();

        int lin = rand.nextInt(4) + 2, col = rand.nextInt(4) + 2, total = 0;

        int[][] mat = new int[lin][col];
        int[] vet = new int[lin];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = rand.nextInt(10);
            }
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                total += mat[i][j];
            }
            vet[i] = total;
            total = 0;
        }

        for (int[] m : mat) {
            for (int f : m) {
                System.out.print(f + " ");
            }
            System.out.println("= " + vet[total]);
            total++;
        }
    }
}
