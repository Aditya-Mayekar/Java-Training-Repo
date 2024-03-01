class For7{
	public static void main(String[] args) {
		int num1, num2, result = 0;
		System.out.print("Enter first num: ");
		num1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter second num: ");
		num2 = new java.util.Scanner(System.in).nextInt();

		for(int i = 1; i <= num2; i++){
			result += num1 * 1;
		}

		System.out.println(result);
	}
}