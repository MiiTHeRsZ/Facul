import java.util.Scanner;

public class Ex03 {
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

        System.out.println("Quantidade de números ímpares no vetor: " + qtdImpar(x));
    }

    private static int qtdImpar(int[] x) {
        int qtd = 0;

        for (int i : x) {
            if (i % 2 != 1) {
                qtd++;
            }
        }

        return qtd;
    }
}
