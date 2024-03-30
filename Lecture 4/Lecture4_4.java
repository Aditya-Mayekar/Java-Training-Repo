import java.util.*;
class Lecture4_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(min > arr[i])
				min = arr[i];
			if(max < arr[i])
				max = arr[i];
		}
		
		System.out.println("The smallest number of array is: " + min);
		System.out.println("The largest number of array is: " + max);
	}
}