class Assignment3_1{
	public static void main(String[] args) {
		int n = 65;
		for(int i = 1; i <= 5; i++){
			for (int j = 1; j <= 5; j++) {
				System.out.print((char)n + " ");
			}
			n++;
			System.out.println();
		}
	}
}