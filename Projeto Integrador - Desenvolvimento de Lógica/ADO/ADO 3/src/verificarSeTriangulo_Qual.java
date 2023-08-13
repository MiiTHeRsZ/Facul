import java.util.Scanner;

public class verificarSeTriangulo_Qual {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 valores para descobrirmos se os mesmo formam um triângulo e se ele é equilátero, isósceles ou escaleno");
		System.out.print("Primeiro valor: ");
		double n1 = entrada.nextDouble();
		System.out.print("Segundo  valor: ");
		double n2 = entrada.nextDouble();
		System.out.print("Terceiro valor: ");
		double n3 = entrada.nextDouble();
		
		System.out.println();
		
		if((n1 + n2) > n3 && (n1 + n3) > n2 && (n2 + n3) > n1) {
			if(n1 == n2 && n2 == n3) {
				System.out.println("Os valores formam um triângulo EQUILÁTERO!");	
			}else if(n1 == n2 || n1 == n3 || n2 == n3) {
				System.out.println("Os valores formam um triângulo ISÓSCELES!");
			}else {
				System.out.println("Os valores formam um triângulo ESCALENO!");
			}
			
		}else {
			System.out.println("Infelizmente esses valores não formam um triângulo.");
		}
		
		entrada.close();
		
	}

}
