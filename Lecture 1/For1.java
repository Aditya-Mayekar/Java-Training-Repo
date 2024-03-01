class For1{
	public static void main(String[] args) {
		int num, fact=1;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();
		for(int i = 1; i <= num; i++){
			fact *= i;
		}
		System.out.println("Factorial is: " + fact);
	}
}