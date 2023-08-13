import java.util.Random;
import java.util.Scanner;

public class Funcao1Grau {
	public static void main(String[] args) {
        int min, max, a, b, res = 0;
        boolean verify = false;

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 2 valores inteiros para que seja calculada uma equação de 1º grau com números aleatórios entre os 2 valores digitados.");
        System.out.print("Valor minímo: ");
        min = input.nextInt();
        System.out.print("Valor máximo: ");
        max = input.nextInt();
        
        do{
            a = random.nextInt((max - min) + 1) + min;
            b = random.nextInt((max - min) + 1) + min;

            if(a != 0){
                res = - b / a;
                verify = true;
            }
        }while(verify == false);

        System.out.println("O resultado da equação " + a + "x + " + b + " = 0 é: x = " + res);

        input.close();
    }
}
