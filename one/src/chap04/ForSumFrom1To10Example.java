package chap04;

public class ForSumFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100 합 : " + sum);
	}
}
