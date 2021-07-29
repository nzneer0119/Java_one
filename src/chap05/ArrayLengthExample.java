package chap05;

import java.text.DecimalFormat;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		DecimalFormat form = new DecimalFormat("#.##");
		
		System.out.println("종합 : " + form.format(sum));
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + form.format(avg));
	}
}
