import java.util.Scanner;

public class primeiros3Multiplos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro para saber os primeiros 3 multiplos: ");
		int n1 = entrada.nextInt();
		
		for(int i = 1; i <= 3; i++) {
			int res = n1 * i;
			System.out.println(n1 + " x " + i + " = " + res);
		}
		
		entrada.close();
		
	}

}
