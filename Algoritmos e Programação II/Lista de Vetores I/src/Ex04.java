import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int[] vet1 = new int[5], vet2 = new int[vet1.length];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vet1[i] = scn.nextInt();
        }

        vet1 = vet2;

        System.out.println("Vetor 1");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i] + " ");
        }
        System.out.println("Vetor 2");
        for (int i = 0; i < vet2.length; i++) {
            System.out.println(vet2[i] + " ");
        }
        scn.close();
    }
}
