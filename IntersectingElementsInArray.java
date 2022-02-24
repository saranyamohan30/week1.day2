package week1.day2;

public class IntersectingElementsInArray {

	public static void main(String[] args) {
	int[] number= {10,20,30,40,50}; 
	int[] number1= {20,25,30,35,40,45,50};
	/*
	 * int number=new int[5];
	 * number[0]=10; number[1]=20; number[2]=30; number[3]=50; number[4]=60;
	 */
	System.out.println("Array1 Length is :"+number.length);
	System.out.println("Array2 Length is :"+number1.length);
	for(int i=0;i<number.length;i++) {
	System.out.println("Elements of Array1 are :" +number[i]);	
	}
	System.out.println("---------------------------");
	for(int i=0;i<number1.length;i++) {
		System.out.println("Elements of Array2 are :" +number1[i]);	
		}
	for (int a = 0; a < number.length; a++) {
	for (int b = 0; b < number1.length; b++) {
		if (number[a]==number1[b]) {
			System.out.println("Common elements in Array: "+number[a]);
		} 
	}	
	}
	}

}
