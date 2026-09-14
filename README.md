<img width="1334" height="930" alt="2번" src="https://github.com/user-attachments/assets/56dd0038-1aa3-4818-b6b4-ededdff8202a" /># OOp2026


'''java

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
'''

<img width="1323" height="908" alt="1번" src="https://github.com/user-attachments/assets/2fc148ab-85d1-4fb4-b89e-1b6def9388d3" />


'''java

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

'''

<img width="1334" height="930" alt="2번" src="https://github.com/user-attachments/assets/f4f34fb0-a169-42f1-a260-ce816a17b565" />



'''java

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

'''

<img width="1336" height="929" alt="3번" src="https://github.com/user-attachments/assets/88759235-a5cf-4aad-bda1-5f19bd57f871" />


'''java



'''






  
