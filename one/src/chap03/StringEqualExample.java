package chap03;

public class StringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "임학수";
		String strVar2 = "임학수";
		String strVar3 = new String("임학수");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
	}
}
