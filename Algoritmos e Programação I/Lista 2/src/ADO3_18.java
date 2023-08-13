import java.util.Scanner;

public class ADO3_18 {
    public static void main(String[] args){
        int n, n1 = 1, n2 = 0, aux;

        Scanner input = new Scanner(System.in);

        System.out.print("Dentre um valor máximo de 46 vezes, quantas vezes deseja repetir a sequência de Fibonacci?\nResposta: ");
        n = input.nextInt();

        if(n > 46){
            input.close();
            return;
        }

        for (int i = 0; i <= n; i++){
            System.out.println(n1);
            aux = n1;
            n1 = n1 + n2;
            n2 = aux;
        }

        input.close();
    }
}
