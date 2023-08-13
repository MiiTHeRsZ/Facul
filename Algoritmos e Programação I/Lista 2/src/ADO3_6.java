import java.util.Scanner;

public class ADO3_6 {
    public static void main(String[] args) {
        String nome[] = new String[5], sexo[] = new String[5];
        int idade[] = new int[5], older[] = new int[5];
        int x = 0, vetOlder = 0, oldFinal = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println((x+1) + "º aluno");
            System.out.print("Nome: ");
            nome[x] = input.next();
            System.out.print("Sexo: ");
            sexo[x] = input.next();
            System.out.print("Idade: ");
            idade[x] = input.nextInt();
            x++;
        }while(x < 5);

        x = 0;
        do {
            if(idade[x] > idade[x+1]){
                older[vetOlder] = x;
                vetOlder++;
            }else if(idade[x] == idade[x+1]){
                older[vetOlder] = x;
                x++;
                vetOlder++;
                older[vetOlder] = x;
                vetOlder++;
            }else{
                older[vetOlder] = x+1;
                vetOlder++;
            }
            x++;
        } while (x < 4);
        oldFinal = vetOlder;
        x = 0;
        do {
            System.out.println("O(s) aluno(s) mais velho(s): \nNome: " + nome[older[vetOlder]] + "\nSexo: " + sexo[older[vetOlder]] + "\nIdade: " + idade[older[vetOlder]]);
            vetOlder++;
            oldFinal++;
        } while (x < oldFinal-1);

        input.close();
    }
}
