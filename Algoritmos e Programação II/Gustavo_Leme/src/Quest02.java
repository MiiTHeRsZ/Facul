import java.util.Random;

public class Quest02 {
    public static void main(String[] args) {
        Random rdn = new Random();

        int[][] mat = new int[4][4];
        int qtdPares = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rdn.nextInt(10);
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 0 && mat[i][j] != 0) {
                    qtdPares++;
                }
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        if (qtdPares > 0) {
            System.out.println("Há " + qtdPares + " número(s) par(es)");
        } else {
            System.out.println("Não há números pares");
        }
    }
}
