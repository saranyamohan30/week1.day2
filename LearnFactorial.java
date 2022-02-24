package week1.day2;

public class LearnFactorial {

	public static void main(String[] args) {
		int value=5;
		int fact=1;
		for(int i=1;i<=value;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of "+value+" is :"+fact);
}
}
