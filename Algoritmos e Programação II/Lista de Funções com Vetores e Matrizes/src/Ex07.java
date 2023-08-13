import java.util.Random;

public class Ex07 {
    static int lin = 4, col = 3;
    public static void main(String[] args) {
        int[][] matA = geraMatriz();
        int[][] matB = geraMatrizTransposta(matA);

        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[i].length; j++) {
                System.out.print(matB[i][j]);
                if (j != matB[i].length - 1) {
                    System.out.print(",\t");
                }
            }
            System.out.println();
        }
    }
    
    private static int[][] geraMatriz() {
        Random rnd = new Random();
        
        int[][] mat = new int[lin][col];
        
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = rnd.nextInt(100);
            }
        }
        
        return mat;
    }

    private static int[][] geraMatrizTransposta(int[][] matA) {
        int[][] mat = new int[col][lin];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < lin; j++) {
                mat[i][j] = matA[j][i];
            }
        }

        return mat;
    }
}
