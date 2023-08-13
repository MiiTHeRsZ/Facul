public class Ex3 {
    public static void main(String[] args) {
        unirVets();
    }

    static void unirVets() {
        int[] vet1 = { 5, 4, 3, 2, 1 }, vet2 = { 1, 2, 3, 4, 5 }, vet3 = new int[2 * vet1.length];

        for (int i = 0; i < vet3.length; i++) {
            if (i < vet1.length) {
                vet3[i] = vet1[i];
            } else {
                vet3[i] = vet2[i - vet1.length];
            }
            System.out.println("vet3[" + i + "] = " + vet3[i]);
        }
    }
}
