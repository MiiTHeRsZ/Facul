import java.util.Scanner;

public class verificarSeTriangulo_Qual {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 valores para descobrirmos se os mesmo formam um tri�ngulo e se ele � equil�tero, is�sceles ou escaleno");
		System.out.print("Primeiro valor: ");
		double n1 = entrada.nextDouble();
		System.out.print("Segundo  valor: ");
		double n2 = entrada.nextDouble();
		System.out.print("Terceiro valor: ");
		double n3 = entrada.nextDouble();
		
		System.out.println();
		
		if((n1 + n2) > n3 && (n1 + n3) > n2 && (n2 + n3) > n1) {
			if(n1 == n2 && n2 == n3) {
				System.out.println("Os valores formam um tri�ngulo EQUIL�TERO!");	
			}else if(n1 == n2 || n1 == n3 || n2 == n3) {
				System.out.println("Os valores formam um tri�ngulo IS�SCELES!");
			}else {
				System.out.println("Os valores formam um tri�ngulo ESCALENO!");
			}
			
		}else {
			System.out.println("Infelizmente esses valores n�o formam um tri�ngulo.");
		}
		
		entrada.close();
		
	}

}
