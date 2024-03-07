class Assignment2_5{
	public static void main(String[] args) {
		int rem, i = 1;

		while(i <= 9999){
			int rev = 0;
			int num = i;
			while(num != 0){
				rem = num % 10;
				rev = rev * 10 + rem;
				num /= 10;
			}
			if(i == rev)
				System.out.println(i + " is a palindrome");
			
			i++;
		}
	}
}