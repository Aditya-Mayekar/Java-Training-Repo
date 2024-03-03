import java.util.Scanner;

class A24{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum = sum + (2 * i);
		}

		System.out.println("The sum of first " + num + " even numbers is: " + sum);
	}
}