import java.util.Scanner;
class For5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n,  sum = 1;
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter n: ");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			int no = i;
			int fact = 1;
			while(no>0){
				fact = fact * no;
				no--;
			}
			sum += (Math.pow(x, i)) / fact;
		}

		System.out.println("Sum is: " + sum);
	}
}