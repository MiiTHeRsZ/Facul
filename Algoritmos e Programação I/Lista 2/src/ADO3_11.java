import java.util.Scanner;

public class ADO3_11 {
    public static void main(String[] args) {
        double total = 0;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i += 2){
            total += (1 / i);
            total -= (1 / (i+1));
        }

        System.out.println(total);

        input.close();
    }
}
