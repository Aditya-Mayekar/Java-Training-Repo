import java.util.Scanner;
class A10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m1, m2, m3, m4, m5, obtained, percent;
		System.out.println("Enter your marks-");
		System.out.print("Subject 1: ");
		m1 = sc.nextInt();
		System.out.print("Subject 2: ");
		m2 = sc.nextInt();
		System.out.print("Subject 3: ");
		m3 = sc.nextInt();
		System.out.print("Subject 4: ");
		m4 = sc.nextInt();
		System.out.print("Subject 5: ");
		m5 = sc.nextInt();

		obtained = m1 + m2 + m3 + m4 + m5;
		percent = (obtained * 100) /500;

		if(percent >= 90)
			System.out.println("You have scored A grade");
		else if (percent >= 80 && percent < 90) {
		 	System.out.println("You have scored B grade");
		} 
		else if (percent >= 70 && percent < 80) {
			System.out.println("You have scored C grade");
		}
		else
			System.out.println("Study harder, you have scored below 60%");
	}
}