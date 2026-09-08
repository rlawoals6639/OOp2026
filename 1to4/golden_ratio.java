public class golden_ratio {

	public static void main(String[] args) {
		
		int i;
        int j = 1;
        int k = 1;

        for(i=0; i<=10; i++) {
            System.out.print(j + " " + k + " ");

            j+=k;
            k+=j;

        }
	}
}
