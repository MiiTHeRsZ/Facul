import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[][] matR = { { 0, 1, 1, 1 }, { 0, 0, 0, 0 }, { 0, 0, 0, 1 }, { 1, 1, 0, 1 } };
        int lin, col;
        String[][] matG = { { "_", "_", "_", "_" }, { "_", "_", "_", "_" }, { "_", "_", "_", "_" },
                { "_", "_", "_", "_" } };
        boolean verify = false;

        System.out.println("Batalha Naval");
        do {
            System.out.println("   1   2   3   4");
            for (int i = 0; i < matG.length; i++) {
                System.out.print((i + 1));
                for (int j = 0; j < matG[i].length; j++) {
                    System.out.print("  " + matG[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Digite a Linha e a Coluna");
            System.out.print("Linha: ");
            lin = scn.nextInt();
            lin -= 1;
            System.out.print("Coluna: ");
            col = scn.nextInt();
            col -= 1;

            if (lin < 0 || lin > 3 || col < 0 || col > 3) {
                System.err.println("\nDigite apenas valores de 1 a 4\n");
            } else if(!matG[lin][col].equalsIgnoreCase("_")){
                System.err.println("\nJá tentou essa posição, tente outra!\n");
            } else {
                if (matR[lin][col] == 1) {
                    matG[lin][col] = "1";
                    System.out.println("\nVocê acertou\n");
                } else {
                    matG[lin][col] = "0";
                    System.out.println("\nVocê errou - água\n");
                }

                verifyMat: 
                for (int i = 0; i < matG.length; i++) {
                    for (int j = 0; j < matG[i].length; j++) {
                        if (matG[i][j].equalsIgnoreCase("_")) {
                            verify = false;
                            break verifyMat;
                        } else {
                            verify = true;
                        }

                    }
                }
            }
        } while (!verify);

        scn.close();

        System.out.println("\n\nCampo naval completo\n   1   2   3   4");
        for (int i = 0; i < matG.length; i++) {
            System.out.print((i + 1));
            for (int j = 0; j < matG[i].length; j++) {
                System.out.print("  " + matG[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\nFim do jogo!");
    }
}
