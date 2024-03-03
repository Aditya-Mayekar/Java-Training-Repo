import java.util.Scanner;
class A8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();

		if(num > 0)
			System.out.println("It's a positive number");
		else if (num < 0) {
			System.out.println("It's a negative number");
		}
		else
			System.out.println("The number is 0");
	}
}