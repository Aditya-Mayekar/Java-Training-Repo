class Lecture3_9{
	public static void main(String[] args) {
		int n = 1, m = 6;
		for(int i = 1; i <= 4; i++){
			for(int k = m; k >= 1; k--){
				System.out.print(" ");
			}
			for(int j = 1; j <= n; j++){
				System.out.print("* ");
			}
			System.out.println();
			n += 2;
			m -= 2;
		}
	}
}