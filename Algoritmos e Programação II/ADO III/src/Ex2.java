import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número e descubra se é par ou ímpar: ");
        num = entrada.nextInt();

        System.out.println(verificador(num));
    }

    static String verificador(int num) {
        if (num % 2 == 0) {
            return "Esse número é par";
        } else {
            return "Esse número é ímpar";
        }
    }
}
