package chap03;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";  // 5 % 0.0으로 NaN이 발생
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;   // 만약 10000 + Nan의 결과는?
		System.out.println(currentBalance);
	}
}