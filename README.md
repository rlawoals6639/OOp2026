<h1>OOp2026</h1>



<details>
  <summary>1번~4번</summary>

<h3>1번</h3>
```java

	public class hash_printing{
	  public static void main(String []args){
	    int i, j, k;
	    for(i=0; i<10; i++) {
	      for(j=0; j<10-i; j++) {
	        System.out.print("#");
	      }
	      System.out.println("");
	    }
		
	    for(i=0; i<10; i++) {
	      for(j=0; j<=i; j++) {
	        System.out.print("#");
	      }
	      System.out.println("");
	    }
      
	    for(i=0; i<10; i++) {
	      for(j=0; j<i; j++) {
	        System.out.print(" ");
	      }
	      for(k=0; k<=9-i; k++) {
	      System.out.print("#");
	      }
	      System.out.println("");
	    }

	    for(i=0; i<10; i++) {
	      for(j=0; j<9-i; j++) {
	        System.out.print(" ");
	      }
	      for(k=0; k<=i; k++) {
	      System.out.print("#");
	      }
	      System.out.println("");
	    }
	  }
	}


<img width="1323" height="908" alt="1번" src="https://github.com/user-attachments/assets/2fc148ab-85d1-4fb4-b89e-1b6def9388d3" />


```java

	public class fibonacci {
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

```

<img width="1334" height="930" alt="2번" src="https://github.com/user-attachments/assets/f4f34fb0-a169-42f1-a260-ce816a17b565" />

```java

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


```

<img width="1336" height="929" alt="3번" src="https://github.com/user-attachments/assets/88759235-a5cf-4aad-bda1-5f19bd57f871" />


```java

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

```

<img width="1336" height="929" alt="3번" src="https://github.com/user-attachments/assets/85c36b64-c775-47cf-bd35-7842f910422b" />

</details>



<details>
  <summary>5번~8번</summary>
	
```java

	public class x9x {

		public static void main(String[] args) {

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


```

<img width="1334" height="933" alt="4번" src="https://github.com/user-attachments/assets/bf98d071-436d-43db-9007-dc57c04c2f8e" />


aaaaaaaaaaaaaaa




```java

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

```

<img width="1339" height="930" alt="5번" src="https://github.com/user-attachments/assets/2674d9d2-4282-4c3c-959a-128707902926" />


```java

	public class binomial {

		public static void main(String[] args) {
        	int n = 7;
        	int[][] ary = new int[n][n];

        	for (int i = 0; i < n; i++) {
            	for (int j = 0; j < n; j++) {
                	if (j == 0 || j == i) {
                    	ary[i][j] = 1;
                	} else if (j < i) {
                    	ary[i][j] = ary[i - 1][j - 1] + ary[i - 1][j];
                	}
                	System.out.print(ary[i][j] + " ");
            	}
            	System.out.println();
        	}
    	}
	}

```

<img width="1337" height="934" alt="6번" src="https://github.com/user-attachments/assets/ce97b321-6238-4650-836b-9babdff09bfa" />


```java

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
	
```

<img width="1338" height="926" alt="7번" src="https://github.com/user-attachments/assets/e329b106-9094-416a-b8c7-60b1fb55e449" />


```java
	
	public class sorting {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int i;
			int j;
			int data[] = new int[20];
	        for (i = 0; i < 20; i++)
	            data[i] = (int) (Math.random() * 100);
	
	        for (i = 0; i < data.length - 1; i++) {
	            int minIndex = i;
	            for (j = i + 1; j < data.length; j++) {
	                if (data[j] < data[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int sp = data[i];
	            data[i] = data[minIndex];
	            data[minIndex] = sp;
	        }
	
	        for (i = 0; i < 20; i++)
	            System.out.println(data[i]);
	    }
	}

```

<img width="1341" height="932" alt="8번" src="https://github.com/user-attachments/assets/327db714-3b36-4c1b-8f46-f2f4c8d1120b" />

</details>



<details>
  <summary>10번~14번</summary>


```java
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

```
<img width="1222" height="877" alt="10번" src="https://github.com/user-attachments/assets/9dd5ce33-3c7c-4396-8d89-3eabc3fdd8e6" />


```java
package object_coding;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		class numbers {
			int num[];

			numbers(int num[]) {
				this.num = num;
			}


			double getTotal() {
				double sum = 0;
				for (int i = 0; i < num.length; i++) {
					sum += num[i];
				}
				return sum;
			}


			double getArithmeticMean() {
				return getTotal()/num.length;
			}


			double getGeometricMean() {
				int count = num.length, validCount = 0;
				double logSum = 0;

				for(int i = 0; i < count; i++) {
					if(num[i] != 0) {
						logSum += Math.log(num[i]);
						validCount += 1;
					}
				}
				return Math.exp(logSum/validCount);
			}


			double getHarmonicMean() {
				double reciprocalSum = 0;
				int count = num.length, validCount  = 0;

				for(int i = 0; i < count; i++) {
					if(num[i] != 0) {
						reciprocalSum = reciprocalSum + (1.0 / num[i]);
						validCount += 1;
					}
				}
				return validCount / reciprocalSum;
			}


			double getMedian() {
				int count = num.length, temp = 0;
				double median = 0;

				for (int i = 1; i < count; i++) {
					if (num[i-1] > num[i]) {
						temp = num[i-1];
						num[i-1] = num[i];
						num[i] = temp;

						i = 0;
					}
				}
				if(num.length % 2 == 0) {
					median = (num[num.length / 2 - 1] + num[(num.length / 2)]) / 2.0;
				} else {
					median = num[num.length / 2];
				}
				return median;
			}


			void sort() {

				int temp = 0;

				for (int i = 1; i < num.length; i++) {
					if (num[i-1] > num[i]) {
						temp = num[i-1];
						num[i-1] = num[i];
						num[i] = temp;

						i = 0;
					}
				}

				System.out.printf("100 : ");

				for (int i = 0; i < num.length; i++) {
					System.out.printf("%d ", num[i]);
				}

				System.out.printf("\n\n");
			}


			void drawHistogram(int start, int end, int binSize, int scale) {
				int[] samples = new int[end];
				int[] counts = new int[(end + binSize - 1)/binSize];

				int range = ( end / binSize - 1 )/ binSize, index = 0, binEnd = 0;

				for (int i=0; i<samples.length; i++) {
					samples[i] = (int)(Math.random()*end);
					index = samples[i] / binSize;
					counts[index]++;
				}


				for (int i = 0; i < (end + binSize - 1)/ binSize; i++) {
					if (i == ( (end + binSize - 1) / binSize) - 1 ){
						binEnd = end;
					} else {
						binEnd = binSize * (i+1) -1;
					}
					System.out.printf("%8d ~ %-10d", 0 + binSize * i, binEnd);
					for (int j = 0; j < counts[i] / scale; j++) {
						System.out.print("#");
					}
					System.out.println();
				}
			}


			void display() {
				System.out.printf("%3d :", num.length);

				for(int i=0; i<num.length; i++)
					System.out.printf("%3d ", num[i]);
					System.out.println();

			}

		}

		int size = 100;
		int data[] = new int [size];


		for (int i = 0; i < size; i++) {
			data[i] = (int)(Math.random()*100);
		}

		numbers stats = new numbers(data);


		stats.display();

		stats.sort();

		System.out.printf("산술평균 : %5.2f\n\n", stats.getArithmeticMean());

		System.out.printf("기하평균 : %5.2f\n\n", stats.getGeometricMean());

		System.out.printf("조화평균 : %5.2f\n\n", stats.getHarmonicMean());

		System.out.printf("중앙값 : %5.2f\n\n", stats.getMedian());

		System.out.println();

		stats.drawHistogram(0,100,10, 1);


	}
}
```
<img width="1199" height="792" alt="11_1번" src="https://github.com/user-attachments/assets/08fb372a-3387-4150-addc-01b0b9091c6e" />



```java
package object_coding;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int opIndex = 1;
		int simpleLength = 3;
		double result = 0;

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] tokens = input.split(" ");

		for (String token : tokens) {
			System.out.println(token);
		}

		if (simpleLength < tokens.length) {
			opIndex = ((tokens[1].equals("+") || tokens[1].equals("-")) && (tokens[3].equals("*") || (tokens[3].equals("/")))) ? 3 : 1;
		}

		switch(tokens[opIndex]) {
		case "+" -> result = add(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		case "-" -> result = subtract(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		case "*" -> result = multiply(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		case "/" -> result = divide(Double.parseDouble(tokens[opIndex - 1]), Double.parseDouble(tokens[opIndex + 1]));
		}

		if (simpleLength < tokens.length) {
			if (opIndex == 3) {
				opIndex = 1;
				switch(tokens[opIndex]) {
				case "+" -> result = add(Double.parseDouble(tokens[opIndex - 1]), result);
				case "-" -> result = subtract(Double.parseDouble(tokens[opIndex - 1]), result);
				case "*" -> result = multiply(Double.parseDouble(tokens[opIndex - 1]), result);
				case "/" -> result = divide(Double.parseDouble(tokens[opIndex - 1]), result);
				}
			} else {
				opIndex = 3;
				switch(tokens[opIndex]) {
				case "+" -> result = add(result, Double.parseDouble(tokens[opIndex + 1]));
				case "-" -> result = subtract(result, Double.parseDouble(tokens[opIndex + 1]));
				case "*" -> result = multiply(result, Double.parseDouble(tokens[opIndex + 1]));
				case "/" -> result = divide(result, Double.parseDouble(tokens[opIndex + 1]));
				}
			}
		}
	}

	public static double add(double a, double b) {
		double result;
		result = a + b;

		System.out.printf("%f\n", result);
		return result;
	}

	public static double subtract(double a, double b) {
		double result;
		result = a - b;

		System.out.printf("%f\n", result);
		return result;
	}

	public static double multiply(double a, double b) {
		double result;
		result = a * b;

		System.out.printf("%f\n", result);
		return result;
	}

	public static double divide(double a, double b) {
		double result;
		result = a / b;

		System.out.printf("%f\n", result);
		return result;
	}
}
```
<img width="1268" height="881" alt="13번" src="https://github.com/user-attachments/assets/0f4b3f81-c265-45c8-92da-de1dde07b4b5" />


```java
package object_coding;

import java.util.Scanner;
import java.util.Random;

public class math {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array_count, change;
		double ari, geo, har, median;

		int value_count = 0;
		int geo_total = 1;
		double log_total = 0, har_total = 0, ari_total = 0;

		System.out.print("랜덤 생성할 변수 수 : ");
		array_count = sc.nextInt();
		while(array_count <= 0) {
			System.out.print("랜덤 생성할 변수 수 : ");
			array_count = sc.nextInt();
		}

		int[] array_data = new int[array_count];

		for(int i = 0; i < array_count + 0; i++) {
			array_data[i] = (int)(Math.random()*100);
			System.out.printf("%3d ", array_data[i]);
			if( ( i + 1 ) % 25 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		for(int i = 0; i < array_count; i++) {
			ari_total = ari_total + array_data[i];
		}
		ari = ari_total / array_data.length;

		System.out.printf("산술 평균 : %f\n", ari);

		for(int i = 0; i < array_count; i++) {
			if(array_data[i] != 0) {
				log_total += Math.log(array_data[i]);
				value_count += 1;
			}
		}
		geo = Math.exp(log_total/value_count);

		System.out.printf("기하 평균 : %f\n", geo);

		value_count = 0;
		for(int i = 0; i < array_count; i++) {
			if(array_data[i] != 0) {
				har_total = har_total + (1.0 / array_data[i]);
				value_count += 1;
			}
		}
		har = value_count / har_total;
		System.out.printf("조화 평균 : %f\n", har);

		for (int i = 1; i < array_count; i++) {
			if (array_data[i-1] > array_data[i]) {
				change = array_data[i-1];
				array_data[i-1] = array_data[i];
				array_data[i] = change;

				i = 0;
			}
		}

		if(array_data.length % 2 == 0) {
			median = (array_data[array_data.length / 2 - 1] + array_data[(array_data.length / 2)]) / 2.0;
		} else {
			median = array_data[array_data.length / 2];
		}

		System.out.printf("중간값 : %f", median);
	}
}
```

<img width="1365" height="887" alt="14번" src="https://github.com/user-attachments/assets/f31c59bb-899f-4805-bec7-7006627c6650" />

</details>

  
