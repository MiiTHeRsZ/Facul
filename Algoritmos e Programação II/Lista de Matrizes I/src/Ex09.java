import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Linhas: ");
        int lin = scn.nextInt();
        System.out.print("Colunas: ");
        int col = scn.nextInt();

        int[][] mat = new int[lin][col];
        int[] resLin = new int[lin], resCol = new int[col];
        int resIndImpar = 0, resPar = 0, resImpar = 0, resDiagP = 0, resDiagS = 0, num, qtd = 0;

        for (int i = 0; i < lin; i++) {
            resLin[i] = 0;
        }

        for (int i = 0; i < col; i++) {
            resCol[i] = 0;
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Matriz[" + i + "][" + j + "] = ");
                mat[i][j] = scn.nextInt();
                if (mat[i][j] % 2 == 0) {
                    resPar += mat[i][j];
                } else {
                    resImpar += mat[i][j];
                }
                if (i % 2 != 0 && j % 2 != 0) {
                    resIndImpar += mat[i][j];
                }
            }
        }

        System.out.print("Valor que deseja encontrar na matriz: ");
        num = scn.nextInt();

        scn.close();

        if (lin == col) {
            for (int i = 0, j = 0, k = lin - 1; i < lin; i++, j++, k--) {
                resDiagP = mat[i][j];
                resDiagS = mat[k][j];
            }
        }

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                resLin[i] += mat[i][j];
            }
        }
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < lin; j++) {
                resCol[i] += mat[j][i];
            }
        }

        System.out.println("\nSoma dos elementos pares da matriz: " + resPar);
        System.out.println("\nSoma dos elementos dos índices ímpares da matriz: " + resIndImpar);
        System.out.println("\nSoma dos elementos ímpares da matriz: " + resImpar);
        System.out.println("\nNúmero que deseja encontrar: " + num);
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (num == mat[i][j]) {
                    System.out.println("Matriz[" + i + "][" + j + "] = " + mat[i][j]);
                    qtd++;
                }
            }
        }
        System.out.println("Quantidade: " + qtd);

        if (lin == col) {
            System.out.println("\nSoma da diagonal principal: " + resDiagP + "\n\nSoma da diagonal secundária: " + resDiagS);
        } else {
            System.out.println("\nNão é uma matriz quadrada!");
        }

        qtd = 1;
        System.out.println("\nSoma de todos os elementos de cada linha: ");
        for (int l : resLin) {
            System.out.println("Linha " + qtd + ": " + l);
            qtd++;
        }

        qtd = 1;
        System.out.println("\nSoma de todos os elementos de cada coluna: ");
        for (int c : resCol) {
            System.out.println("Coluna " + qtd + ": " + c);
            qtd++;
        }
    }
}
