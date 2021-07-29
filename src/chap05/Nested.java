package chap05;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade ="";
		int jumsu = 55;
		int result =jumsu/10;
		
		switch (result) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F";
			break;
	}
		System.out.println("당신의 성적은 " + grade + " 입니다.");
	}
}
