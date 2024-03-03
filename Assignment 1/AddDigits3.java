class AddDigits3{
	public static void main(String[] args){
		int num = 251;
		int n1 = num % 10;
		num /= 10;
		int n2 = num % 10;
		num /= 10;
		int n3 = num % 10;
		int result = n1 + n2 + n3;
		System.out.println(result);
	}
}