import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int count = 0;
        int[] vet = new int[10];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + " º valor: ");
            vet[i] = scn.nextInt();
            if (vet[i] % 2 == 0) {
                count++;
            }
        }

        scn.close();

        System.out.println("No vetor, existe(m) " + count + " número(s) par(es).");
        
        if (count != 0) {
            System.out.println("\nVetor");
            for (int i = 0; i < vet.length; i++) {
                if (vet[i] % 2 == 0) {
                    System.out.println("Vetor[" + i + "] = " + vet[i]);
                }
            }
        }
    }
}
