import java.util.Scanner;

public class ADO3_12 {
    public static void main(String[] args) {
        double total = 0;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        n = input.nextInt();

        for(int i = 0; i < n; i++){
            total += ((i + 1) / (n - i));
            total += ((n - i) / (i + 1));
        }

        System.out.println(total);

        input.close();
    }
}
