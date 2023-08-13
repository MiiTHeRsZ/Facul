import java.util.Random;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        int x = 3, y = 3;
        int[][] mat1 = new int[x][y], mat2 = new int[x][y], matR = new int[x][y];

        Random rand = new Random();

        for (int i = 0; i < matR.length; i++) {
            for (int j = 0; j < matR.length; j++) {
                mat1[i][j] = rand.nextInt(31); 
                mat2[i][j] = rand.nextInt(31);
                matR[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(matR[i][j] + " ");
            }
            System.out.println();
        }
    }
}