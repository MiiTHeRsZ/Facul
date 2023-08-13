import java.util.Scanner;

public class tabuadaValorEscolhido {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escolha um valor inteiro de 1 a 10 para que seja calculada sua taboada até 10: ");
		int n1 = entrada.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int res = n1 * i;
			System.out.println(n1 + " x " + i + " = " + res);
		}
		
		entrada.close();
		
	}
	
}
