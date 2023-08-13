import java.util.Scanner;

public class ADO3_20 {
    public static void main(String[] args) {
        int option = 0;
        double saldo, valor;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: R$");
        saldo = input.nextDouble();

        do{
            System.out.print("Deseja fazer:\n1 - Saque\n2 - Depósito\n3 - Sair\nOpção: ");
            option = input.nextInt();
            if(option == 1){
                System.out.print("Qual o valor do saque?\nR$");
                valor = input.nextDouble();
                saldo -= valor;
            }else if(option == 2){
                System.out.print("Qual o valor do depósito?\nR$");
                valor = input.nextDouble();
                saldo += valor;
            }else if(option < 1 || option > 3){
                System.out.println("Digito inválido");
            }
        }while (option != 3);

        if(saldo > 0){
            System.out.println("Conta Preferencial");
        }else if (saldo < 0){
            System.out.println("Conta Estourada");
        }else{
            System.out.println("Conta Zerada");
        }

        input.close();
    }
}
