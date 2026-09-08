public class x9x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int a, b;
		
		for(i=1; i<=9; i++) {
			a = i;
			for(j=1; j<=9; j++) {
				int x = i * j;
				System.out.print(i + "*" + j + "=" + x + " ");
			}
			System.out.println("");
		}
	}
}
