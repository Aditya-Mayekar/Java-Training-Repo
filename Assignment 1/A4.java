import java.util.Scanner;
class A4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();

		if(num % 2 == 0)
			System.out.println(num + " is an even number");
		else
			System.out.println(num + " is an odd number");
	}
}