class While2{
	public static void main(String[] args) {
		int num, sum = 0;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();

		while(num > 0){
			sum = sum + (num % 10);
			num /= 10;
		}
		System.out.println("Sum of digits is: " + sum);
	}
}