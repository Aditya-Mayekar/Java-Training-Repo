class For2{
	public static void main(String[] args) {
		int num, sum =  0;

		for(int i = 1; i <= 20; i++){
			if(i % 2 == 0){
				sum += i; 
			}
		}
		System.out.println("Sum of even numbers from 1 to 20 is: " + sum);
	}
}