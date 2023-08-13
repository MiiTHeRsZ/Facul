import java.util.Scanner;

public class ADO3_21 {

	public static void main(String[] args) {
        int x, valor = 0;
    	
        Scanner input = new Scanner(System.in);

    	System.out.println("Digite um número: ");
        x = input.nextInt();

    	for (int i = 1; i < x; i++) {
            if (x % i == 0) valor += i;
    	}
    	if (valor == x){ 
        	System.out.println("Número perfeito");
        }else{ 
            System.out.println("Não é um número perfeito");
        }

        input.close();
	}
}