import java.util.Scanner;

public class MultiplaEscolha {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quest�o sobre Linguagem de Programa��o");
		System.out.println();
		System.out.println("Qual das linguagens abaixo � uma linguagem de baixo n�vel?");
		System.out.println("A - Python");
		System.out.println("B - Java");
		System.out.println("C - Assembly");
		System.out.println("D - C#/C++");
		System.out.println("E - PHP");
		System.out.println();
		System.out.print("Escolha(A, B, C, D ou E): ");
		String option = entrada.next();
		
		switch(option) {
		case "a":
		case "A":
		case "b":
		case "B":
		case "d":
		case "D":
		case "e":
		case "E":
			System.out.println("Resposta incorreta!");
			break;
		case "c":
		case "C":
			System.out.println("Resposta!");
			break;
		default:
			System.out.println("Escolha inv�lida!");
		}
		
		entrada.close();
		
	}

}
