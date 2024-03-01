class For3{
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3, range;
		System.out.print("Enter a number: ");
		range = new java.util.Scanner(System.in).nextInt();
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