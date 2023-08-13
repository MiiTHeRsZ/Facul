import java.util.Scanner;

public class ADO_IV {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite um valor para calcular Fibonnaci: ");
        int num = scn.nextInt();

        scn.close();

        System.out.println(recursFat(num));
    }

    private static int recursFat(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * recursFat(num - 1);
        }
    }
}
