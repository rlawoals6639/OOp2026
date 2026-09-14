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
