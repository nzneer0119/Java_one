package chap03;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		
		/*
		double pieceUnit = 0.1;
		
		float number = 7;
		
		double result = apple - number * pieceUnit;
		*/
		
		int totalPieces = apple * 10 ;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면. ");
		System.out.println(result + "조각이 남는다. ");
			
	}

}
