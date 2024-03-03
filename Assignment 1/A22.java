import java.util.Scanner;
class A22{
	public static void main(String[] args) {
		String letter;
		System.out.print("Enter any letter: ");
		letter = new java.util.Scanner(System.in).next();

		if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
			System.out.println(letter + " is a vowel");
		else
			System.out.println(letter + " is a consonent");
	}
}