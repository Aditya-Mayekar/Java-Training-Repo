class While1{
	public static void main(String[] args) {
		int num, count=0;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();

		while(num>0){
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits are: " + count);
	}
}