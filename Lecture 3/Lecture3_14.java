class Lecture3_14{
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10000; i++){
			int num, digit, result = 0, count = 0, countnum;
			num = i;
			countnum = i;
			while(countnum > 0){
				countnum /= 10;
				count++;
			}
			while(num > 0){
				digit = num % 10;
				result += Math.pow(digit, count);
				num /= 10;
			}
			if(result == i){
				System.out.println(i + " is an armstrong number");
				if(count == 3){
					sum += result;
				}
			}
		}
		System.out.println("Sum of 3 digit armstrong number is: " + sum);
	}
}