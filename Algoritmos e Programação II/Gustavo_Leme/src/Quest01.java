import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] vet = new int[5];
        int maior;

        System.out.println("Digite somente números inteiros");
        for (int i = 0; i < vet.length; i++) {
            System.out.print((i + 1) + "º valor: ");
            vet[i] = scn.nextInt();
        }

        scn.close();

        System.out.println("\nVetor:");
        
        maior = vet[0];
        for (int v : vet) {
            System.out.print(v + " ");
            if (v > maior) {
                maior = v;
            }
        }

        System.out.println("\n\nO maior valor é " + maior);
    }
}
