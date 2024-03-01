class While6{
	public static void main(String[] args) {
		int num, temp, rem, rev = 0;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();
		temp = num;
		
		while(num > 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}

		if(rev == temp)
			System.out.println(temp + " is a palindrome");
		else
			System.out.println(temp + " is not a palindrome");

		System.out.println(rev);
	}
}