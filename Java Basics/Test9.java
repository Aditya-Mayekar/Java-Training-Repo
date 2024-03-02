class Test9{
	public static void main(String[] args){
		System.out.print("Enter any number:");
		int num = new java.util.Scanner(System.in).nextInt();

		if(num % 2 == 0)
			System.out.println(num + " is an even number");
		else
			System.out.println(num + " is an odd number");
	}
}