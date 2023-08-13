import java.util.Scanner;

public class diasDaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro de 1 a 7 para descobrir seu correspondente dia da semana: ");
		int option = entrada.nextInt();
		
		System.out.println();
		switch(option) {
		case 1:
			System.out.println(option + " corresponde a DOMINGO!");
			break;
		case 2:
			System.out.println(option + " corresponde a SEGUNDA-FEIRA!");
			break;
		case 3:
			System.out.println(option + " corresponde a TERÇA-FEIRA!");
			break;
		case 4:
			System.out.println(option + " corresponde a QUARTA-FEIRA!");
			break;
		case 5:
			System.out.println(option + " corresponde a QUINTA-FEIRA!");
			break;
		case 6:
			System.out.println(option + " corresponde a SEXTA-FEIRA!");
			break;
		case 7:
			System.out.println(option + " corresponde a SÁBADO!");
			break;
		default:
			System.out.println(option + " é um valor inválido!");
		}
		
		entrada.close();
		
	}

}
