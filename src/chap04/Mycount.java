package chap04;

public class Mycount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for (int i=0; i<10; i+=2) {
			System.out.print((i+1) + " ");
		}
		System.out.println("");
		for (int j=0; j<10; j++) {
			System.out.print((j+1) + " ");
		}
		
		for (int k=1; k<10; k++) {
			System.out.println("2 * "+ k +" = "+ (k*2));
		*/
		//int i =9;
		for (int i=2; i<=9; i++) {
			System.out.println(" ***" + i + " 단 ***");
				for (int j=1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));		
				}
		}
	}
}
