import java.util.Scanner;

public class anoBixesto {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor de um ano com 4 n�meros: ");
		int ano = entrada.nextInt();
		
		System.out.println();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && !(ano % 100 ==0))) {
			System.out.println(ano + " � um ano bixesto");
		}else {
			System.out.println(ano + " n�o � um ano bixesto");
		}
		
		entrada.close();
		
	}

}
