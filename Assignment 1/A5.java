import java.util.Scanner;

class A5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three angles:");
		System.out.print("Angle 1: ");
		int angle1 = sc.nextInt();
		System.out.print("Angle 2: ");
		int angle2 = sc.nextInt();
		System.out.print("Angle 3: ");
		int angle3 = sc.nextInt();

		if(angle1+angle2+angle3 == 180)
			System.out.println("These are the angles of a triangle");
		else
			System.out.println("These are not the angles of a triangle");
	}
}