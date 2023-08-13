public class Quest04 {
    public static void main(String[] args) {
        int[] vetOri = {1, 5, 0, 4, 9}, vetInv = new int[5];

        for (int i = 0, j = 4; i < vetInv.length; i++, j--) {
            vetInv[j] = vetOri[i];
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < vetOri.length; i++) {
            System.out.print(vetOri[i] + " ");
        }

        System.out.println("\n\nVetor B:");
        for (int i = 0; i < vetInv.length; i++) {
            System.out.print(vetInv[i] + " ");
        }

        System.out.println();
    }
}
