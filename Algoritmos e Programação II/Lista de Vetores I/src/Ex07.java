import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        float[] vet = new float[10];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vet[i] = scn.nextFloat();
        }

        float aux = vet[0];

        for (int i = 0; i < vet.length; i++) {
            if(aux < vet[i]){
                aux = vet[i];
            }
        }

        System.out.println("O maior valor é: " + aux);

        scn.close();
    }
}
