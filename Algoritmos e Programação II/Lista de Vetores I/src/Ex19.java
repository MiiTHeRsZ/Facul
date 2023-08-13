import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        double[] vet1 = new double[5], vet2 = new double[5];
        double res;

        Scanner scn = new Scanner(System.in);

        System.out.println("Vetor 1");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º valor: ");
            vet1[i] = scn.nextDouble();
        }

        System.out.println("\nVetor 2");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º valor: ");
            vet2[i] = scn.nextDouble();
        }

        scn.close();

        System.out.println("\nNas respectivas posições:\n*A soma dos elementos de cada vetor");
        for (int i = 0; i < 5; i++) {
            res = vet1[i] + vet2[i];
            System.out.println((i + 1) + "ª posição: " + res);
        }
        System.out.println("\n*A diferença dos elementos de cada vetor");
        for (int i = 0; i < 5; i++) {
            res = vet1[i] - vet2[i];
            System.out.println((i + 1) + "ª posição: " + res);
        }
        System.out.println("\n*O produto dos elementos de cada vetor");
        for (int i = 0; i < 5; i++) {
            res = vet1[i] * vet2[i];
            System.out.println((i + 1) + "ª posição: " + res);
        }
        System.out.println("\n*A divisão dos elementos de cada vetor");
        for (int i = 0; i < 5; i++) {
            res = vet1[i] / vet2[i];
            System.out.println((i + 1) + "ª posição: " + res);
        }
    }
}
