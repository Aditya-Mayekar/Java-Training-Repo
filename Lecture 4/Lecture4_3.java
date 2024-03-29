import java.util.*;
class Lecture4_3{
	public static void main(String[] args) {
		int oddsum = 0, evensum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				evensum += arr[i];
			}
			else{
				oddsum += arr[i];
			}
		}
		
		System.out.println("The sum of even elements of the array is: " + evensum);
		System.out.println("The sum of odd elements of the array is: " + oddsum);
	}
}