class Assignment3_7{
	public static void main(String[] args) {
		int n = 74, m = 10;
		for(int i = 1; i <= 10; i++){
			for (int j = 1; j <= m; j++) {
				System.out.print((char)n + " ");
			}
			n--;
			m--;
			System.out.println();
		}
	}
}