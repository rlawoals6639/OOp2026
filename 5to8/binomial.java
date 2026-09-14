public class binomial {

	public static void main(String[] args) {
        int n = 7;
        int[][] ary = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == i) {
                    ary[i][j] = 1;
                } else if (j < i) {
                    ary[i][j] = ary[i - 1][j - 1] + ary[i - 1][j];
                }
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
    }
}
