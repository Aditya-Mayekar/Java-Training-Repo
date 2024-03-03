import java.util.Scanner;
class A1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();

		if(num > 20){
			System.out.println(num + " is greater than 20");
		}
		else if (num == 20) {
			System.out.println(num + " is equal to 20");
		}
		else{
			System.out.println(num + " is smaller than 20");
		}
	}
}