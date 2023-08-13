import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        boolean verify = true;

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                vet[i] = scn.nextInt();
                for (int j = 0; j < i; j++) {
                    if (vet[i] == vet[j]) {
                        System.err.println("O valor já existe dentro do vetor, digite um valor diferente!");
                        verify = false;
                        break;
                    } else {
                        verify = true;
                    }
                }
            } while (!verify);
        }

        scn.close();

        System.out.println("Vetor:");
        for (int i : vet) {
            System.out.print(i + " ");
        }
    }
}
