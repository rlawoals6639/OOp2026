public class pi {

	public static void main(String[] args) {
        int n = 15;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double x = 1.0 / ((2 * i + 1) * Math.pow(3, i));
            if (i % 2 == 0) {
                sum += x;
            } else {
                sum -= x;
            }
        }

        double pi = Math.sqrt(12) * sum;

        System.out.printf("%.15f%n", pi);
    }
}
