import java.util.Scanner;

public class descontoValorCompra {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra para calcular o desconto que seja aplicado: R$");
		double valor = entrada.nextDouble();
		
		if(valor >= 300) {
			double total = valor * 0.8;
			System.out.println("O valor total a se pagar com o desconto aplicado é de: R$" + total);
		}else if((valor < 300) && (valor > 0)) {
			double total = valor * 0.85;
			System.out.println("O valor total a se pagar com o desconto aplicado é de: R$" + total);
		}else {
			System.out.println("O valor digitado é inválida!");
		}
		
		entrada.close();
		
	}

}
