import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int count = 0;
        int[] vet = new int[10];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vet[i] = scn.nextInt();
            if (vet[i] < 0) {
                count++;
            }
        }

        System.out.println("No vetor, existem " + count + " números negativos.");

        scn.close();
    }
}
