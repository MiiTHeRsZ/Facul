import java.util.Scanner;

public class ADO3_2 {
	public static void main(String[] args) {
		int n, x = 1, res = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		n = input.nextInt();
		
		while(x <= n) {
			res += x;
			x++;
		}
		
		System.out.println("A soma de todos os valores inteiros de 1 até " + n + " é igual a: " + res);
		
		input.close();
	}
}
