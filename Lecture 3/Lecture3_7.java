class Lecture3_7{
	public static void main(String[] args) {
		int n = 1;
		for(int i = 4; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
			for(int k = 4; k >= i; k--){
				System.out.print(" ");
			}
		}
	}
}