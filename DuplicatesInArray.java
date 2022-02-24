package week1.day2;

public class DuplicatesInArray {

	public static void main(String[] args) {
//		int arr[]=new int[5];
		int arr[]= {1,2,3,4,1,5,3,6};
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("Duplicate Elements in array "+arr[j]);
				break;
			}
				}	}

	}

}
