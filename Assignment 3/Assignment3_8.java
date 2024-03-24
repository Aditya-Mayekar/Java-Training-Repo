class Assignment3_8{
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int n = 1;
			for(int k = 9; k >= i; k--){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}
}