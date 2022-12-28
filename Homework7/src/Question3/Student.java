package Question3;

public class Student {
	
	/* Tahminlerim:
	 * 
	 * System.out.println(s1.number)  --- 111
	 * System.out.println(s2.number) --- 222
	 * 
	 * System.out.println(s1.name) --- Karan
	 * System.out.println(s2.name)--- Ayran
	 * 
	 * System.out.println(s1.college) --- Harvard
	 * System.out.println(s2.college)--- Harvard
	 * */
	
	int number;
	String name;
	static String college ="ITS";
	
	Student(int r, String n, String college) {
		
		this.number = r;
		this.name = n;
		this.college = college;
	}



	public static void main(String[] args) {
		
		Student s1 = new Student (111,"Karan", "MIT");
		
		Student s2 = new Student (222,"Ayran", "Harvard");
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println(s1.college);
		System.out.println(s2.college);


	}

}
