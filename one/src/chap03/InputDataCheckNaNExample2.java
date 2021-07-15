package chap03;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";  // 5 % 0.0으로 NaN이 발생
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리 할 수 없습니다.");
			val = 0.0; // NaN이 입력되어 초기화 실행..
		}
		
		currentBalance += val;   // 만약 10000 + Nan의 결과는?
		System.out.println(currentBalance);
	}
}
