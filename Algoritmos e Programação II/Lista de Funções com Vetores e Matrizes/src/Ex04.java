import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int t = scn.nextInt();

        int[] x = new int[t];

        for (int i = 0; i < t; i++) {
            System.out.print((i + 1) + "º valor: ");
            x[i] = scn.nextInt();
        }

        scn.close();

        System.out.println("Soma dos valores do índice par no vetor: " + somaIndPar(x));
    }

    private static int somaIndPar(int[] x) {
        int qtd = 0;

        for (int i = 0; i < x.length; i++) {
            if (i %  2 == 0) {
                qtd += x[i];
            }
        }

        return qtd;
    }
}
