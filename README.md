###OOp2026

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

```


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




  
