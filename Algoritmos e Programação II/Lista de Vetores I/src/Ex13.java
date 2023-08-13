import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        double[] vet1 = new double[10], vet2 = new double[vet1.length];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Digite o " + (i + 1) + " º valor: ");
            vet1[i] = scn.nextDouble();
            vet2[i] = Math.pow(vet1[i], 2);
        }

        scn.close();

        System.out.println("\nVetor");
        for (double d : vet1) {
            System.out.print(d + " ");
        }
        System.out.println("\n\nVetor ao quadrado");
        for (double d : vet2) {
            System.out.printf("%.2f ", d);
        }
        System.out.println("\n");
    }
}
