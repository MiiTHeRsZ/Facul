import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        float[] vet = new float[20];
        float res = 0;

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vet[i] = scn.nextFloat();
            res += vet[i];
        }
        
        res /= vet.length;

        System.out.println("\nA média aritmética é: " + res + "\n");

        for (int i = 0; i < vet.length; i++) {
            if(vet[i] <= res){
                System.out.println("Vetor[" + i + "] = " + vet[i]);
            }
        }

        scn.close();
    }
}
