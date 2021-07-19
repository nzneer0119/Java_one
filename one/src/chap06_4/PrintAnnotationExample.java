package chap06_4;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method[] declareMethods = Service.class.getDeclaredAnnotations();
		
		//Method 객체를 하나씩 처리
		for(Method method : declaredMethodes) {
			//PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				
			}
		}
		

	}

}
