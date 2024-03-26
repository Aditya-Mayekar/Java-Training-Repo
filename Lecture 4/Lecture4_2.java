import java.util.*;
class Lecture4_2{
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		
		System.out.println("Sum of all elements in array = " + sum);
	}
}