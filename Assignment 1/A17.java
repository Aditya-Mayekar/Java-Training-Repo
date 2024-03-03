import java.util.Scanner;

class A17{

	public static int count(int num){
		String numstr = Integer.toString(num);
		int size = numstr.length();
		return size;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		int result = 0;
		int digits = count(num);
		for(int i = 0; i < digits; i++){
			int n = num % 10;
			num /= 10;
			result += n;
		}
		
		if(result > 10)
			System.out.println(result + " is greater than 10");
		else
			System.out.println(result + " is not greater than 10");
	}
}