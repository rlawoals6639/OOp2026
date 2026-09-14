public class golden_ratio {
	
    public static void main(String[] args) {
    	int n = 20;
        long a = 1;
        long b = 1;

        for (int i = 1; i < n; i++) {
            long next = a + b;
            double ratio = (double) next / b;
            System.out.println(next + "/" + b + "=" + ratio);
            a = b;
            b = next;
        }
    }
}
