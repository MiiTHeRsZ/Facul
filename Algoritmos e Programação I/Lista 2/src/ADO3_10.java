public class ADO3_10 {
    public static void main(String[] args) {
        double total = 0, sub = 0;

        for(int i = 1; i <= 20; i++){
            sub = 1 / i;
            total += sub;
        }

        System.out.println(total);
    }
}
