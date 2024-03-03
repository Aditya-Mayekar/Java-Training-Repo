import java.util.Scanner;

class A16{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 angles-");
		System.out.println("Angle 1: ");
		int angle1 = sc.nextInt();
		System.out.println("Angle 2: ");
		int angle2 = sc.nextInt();
		System.out.println("Angle 3: ");
		int angle3 = sc.nextInt();

		if(angle1 + angle2 + angle3 == 180){
			if(angle1 < 90 && angle2 < 90 && angle3 < 90){
				System.out.println("It is an acute angle triangle");
			}
			else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
				System.out.println("It is a right angle triangle");
			}
			else{
				System.out.println("It is an obtuse angle triangle");
			}
		}
		else
			System.out.println("It is not a triangle");
	}
}