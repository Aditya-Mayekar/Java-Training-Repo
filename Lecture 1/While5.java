class While5{
	public static void main(String[] args) {
		int num, finalnum, result = 0, rem;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();
		finalnum = num;
		while(num > 0){
			rem = num % 10;
			result += Math.pow(rem,3);
			num /= 10;
		} 

		if(result == finalnum)
			System.out.println(finalnum + " is an armstrong number");
		else
			System.out.println(finalnum + " is not an armstrong number");
	}
}