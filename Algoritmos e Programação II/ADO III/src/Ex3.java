import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();

        System.out.println("O resultado é: " + calcular(num));
    }

    static int calcular(int num) {
        if (num < -1) {
            return (num + 2) * -1;
        } else if (-1 <= num && num <= 2) {
            return num * num - 4;
        } else {
            return 2 * num - 1;
        }
    }
}
