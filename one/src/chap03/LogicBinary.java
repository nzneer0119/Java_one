package chap03;

public class LogicBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 7;
		
		byte num1 = 5;
		byte num2 = 7;
		
		byte result1 = (byte) (num1 & num2);
		byte result2 = (byte) (num1 ^ num2);
		
		System.out.println(a==5 && b==7);
		System.out.println(result1); // 5(101), 7(111)  / 5 and 7 / 101 & 111 = 101 --> 5
		System.out.println(result2); // 5(101), 7(111)  / 5 XOR 7 / 101 & 111 = 010 --> 2
	}
}
