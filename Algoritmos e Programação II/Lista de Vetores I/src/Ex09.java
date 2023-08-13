import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        float res;
        float[] vet = new float[10];
        boolean verify = false;

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vet[i] = scn.nextFloat();
        }

        do {
            System.out.print("\nDigite um número a ser encontrado dentre os valores: ");
            res = scn.nextFloat();

            for (int i = 0; i < vet.length; i++) {
                if (res == vet[i]) {
                    System.out.println("\nVetor[" + i + "] = " + vet[i]);
                    verify = true;
                }
            }

            if (!verify) {
                System.err.println("\nO valor inserido não corresponde a nenhum dos valores anteriormente digitado!!\nDigite novamente!\n");
            }
        } while (!verify);

        scn.close();
    }
}
