package chap03;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); 
		
		int score = 85;
		String result = (!(score>90))? "가": "나";
		System.out.println(result); 
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft); 
		
		int value = 356;
		System.out.println(value/100*100);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (((float)lengthTop + (float)lengthBottom) *height /2 );
		System.out.println(area);
		
		int x = 10;
		int y =5;
		
		System.out.println( (x>7) && (y<=5));
		System.out.println( (x%3 ==2) || (y%2  !=1));*/
		
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
		
		}
}
