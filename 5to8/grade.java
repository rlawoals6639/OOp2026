public class grade {

	public static void main(String[] args) {
		int rows = 25;
        int cols = 6;
        int[][] ary = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            ary[i][0] = i + 1;
            int sum = 0;

            for (int j = 1; j <= 4; j++) {
                ary[i][j] = (int) (Math.random() * 101);
                sum += ary[i][j];
            }
            ary[i][5] = sum;

            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", ary[i][j]);
            }
            System.out.println();
        }
    }
}
