package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int seiesLength=10;
		int sum[]=new int[10];
			sum[0]=0;
			sum[1]=1;
			sum[2]=sum[0]+sum[1];
		System.out.println("Fibonacci Series: "+sum[0]+","+sum[1]+","+sum[2]);
		
		  for (int i = 3; i < seiesLength; i++)
		  {
			  sum[i]=sum[i-1]+sum[i-2];
			  System.out.println(sum[i]); 
			  } 
	}

}
