import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(5) + 1, verify = 0;

        int[][] matA = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matA[i][j] = rand.nextInt(50);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int x = 0; x < n; x++) {
                    for (int y = 0; y < n; y++) {
                        if (matA[i][j] == matA[x][y]) {
                            verify++;
                        }
                    }
                }
            }
        } 

        if (verify > n * n) {
            System.out.println("Há elementos repetidos na matriz");
        } else {
            System.out.println("Não há elementos repetidos na matriz");
        }
    }
}