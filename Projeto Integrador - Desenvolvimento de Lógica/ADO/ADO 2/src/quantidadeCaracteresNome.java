import java.util.Scanner;

public class quantidadeCaracteresNome {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um nome n�o composto para descobrir por quantos caract�res ele � composto: ");
		String nome = entrada.next();
		
		System.out.println();
		System.out.println("O nome " + nome + " � composto(a) por " + nome.length() + " letras");
		
		entrada.close();
	}

}
