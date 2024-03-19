class Assignment3_8{
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1; i<=10; i++){
			int num = 74;
			for(int j = 1; j<=n; j++){
				System.out.print((char)num + " ");
				num--;
			}
			n--;
			System.out.println();
		}
	}
}