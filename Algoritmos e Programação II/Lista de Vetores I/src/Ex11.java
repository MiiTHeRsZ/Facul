import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        int[] vet1 = new int[10];
        boolean[] vet2 = new boolean[vet1.length];

        Random rand = new Random();

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = rand.nextInt(21) + 1;
            if (vet1[i] % 2 == 0) {
                vet2[i] = true;
            } else {
                vet2[i] = false;
            }
        }
    }
}
