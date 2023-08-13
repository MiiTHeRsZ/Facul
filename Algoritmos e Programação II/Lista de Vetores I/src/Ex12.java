public class Ex12 {
    public static void main(String[] args) {
        int[] vet = { 1, 0, 5, -2, -5, 7 };
        int soma = vet[0] + vet[1] + vet[5];

        System.out.println("A soma dos valores nas posições A[0] + A[1] + A[5] é: " + soma);

        vet[3] = 100;

        System.out.println("\nVetor A");
        for (int i : vet) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
