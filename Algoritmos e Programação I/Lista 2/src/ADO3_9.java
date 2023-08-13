import java.util.Scanner;

public class ADO3_9 {
    public static void main(String[] args) {
        float media = 0;
        int totalAlunos, x = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Há quantos alunos no total: ");
        totalAlunos = input.nextInt();

        int notaAluno[] = new int[totalAlunos];

        while (x < totalAlunos) {
            System.out.print("Nota do " + (x+1) + "º aluno(a): ");
            notaAluno[x] = input.nextInt();
            media += notaAluno[x];
            x++;
        }

        media /= totalAlunos;

        System.out.println("A média das notas dos alunos é de: " + media);

        input.close();
    }
}
