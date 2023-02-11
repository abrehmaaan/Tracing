class Student{
	private int ID;
	private String SName;
	private double SGPA;
	public Student(int iD, String sName, double d) {
		ID = iD;
		SName = sName;
		if(d >= 1 && d <= 4)
			SGPA = d;
		else
			SGPA = 1;
	}
	public void print() {
		System.out.println("Student ID is "+ID);
		System.out.println("Student name is "+SName);
		System.out.println("Student GPA is "+SGPA);
	}
	public double getSGPA() {
		return SGPA;
	}
	public void setSGPA(double sGPA) {
		if(sGPA >= 1 && sGPA <= 4)
			SGPA = sGPA;
		else
			SGPA = 1;
	}
	
}
public class Program {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ABC", 3.9);
		s1.print();
		Student s2 = new Student(2, "XYZ", 2.9);
		s2.print();
	}
}
