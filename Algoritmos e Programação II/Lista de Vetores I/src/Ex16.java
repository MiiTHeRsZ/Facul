import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int n;
        double res = 0;

        Scanner scn = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        n = scn.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vet[i] = scn.nextDouble();
            res += vet[i];
        }

        scn.close();

        System.out.printf("\nA média aritmética dos valores no vetor é: %.2f\n", (res / n));
    }
}
