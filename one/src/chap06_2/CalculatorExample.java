package chap06_2;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Calculator= new Calculator(); // --> static을 public으로 변경시 필요 
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("resut 1 : " + result1);
		System.out.println("resut 2 : " + result2);
		System.out.println("resut 3 : " + result3);
	}
}
