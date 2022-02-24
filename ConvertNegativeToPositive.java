package week1.day2;

public class ConvertNegativeToPositive {

	public static float convertToPositive(float a)
	{
		if(a<0)
		{
			float positiveNumber=a*(-1);
			System.out.println("Positive Number is " +positiveNumber);	
		}
		return(a);
	}
	public static void main(String[] args) {
		
		convertToPositive(-12);
		
	}

}
