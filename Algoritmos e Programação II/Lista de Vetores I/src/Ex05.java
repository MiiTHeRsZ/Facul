import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int tamVet;

        Scanner scn = new Scanner(System.in);

        System.out.print("Qual o tamanho do vetor: ");
        tamVet = scn.nextInt();

        int[] vet1 = new int[tamVet], vet2 = new int[vet1.length];

        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vet1[i] = scn.nextInt();
        }

        for (int i = 0, x = vet2.length - 1; i < vet2.length; i++, x--) {
            vet2[i] = vet1[x];
        }

        System.out.println("Vetor 1");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + " ");
        }
        System.out.println("\nVetor 2");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print(vet2[i] + " ");
        }
        System.err.println();
        scn.close();
    }
}
