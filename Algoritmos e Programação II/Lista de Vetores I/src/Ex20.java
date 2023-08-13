import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        double[] vet1 = new double[5], vet2 = new double[5];
        double res;
        boolean verify = true;

        Scanner scn = new Scanner(System.in);

        System.out.println("Vetor 1");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                vet1[i] = scn.nextInt();
                for (int j = 0; j < i; j++) {
                    if (vet1[i] == vet1[j]) {
                        System.err.println("O valor já existe dentro do vetor, digite um valor diferente!");
                        verify = false;
                        break;
                    } else {
                        verify = true;
                    }
                }
            } while (!verify);
        }

        System.out.println("\nVetor 2");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                vet2[i] = scn.nextInt();
                for (int j = 0; j < i; j++) {
                    if (vet2[i] == vet2[j]) {
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

        System.out.println("\n*A soma dos elementos dos vetores 1 e 2");
        for (int i = 0; i < 5; i++) {
            res = vet1[i] + vet2[i];
            System.out.println((i + 1) + "ª posição: " + res);
        }
        System.out.println("\n*O produto dos elementos dos vetores 1 e 2");
        for (int i = 0; i < 5; i++) {
            res = vet1[i] * vet2[i];
            System.out.println((i + 1) + "ª posição: " + res);
        }
        System.out.println("\n*A diferença dos elementos dos vetores 1 e 2");
        for (int i = 0; i < 5; i++) {
            res = vet1[i] - vet2[i];
            System.out.println((i + 1) + "ª posição: " + res);
        }
        System.out.println("\n*Elementos presentes nos vetores 1 e 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (vet1[i] == vet2[j]) {
                    System.out.println(vet1[i]);
                }
            }
        }
        System.out.println("\n*A junção dos elementos não repetidos dos vetores 1 e 2");
        for (double d : vet1) {
            System.out.println(d);
        }
        for (double x : vet2) {
            for (double y : vet1) {
                if (x == y) {
                    verify = false;
                    break;
                } else {
                    verify = true;
                }
            }
            if (verify) {
                System.out.println(x);
            }
        }
    }
}
