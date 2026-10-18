package object_coding;

import java.util.Random;
import java.util.Scanner;



public class histogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array_count, max_value, bin_size, display_scale;
		int index, last_max;

		
		System.out.print("표본 수 : ");
		array_count = sc.nextInt();
		
		System.out.print("\n표본 최댓값 : ");
		max_value = sc.nextInt();
		
		System.out.print("\n범위 : ");
		bin_size = sc.nextInt();
		
		System.out.print("\nscale : ");
		display_scale = sc.nextInt();
		
		while(display_scale <= 0) {
			System.out.print("\nscale : ");
			display_scale = sc.nextInt();
		}
		
		int[] array_data = new int[array_count];
		int[] array_Dosu = new int[(max_value + bin_size - 1)/bin_size];
		
		int range = ( max_value / bin_size - 1 )/ bin_size;
		
		for (int i=0; i<array_data.length; i++) {
			array_data[i] = (int)(Math.random()*max_value);
			index = array_data[i] / bin_size;
			array_Dosu[index]++;
		}
		
		
		for (int i = 0; i < (max_value + bin_size - 1)/ bin_size; i++) {
			if (i == ( (max_value + bin_size - 1) / bin_size) - 1 ){
				last_max = max_value;
			} else {
				last_max = bin_size * (i+1) -1;
			}
			System.out.printf("%2d ~ %-10d", 0 + bin_size * i, last_max);
			for (int j = 0; j < array_Dosu[i] / display_scale; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
