package week1.day2;

public class FindPrimeNumber {

	public static void main(String[] args) {
		float value=13f;
		boolean isPrime = false;
		if(value==1) 
			System.out.println("1 is the prime number");
		for (int i=2 ; i < value; i++) {
		if(value%i==0) {
			isPrime=false;
			break;
			}
		else
			isPrime=true;
		}
		if(isPrime==false)
		System.out.println(+value+" is not a Prime");
		else
			System.out.println(+value+" is a Prime");
		}
}
