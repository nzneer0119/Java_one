package chap07;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("홍길동", "123456-1234567", "01");
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}
