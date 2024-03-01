import java.util.Scanner;
class For4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n, sum = 1;
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter n: ");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			sum += (Math.pow(x, i)) / i;
		}

		System.out.println("Sum is: " + sum);
	}
}