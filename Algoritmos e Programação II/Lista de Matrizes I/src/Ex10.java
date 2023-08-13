import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Tamanho da matriz: ");
        int tam = scn.nextInt();

        int[][] mat = new int[tam][tam];
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mat[i][j] = 1;
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
