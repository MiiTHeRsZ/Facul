public class Ex1 {
    public static void main(String[] args) {
        int[] vet1 = {5, 4, 3, 2, 1}, vet2 = {};

        vet2 = vet1;

        for (int i = 0; i < vet2.length; i++) {
            System.out.println("vet2[" + i + "] = " + vet2[i]);
        }
    }
}