import java.util.Scanner;

public class ADO3_19 {
    public static void main(String[] args) {
        int senha = 2002, pswd;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a senha correta: ");
        do{
            System.out.print("Senha: ");
            pswd = input.nextInt();
            if(senha != pswd) System.out.println("Senha Inválida");
        }while(senha != pswd);

        System.out.println("Acesso Permitido");

        input.close();
    }
}
