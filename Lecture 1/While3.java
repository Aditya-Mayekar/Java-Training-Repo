class While3{
	public static void main(String[] args) {
		int num, product = 1;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();

		while(num > 0){
			product = product * (num % 10);
			num /= 10;
		}
		System.out.println("Product of the digits is: " + product);
	}
}