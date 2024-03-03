import java.util.Scanner;
class A11{
	public static void main(String[] args) {
		int base_sal = 20000, daily, travel, rent, gross_sal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Daily Allowance: ");
		daily = sc.nextInt();
		System.out.print("Enter your Travel Allowance: ");
		travel = sc.nextInt();
		System.out.print("Enter your House Rent: ");
		rent = sc.nextInt();

		gross_sal = base_sal + daily + travel + rent;

		System.out.println("Your Gross Salary is: Rs " + gross_sal);
	}
}