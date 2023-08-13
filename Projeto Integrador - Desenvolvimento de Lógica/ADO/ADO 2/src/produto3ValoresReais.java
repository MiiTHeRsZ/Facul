import java.util.Scanner;
public class produto3ValoresReais {
	
	public static void main(String[] args) {
		double n1, n2, n3, res;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite valores reais, ou seja, números quebrados. EX: '3,36'");
		System.out.print("Digite o primeiro valor: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		n2 = entrada.nextDouble();
		
		System.out.print("Digite o terceiro valor: ");
		n3 = entrada.nextDouble();
		
		res = n1 * n2 * n3;
		
		System.out.println("O produto dos 3 números equivale a: " + res);
		
		entrada.close();
	}

}
