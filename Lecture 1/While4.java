class While4{
	public static void main(String[] args) {
		int num, fact = 1;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();

		while(num > 0){
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial of the number is: " + fact);
	}
}