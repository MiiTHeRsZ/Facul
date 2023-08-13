public class Ex2 {
    public static void main(String[] args) {
        int[] vet1 = {5, 4, 3, 2, 1}, vet2 = {1, 2, 3, 4, 5}, vet3 = new int[vet1.length];

        System.out.println("vet1  +  vet2  =  vet3");
        for (int i = 0; i < vet1.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
            System.out.println(vet1[i] + " + " + vet2[i] + " = " + vet3[i]);
        }
    }
}
