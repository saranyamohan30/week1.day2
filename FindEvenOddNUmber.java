package week1.day2;

public class FindEvenOddNUmber {

	public static void main(String[] args) {
		
		
		int num = 9;
		String res = (num % 2 == 1) ? "odd" : (num == 0) ? "neutral" : "even";
		System.out.println(res);

		/*
		 * int num=0; if ((num%2)==0) { System.out.println("It is Even number"); } else
		 * System.out.println("It is Odd Number");
		 */	}

}
