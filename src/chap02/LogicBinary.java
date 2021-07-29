package chap02;

public class LogicBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7, b=5;
		// int c = a>3 && b>4;
		String e;
		String f;
		
		if (a>=1 && b>=1) {
			e = "True";
		}else {
			e = "False";
		}
		System.out.println(e);

		if (a>=1 || b<=1) {
			f = "True";
		}else {
			f = "False";
		}
		System.out.println(f);
		
		int d = a & b;
		
		System.out.println(a>3 && b>4);
		System.out.println(a<3 && b<4);
		System.out.println(a>3 && b<4);
		System.out.println(a<3 && b>4);
		System.out.println(d); 
		  // 7의 2진수 111 , 5의 2진수 101의 AND는 101이고 101을 10진수로 표현하면 5

	}

}
