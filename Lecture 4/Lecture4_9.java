import java.util.*;
class Lecture4_9{
	public static void main(String[] args) {
		String[] names = {"Aditya", "Shubham", "Yash", "Aditya", "Yash"};
		for(int i = 0; i < names.length; i++){
			for(int j = i+1; j < names.length; j++){
				if(names[i].equals(names[j])){
					System.out.println("Duplicate name: " + names[i]);
				}
			}
		}
	}
}