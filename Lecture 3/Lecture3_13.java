class Lecture3_13{
	public static void main(String[] args) {
		// int n = 0, m = 11;
		// for(int i = 1; i <= 5; i++){
		// 	n++;
		// 	m--;
		// 	if(n == 3)
		// 		continue;
		// 	System.out.println(n + "\t" + m);
		// }
		
		for(int i=1, j=10; i<j; i++, j--){
			if(i == 3)
				continue;
			System.out.println(i + "\t" + j);
		}
	}
}