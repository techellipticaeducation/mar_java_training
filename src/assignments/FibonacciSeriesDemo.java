package assignments;

public class FibonacciSeriesDemo {
	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21,34,
		
		int i = 0;
		int j = 1;
		
		System.out.print(i+" ");
		System.out.print(j + " ");
		while((i+j) < 1000){
			
			int temp = i+j;
			i = j;
			j = temp;
			
			System.out.print(temp+ " ");
		}
		
		
	}
}
