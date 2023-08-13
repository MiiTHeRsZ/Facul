import java.util.Scanner;

public class ADO3_3 {
	public static void main(String[] args) {
		int n[] = new int[10];
		int vetor = 0, maior = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 10 valores positivos para calcular o maior entre eles");
		
		for(int i = 0; i < 10; i++) {
			do {
				System.out.print((i+1) + "º valor: ");
				n[vetor] = input.nextInt();
				if(n[vetor] <= 0) System.out.println("Digite um valor maior que 0");
			}while(n[vetor] <= 0);
			vetor++;
		}
		
		vetor = 0;
		
		for(int i = 0; i < 10; i++) {
			if(n[vetor] > maior) maior = n[vetor];
			vetor++;
		}
		
		System.out.println("O maior valor digitado é: " + maior);
		
		input.close();
	}
}
