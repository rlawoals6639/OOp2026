public class fibonacci {

	public static void main(String[] args) {
		
        int j = 1;
        int k = 1;

        for(int i=0; i<=10; i++) {
            System.out.print(j + " " + k + " ");

            j+=k;
            k+=j;

        }
	}
}
