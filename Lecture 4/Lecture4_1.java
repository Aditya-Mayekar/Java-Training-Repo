import java.util.*;
class Lecture4_1{
	public static void main(String[] args) {
		int oddsum = 0, evensum = 0, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements are: ");
		for(int j = 0; j < arr.length; j++){
			System.out.println(arr[j]);
		}	
	}
}