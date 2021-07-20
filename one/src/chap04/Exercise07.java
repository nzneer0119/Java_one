package chap04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");		
			//작성위치
			int number = scanner.nextInt();
			int money = 0;
			
			switch(number) {
				case 1:
					System.out.print("예금액 > ");
					money = scanner.nextInt();
					balance += money;
					break;
				case 2:
					System.out.print("출금액 > ");
					money = scanner.nextInt();
					balance -= money;
					break;
				case 3:
					System.out.print("잔고> " + balance);
					System.out.println("");
					break;
				case 4:
					run = false;
					break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
