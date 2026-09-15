import java.util.Scanner;
public class histogram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//표본 총 개수
		int array_count = sc.nextInt();
		//표본 최대값
		int max_value = sc.nextInt();
		//각 구간 크기
		int bin_size = sc.nextInt();
		
		int data[] = new int[max_value/bin_size];
		
		int num = array_count;
		
		for (int i=0; i<data.length; i++) {
			
			System.out.printf("%d ~ %d   ", max_value / bin_size * i, max_value / bin_size * i + bin_size - 1);
			
			int count = (int)(Math.random()*array_count);
			
			num =- count;
			
				if(num >= 0) {
					for(int j=1; j<count; j++) {
						System.out.print("#");
					}
					System.out.println("");
				} else if (num < 0) {
					for(int j=1; j<num+count; j++) {
						System.out.print("#");
					}
					System.out.println("");
					return;
				}
		}	
	}
}
