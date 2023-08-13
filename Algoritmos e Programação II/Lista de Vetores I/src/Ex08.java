import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int[] vet = new int[6];
        boolean verify = false;

        Scanner scn = new Scanner(System.in);

        System.err.println("Digite valores PARES\n");
        for (int i = 0; i < vet.length; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                vet[i] = scn.nextInt();
                if (vet[i] % 2 != 0) {
                    System.err.println("Digite APENAS valores PARES!");
                    verify = false;
                } else {
                    verify = true;
                }
            } while (!verify);
        }
        System.out.println("\nValores do Vetor");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("\nValores do Vetor inverso");
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        scn.close();
    }
}
