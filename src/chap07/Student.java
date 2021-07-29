package chap07;

public class Student extends People{
	public String studentNo;
	
	public Student(String name, String ssn, String studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
}
