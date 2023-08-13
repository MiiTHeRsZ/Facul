import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int t;

        Scanner scn = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        t = scn.nextInt();

        String[] nome = new String[t];
        double[] prova1 = new double[t], prova2 = new double[t], media = new double[t];

        System.out.println("Dados do aluno");
        for (int i = 0; i < t; i++) {
            System.out.println("\n" + (i + 1) + "º aluno");
            System.out.print("Nome: ");
            nome[i] = scn.next();
            System.out.print("Nota da prova 1: ");
            prova1[i] = scn.nextDouble();
            System.out.print("Nota da prova 2: ");
            prova2[i] = scn.nextDouble();
            media[i] = (prova1[i] + prova2[i]) / 2;
        }

        scn.close();

        System.out.println("Resultado: ");
        for (int i = 0; i < t; i++) {
            System.out.println(nome[i] + ", Prova 1 = " + prova1[i] + ", Prova 2 = " + prova2[i] + ", Média final = " + media[i]);
        }
    }
}
