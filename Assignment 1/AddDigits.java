class AddDigits{
	public static void main(String[] args){
		int num = 25;
		int n1 = num % 10;
		num /= 10;
		int n2 = num % 10;
		int result = n1 + n2;
		System.out.println(result);
	}
}
