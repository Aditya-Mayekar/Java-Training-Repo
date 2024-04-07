import java.util.*;
class Lecture4_11{
	public static void main(String[] args) {
		int a1[] = new int[]{1, 2, 3, 4, 5, 6, 7};
		int a2[] = Arrays.copyOf(a1, 4);
		System.out.println(Arrays.toString(a2));
		int a3[] = new int[6];
		System.arraycopy(a2, 0, a3, 0, 3);
		Arrays.sort(a3);
		System.out.println(Arrays.toString(a3));
	}
}