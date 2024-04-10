import java.util.*;
class Lecture4_12{
	public static void main(String[] args) {
		int[] arr = new int[10];
		Arrays.fill(arr, 100);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		Arrays.fill(arr, 3, 7, 23);
		System.out.println(Arrays.toString(arr));
	}
}