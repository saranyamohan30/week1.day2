package week1.day2;

public class MyCalculator {

public static void main(String[] args)

	{
		Calculator calci=new Calculator();
		
		float divisionResult=calci.divide(123456,6);
		double multiplicationResult=calci.multiply(40,15);
		int subtractionResult=calci.subtraction(15, 25);
		int additionResult=calci.addition(10, 20, 30);
		
		System.out.println("Addition "+additionResult);
		System.out.println("Subtraction "+subtractionResult);
		System.out.println("Multiplication "+multiplicationResult);
		System.out.println("DIvision "+divisionResult);
	}

}
