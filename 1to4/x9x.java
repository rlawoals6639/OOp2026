공개 class x9x {

	공개 static void main(String[] args) {

		int a, b;
		
		for(int i=1; i<=9; i++) {
			a = i;
			for(int j=1; j<=9; j++) {
				int x = i * j;
				System.out.print(i + "*" + j + "=" + x + " ");
			}
			System.out.println("");
		}
	}
}
