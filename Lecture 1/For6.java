class For6{
	public static void main(String[] args) {
		int num;
		System.out.print("Enter any number: ");
		num = new java.util.Scanner(System.in).nextInt();

		for(int i = num; i >= 0; i -= 2){
			System.out.println(i);
		}
	}
}