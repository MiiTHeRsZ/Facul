import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao_RespostasEmbaralhadas {

	public static void main(String[] args) {
		
		String res;
		int a, b, c, d, e;
		boolean pass = false;
		
		Scanner input = new Scanner(System.in);
		
	    ArrayList<Integer> options = new ArrayList<>();
	    
	    options.add(8);
	    options.add(10);
	    options.add(7);
	    options.add(9);
	    options.add(00);
	    
	    do {
	    	System.out.println("Qual das alternativas abaixo corresponde ao número 8 no sistema numérico octal?");
		    
	    	Collections.shuffle(options);
	    	
		    System.out.println("A)" + options.get(0));
		    System.out.println("B)" + options.get(1));
		    System.out.println("C)" + options.get(2));
		    System.out.println("D)" + options.get(3));
		    System.out.println("E)" + options.get(4));
		    
		    System.out.print("Alternativa: ");
		    res = input.next();
		    
		    a = options.get(0);
		    b = options.get(1);
		    c = options.get(2);
		    d = options.get(3);
		    e = options.get(4);
		    
		    if(res.equalsIgnoreCase("a") && a == 8) {
		    	System.out.println("\nAcertou!");
		    	pass = true;
		    }else if(res.equalsIgnoreCase("b") && b == 8) {
		    	System.out.println("\nAcertou!");
		    	pass = true;
		    }else if(res.equalsIgnoreCase("c") && c == 8) {
		    	System.out.println("\nAcertou!");
		    	pass = true;
		    }else if(res.equalsIgnoreCase("d") && d == 8) {
		    	System.out.println("\nAcertou!");
		    	pass = true;
		    }else if(res.equalsIgnoreCase("e") && e == 8) {
		    	System.out.println("\nAcertou!");
		    	pass = true;
		    }else if(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") && !res.equalsIgnoreCase("c") && !res.equalsIgnoreCase("d") && !res.equalsIgnoreCase("e")){
		    	System.out.println("\nAlternativa inválida.\n");
		    }else {
		    	System.out.println("\nErrou, tente novamente.\n");
		    }
	    }while(pass != true);
	    
	    input.close();
	    
	}
	
}