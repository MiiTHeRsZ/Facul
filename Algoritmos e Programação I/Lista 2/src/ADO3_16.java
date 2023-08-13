import java.util.Scanner;

public class ADO3_16 {
    public static void main(String[] args) {
        int n, count = 0, valor;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores deseja inserir?\nResposta: ");
        n = input.nextInt();

        do {
            System.out.print((count+1) + "º valor: ");
            valor = input.nextInt();

            if(valor > 0 && valor % 2 == 0){
                System.out.println(valor + " é par e positivo");
            }else if(valor > 0 && valor % 2 == 1){
                System.out.println(valor + " é ímpar e positivo");
            }else if(valor < 0){
                valor = -valor;
                if(valor % 2 == 0){
                    System.out.println(valor + " é par e negativo");
                }else{
                    System.out.println(valor + " é ímpar e negativo");
                }
            }else{
                System.out.println(valor + " é nulo");
            }

            count++;
        } while (count < n);

        input.close();
    }
}
