import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = 3, totalLin = 0, totalCol = 0, totalDiagP = 0, totalDiagS = 0;
        int[] subTotal = new int[t];
        int[][] mat = new int[t][t];
        boolean verify = false;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print("Matriz[" + i + "][" + j + "] = ");
                mat[i][j] = scn.nextInt();
            }
        }

        scn.close();

        while (!verify) {
            for (int i = 0; i < t; i++) {
                subTotal[i] = 0;
            }
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < t; j++) {
                    subTotal[i] += mat[i][j];
                }
                totalLin += subTotal[i];
            }
            totalLin /= t;
            if (totalLin != subTotal[0]) {
                break;
            }

            for (int i = 0; i < t; i++) {
                subTotal[i] = 0;
            }
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < t; j++) {
                    subTotal[i] += mat[j][i];
                }
                totalCol += subTotal[i];
            }
            totalCol /= t;
            if (totalCol != subTotal[0]) {
                break;
            }

            for (int i = 0, j = 0; i < t; i++, j++) {
                totalDiagP += mat[i][j];
            }
            if (totalDiagP != subTotal[0]) {
                break;
            }

            for (int i = 0, j = t - 1; i < t; i++, j--) {
                totalDiagS += mat[i][j];
            }
            if (totalDiagS != subTotal[0]) {
                break;
            }

            if (totalLin == totalCol && totalDiagP == totalDiagS && totalLin == totalDiagP) {
                verify = true;
            } else {
                break;
            }
        }

        if (verify) {
            System.out.println("É uma matriz quadrada!");
        } else {
            System.err.println("Não é uma matriz quadrada!");
        }
    }
}
