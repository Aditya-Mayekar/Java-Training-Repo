import java.util.Scanner;
class A15{
	public static void main(String[] args) {
		int s1, s2, s3;
		String n1, n2, n3;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student 1 Name: ");
		n1 = sc.next();
		System.out.print("Enter his/her marks: ");
		s1 = sc.nextInt();
		System.out.print("Enter Student 2 Name: ");
		n2 = sc.next();
		System.out.print("Enter his/her marks: ");
		s2 = sc.nextInt();
		System.out.print("Enter Student 3 Name: ");
		n3 = sc.next();
		System.out.print("Enter his/her marks: ");
		s3 = sc.nextInt();
		
		if(s1 > s2){
			if(s1 > s3){
				System.out.println(n1 + " has scored the distinction with " + s1 + " marks");
			}
			else
				System.out.println(n3 + " has scored the distinction with " + s3 + " marks");
		}
		else if(s2 > s1){
			if(s2 > s3){
				System.out.println(n2 + " has scored the distinction with " + s2 + " marks");
			}
			else
				System.out.println(n3 + " has scored the distinction with " + s3 + " marks");
		}
		else{
			System.out.println(n3 + " has scored the distinction with " + s3 + " marks");
		}
	}
}