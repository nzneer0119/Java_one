package chap04;

import java.io.IOException;

public class Homework01 {

	public static void main(String[] args)  throws IOException{
		boolean run = true;
        int keyCode = 0;
        
        while (run) 
        { 
            if (keyCode!=13&&keyCode!=10) {
            	 System.out.println("----------------------------------");
            	 System.out.println("   숫자 or 문자를 입력하세요. ");
                 System.out.println("중지 하려면 숫자 0을 누르세요.");     
            	 System.out.println("----------------------------------");
                 System.out.print("입력 : "); 
             }             
             keyCode = System.in.read();
             	{
            if ((keyCode >=49) && (keyCode <=57) )  {
                System.out.println("숫자입니다.");
            }
           	 else if ((keyCode >=65) && (keyCode <=90)) {
            	 System.out.println("문자입니다.");
           	}
             else if ((keyCode >=97) && (keyCode <=122)) {
            	 System.out.println("문자입니다.");
           	}
             else if ((keyCode ==48)) {
             	 run = false;
           	}  else {
            	System.out.println("특수문자입니다.");
           	}
       }
     }
        System.out.println("종료합니다.");
     }
}
