import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        int[] vet = new int[10];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vet[i] = scn.nextInt();
        }
        System.out.print("\nVetor: "); 
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");   
        }
        scn.close();
    }
}
