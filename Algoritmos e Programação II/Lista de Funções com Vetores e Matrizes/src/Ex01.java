import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        verify();
    }

    static void verify() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int x = scn.nextInt();

        int n;
        int[] vet = new int[x];

        boolean ver = false;

        System.out.println("Digite valores de 1 a 100!");

        for (int i = 0; i < x; i++) {
            do {
                System.out.print((i + 1) + "º valor: ");
                vet[i] = scn.nextInt();
                if (vet[i] > 0 && vet[i] <= 100) {
                    ver = true;
                } else {
                    System.out.println("Apenas de 1 a 100");
                    ver = false;
                }
            } while (!ver);
        }
        
        do {
            System.out.print("Valor que deseja encontrar no vetor: ");
            n = scn.nextInt();
            if (n > 0 && n <= 100) {
                ver = true;
            } else {
                System.out.println("Apenas de 1 a 100");
                ver = false;
            }
        } while (!ver);
        
        scn.close();

        ver = false;
        for (int i = 0; i < x; i++) {
            if (vet[i] == n) {
                System.out.println("Vetor[" + i + "] = " + vet[i]);
                ver = true;
            }
        }

        if (!ver) {
            System.out.println("-1");
        }
    }
}
