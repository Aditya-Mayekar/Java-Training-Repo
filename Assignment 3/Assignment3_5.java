class Assignment3_5{
	public static void main(String[] args) {
		int n = 74;
		for(int i = 1; i <= 10; i++){
			for (int j = 1; j <= 10; j++) {
				System.out.print((char)n + " ");
			}
			n--;
			System.out.println();
		}
	}
}