import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        int num1, num2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros");
        System.out.print("1º valor: ");
        num1 = entrada.nextInt();
        System.out.print("2º valor: ");
        num2 = entrada.nextInt();
        
        int Media = num1 + num2;
        
        System.out.println("O maior valor é: " + verificador(num1, num2));

        if(num1 == 1 || num2 == 4){

        }
    }

    static int verificador(int x, int y) {
        if (x > y) {
            return x;
        } else if (x < y) {
            return y;
        } else {
            return x;
        }
    }
}
