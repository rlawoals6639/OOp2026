public class fibonacci{
  public static void main(String []args){
    int i;
    int j = 1;
    int n = 1;

    for(i=0; i<10; i++) {
      System.out.print(n);
      System.out.print(" ");
      System.out.print(j);
        n += j;
        j += n;
      System.out.print(" ");
    }
  }
}
