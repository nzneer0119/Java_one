package chap02;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++; // 증감 연산자
			var2++;
			System.out.println("var1 :" +var1 + "\t" + "var2: " + var2);
		}
	*/
		int a = 4;
		int b = 3;
		double c = a/(double)b;
		System.out.println(c);
	}
}
