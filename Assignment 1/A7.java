import java.util.Scanner;
class A7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any letter, number or special character: ");
		String symbol = sc.next();
		char char_sym = symbol.charAt(0);
		int ascii_num = char_sym;

		if(47 < ascii_num && ascii_num < 58)
			System.out.println(symbol + " is a Digit");
		else if (64 < ascii_num && ascii_num < 91) {
			System.out.println(symbol + " is an Uppercase Alphabet");
		}
		else if (96 < ascii_num && ascii_num < 123) {
			System.out.println(symbol + " is a Lowercase Alphabet");
		}
		else
			System.out.println(symbol + " is a Special Character");
	}
}