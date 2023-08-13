import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o quantidade de linhas da matriz: ");
        int lin = scn.nextInt();
        System.out.print("Digite o quantidade de colunas da matriz: ");
        int col = scn.nextInt();
        System.out.print("Digite um número inteiro de 0 a 50: ");
        int num = scn.nextInt();

        scn.close();

        int[][] newMat = geraMatriz(lin, col);
        
        int qtd = verificaNum(newMat, num);
        
        if (qtd <= 0) {
            System.out.println("Número não encontrado");
            System.exit(0);
        }
        
        int[][] pos = returnaPosicao(newMat, num, qtd);
        
        System.out.println("\nO número foi encontrado " + qtd + " vezes.");
        System.out.println("Nas seguintes posições: ");
        for (int i = 0; i < pos.length; i++) {
            System.out.println("Linha " + pos[i][0] + " e Coluna " + pos[i][1]);
        }
    }
    
    private static int[][] geraMatriz(int lin, int col) {
        Random rnd = new Random();

        int[][] mat = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = rnd.nextInt(51);
            }
        }

        return mat;
    }

    private static int verificaNum(int[][] newMat, int num) {
        int qtd = 0;

        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[i].length; j++) {
                if (newMat[i][j] == num) {
                    qtd++;
                }
            }
        }

        return qtd;
    }

    private static int[][] returnaPosicao(int[][] newMat, int num, int qtd) {
        int[][] pos = new int[qtd][2];
        int x = 0;

        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[i].length; j++) {
                if (newMat[i][j] == num) {
                    pos[x][0] = i; 
                    pos[x][1] = j;
                    x++; 
                }
            }
        }

        return pos;
    }
}
