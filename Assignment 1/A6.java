import java.util.Scanner;

class A6{
	public static void main(String[] args) {
		int total_marks = 500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks of five papers-");
		System.out.print("Paper 1: ");
		int m1 = sc.nextInt();
		System.out.print("Paper 2: ");
		int m2 = sc.nextInt();
		System.out.print("Paper 3: ");
		int m3 = sc.nextInt();
		System.out.print("Paper 4: ");
		int m4 = sc.nextInt();
		System.out.print("Paper 5: ");
		int m5 = sc.nextInt();

		int total_obt = m1+m2+m3+m4+m5;
		float percent = (total_obt * 100)/total_marks; 

		System.out.println("Total marks obtained are: " + total_obt);
		System.out.println("Percentage obtained is: " + percent + "%");
	}
}