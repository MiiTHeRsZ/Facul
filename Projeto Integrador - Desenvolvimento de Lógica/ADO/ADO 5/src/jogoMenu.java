import java.util.Scanner;

public class jogoMenu {
	
	public static void main(String[] args) {
		
		int option;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Menu Principal!");
		do {
		System.out.println("---------------");
		System.out.println("1 - Instruções");
		System.out.println("2 - Jogar");
		System.out.println("3 - Créditos");
		System.out.println("4 - Sair");
		System.out.println();
		System.out.print("Escolha: ");
		option = entrada.nextInt();
		
		System.out.println();
		switch(option) {
		case 1:
			System.out.println("Opção 'Instruções' escolhida.");
			break;
		case 2:
			System.out.println("Opção 'Jogar' escolhida.");
			break;
		case 3:
			System.out.println("Opção 'Créditos' escolhida.");
			break;
		case 4:
			System.out.println("Fim.");
			break;
		default:
			System.out.println("Opção inválidada.");
		}
		
		}while(option != 4);
		
		entrada.close();
		
	}

}
