package chap_re_08.mydefault;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		System.out.println();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}
}
