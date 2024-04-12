import java.util.*;
class Student{
	Scanner sc = new Scanner(System.in);
	int sid[] = new int[10];
	String sname[] = new String[10];
	String city[] = new String[10];
	String mobile[] = new String[10];
	int i = 0;

	public void addStudent(){
		System.out.print("Enter Student ID: ");
		sid[i] = sc.nextInt();
		System.out.print("Enter Student Name: ");
		sname[i] = sc.next();
		System.out.print("Enter Student City: ");
		city[i] = sc.next();
		System.out.print("Enter Student Mobile number: ");
		mobile[i] = sc.next();
		i++;
		System.out.println("Record added successfully!");
	}

	public void updateStudent(){
		System.out.print("Enter Student ID which you want to update: ");
		int id = sc.nextInt();
		boolean flag = false;
		for(int j = 0; j < i; j++){
			if(id == sid[j]){
				System.out.println("Student Details-");
				System.out.println("Student ID: " + sid[j]);
				System.out.println("1. Student Name: " + sname[j]);
				System.out.println("2. Student City: " + city[j]);
				System.out.println("3. Student Mobile number: " + mobile[j]);
				System.out.print("Enter the option number which you want to update: ");
				int n = sc.nextInt();
				switch(n){
					case 1:
						System.out.print("Enter new Student Name: ");
						String newname = sc.next();
						sname[j] = newname;
						break;
					case 2:
						System.out.print("Enter new City: ");
						String newcity = sc.next();
						city[j] = newcity;
						break;
					case 3:
						System.out.print("Enter new Mobile number: ");
						String newmobile = sc.next();
						mobile[j] = newmobile;
						break;
				}
			}
		}
		if(flag){
			System.out.println("Record updated successfully!");
		}
		else{
			System.out.println("Student with " + id + " not found.");
		}	
	}

	public void deleteStudent(){
			System.out.print("Enter Student ID which you want to delete: ");
			int id = sc.nextInt();
			boolean flag = false;
			for(int j = 0; j < i; j++){
				if(id == sid[j]){
					for(int k = j; k < i; k++){
						sid[k] = sid[k+1];
						sname[k] = sname[k+1];
						city[k] = city[k+1];
						mobile[k] = mobile[k+1];
					}
					--i;
					flag = true;
				}
			}
			if(flag){
				System.out.println("Record deleted successfully!");
			}
			else{
				System.out.println("Student with " + id + " not found.");
			}
	}

	public void showStudent(){
		System.out.println("Sr no.\tID\tName\tCity\tMobile");
		for(int j = 0; j < i; j++){
			System.out.println((j+1) + "\t" +sid[j] + "\t" + sname[j] + "\t" + city[j] + "\t" + mobile[j]);
		}
	}
}
class Lecture4_13{
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("\nStudent Record Management-");
			System.out.println("1. Add New Student");
			System.out.println("2. Update Student Details");
			System.out.println("3. Delete Student Details");
			System.out.println("4. Show All Student Details");
			System.out.println("5. Exit");
			System.out.print("Select the option which you want to perform: ");
			int ch = sc.nextInt();

			switch(ch){
				case 1:
					s.addStudent();
					break;
				case 2:
					s.updateStudent();
					break;
				case 3:
					s.deleteStudent();
					break;
				case 4:
					s.showStudent();
					break;
				case 5:
					System.exit(0);
			}
		}
	}
}