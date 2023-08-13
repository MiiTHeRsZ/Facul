import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int aux;
        int[] vet = new int[8];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vet[i] = scn.nextInt();
        }
        
        aux = vet[0];
        for (int x : vet) {
            if (aux <= x) {
                aux = x;
            }
        }
        System.out.println("O(s) maior(es) valor(es) está(ão) na(s) posição(ões): ");
        for (int i = 0; i < vet.length; i++) {
            if (aux == vet[i]) {
                System.out.println(i + " do vetor");                
            }
        }
        scn.close();
    }
}
