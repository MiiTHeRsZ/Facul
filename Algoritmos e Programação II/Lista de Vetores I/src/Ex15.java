import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        double[] vet = new double[5];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º salário: R$");
            vet[i] = scn.nextDouble();
            if (vet[i] < 1000) {
                vet[i] *= 1.1;
            }
        }
        scn.close();

        System.out.println("\nSalários atualizados");
        for (double d : vet) {
            System.out.printf("R$%.2f\n", d);
        }
    }
}
