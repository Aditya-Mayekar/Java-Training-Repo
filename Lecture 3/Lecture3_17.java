class Lecture3_17{
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= 5; i++){
			for (int j = 1; j <= 5; j++) {
				System.out.print(n + " ");
			}
			System.out.println();
			n--;
		}
	}
}