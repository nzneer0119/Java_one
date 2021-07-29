package chap10;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);			
		//} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			//System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
			//System.out.println("");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("");
		}  catch ( NumberFormatException e) {
			System.out.println("숫자로 변한할 수 없습니다.");
			System.out.println("");
		} 	catch (Exception e) {
			System.out.println("예외가 발생했습니다. 다시 실행해 보세요.");
			System.out.println("");
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
