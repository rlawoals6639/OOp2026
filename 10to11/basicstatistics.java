package object_coding;
import java.util.Scanner;

public class basicstatistics {

	public static void main(String[] args) {
		class Numbers {
			int num[];

			Numbers(int num[]) {
				this.num = num;
			}


			double getTotal() {
				double sum = 0;
				for (int i = 0; i < num.length; i++) {
					sum += num[i];
				}
				return sum;
			}


			double getArithmaticMean() {
				return getTotal()/num.length;
			}


			double getGeometricMean() {
				int array_count = num.length, value_count = 0;
				double log_total = 0;

				for(int i = 0; i < array_count; i++) {
					if(num[i] != 0) {
						log_total += Math.log(num[i]);
						value_count += 1;
					}
				}
				return Math.exp(log_total/value_count);
			}


			double getHarmonicMean() {
				double har_total = 0;
				int array_count = num.length, value_count  = 0;

				for(int i = 0; i < array_count; i++) {
					if(num[i] != 0) {
						har_total = har_total + (1.0 / num[i]);
						value_count += 1;
					}
				}
				return value_count / har_total;
			}


			double getCenter() {
				int array_count = num.length, change = 0;
				double center = 0;

				for (int i = 1; i < array_count; i++) {
					if (num[i-1] > num[i]) {
						change = num[i-1];
						num[i-1] = num[i];
						num[i] = change;

						i = 0;
					}
				}
				if(num.length % 2 == 0) {
					center = (num[num.length / 2 - 1] + num[(num.length / 2)]) / 2.0;
				} else {
					center = num[num.length / 2];
				}
				return center;
			}
		}

		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 숫자의 개수 : ");
		int size = sc.nextInt();
		int[] data = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("data[" + i + "] : ");
			data[i] = sc.nextInt();
		}
		sc.close();

		Numbers n = new Numbers(data);

		System.out.println("산술평균 : " + n.getArithmaticMean());
		System.out.println("기하평균 : " + n.getGeometricMean());
		System.out.println("조화평균 : " + n.getHarmonicMean());
		System.out.println("중앙값 : " + n.getCenter());
	}

}
