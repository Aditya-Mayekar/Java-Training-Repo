import java.util.Scanner;
class Assignment2_2{
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3, range;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		range = sc.nextInt();
		System.out.println("Fibonacci Series is: ");
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 1; i <= range; i++){
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}