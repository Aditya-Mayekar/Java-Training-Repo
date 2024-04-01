import java.util.*;
class Lecture4_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int arr[][] = new int[3][3]; 
		System.out.println("Enter the 2-D array elements:");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				sum += arr[i][j];
			}
		}
		System.out.print("The sum of all elements of 2-D array is: " + sum);
	}
}