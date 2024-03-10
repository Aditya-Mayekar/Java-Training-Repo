class Lecture3_10{
	public static void main(String[] args) {
		int n = 1, sum = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++) {
				System.out.print(n + "\t");
				if(i == j){
					sum += n;
				}
				n++;
			}
			System.out.println();
		}
		System.out.println("Sum of left diagonal: " + sum);
	}
}