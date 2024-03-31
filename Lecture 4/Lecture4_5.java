import java.util.*;
class Lecture4_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3]; 
		System.out.println("Enter the 2-D array elements:");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The elements of the 2-D array are: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}