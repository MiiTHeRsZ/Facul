import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char carac;

        System.out.print("Digite um carácter: ");
        carac = scn.next().charAt(0);
        System.out.print("Digite o quantidade de linhas da matriz: ");
        int lin = scn.nextInt();
        System.out.print("Digite o quantidade de colunas da matriz: ");
        int col = scn.nextInt();

        scn.close();

        char[][] newMat = geraMatriz(carac, lin, col);

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] geraMatriz(char carac, int lin, int col) {
        char[][] mat = new char[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = carac;
            }
        }

        return mat;
    }
}
