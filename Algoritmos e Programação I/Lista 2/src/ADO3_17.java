import java.util.Scanner;

public class ADO3_17 {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número natural: ");
        n = input.nextInt();

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }

        input.close();
    }
}