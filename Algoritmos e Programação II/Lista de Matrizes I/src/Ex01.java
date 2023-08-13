public class Ex01 {
    public static void main(String[] args) throws Exception {
        int[][] mat = new int[2][5];
        int x = 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = x;

                System.out.print(mat[i][j] + " ");

                x++;
            }
            System.err.println();
        }
    }
}