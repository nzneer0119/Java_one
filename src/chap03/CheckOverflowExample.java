package chap03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = safeAdd(200, 20000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		} finally {
			System.out.println("뭔가뭔가??");
		}
	}

	private static int safeAdd(int left, int right) {
		// TODO Auto-generated method stub
		if((right>0)) {
		if (left>(Integer.MAX_VALUE - right)) {
			throw new ArithmeticException("오버플로우 발생");
		}
	} else {
		if (left<(Integer.MIN_VALUE - right)) {
			throw new ArithmeticException("오버플로우 발생");
		}
	}
			return left + right;
	}
}
