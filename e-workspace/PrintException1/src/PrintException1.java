import java.lang.ArithmeticException;

public class PrintException1 {

	public static void main(String[] args) {
		try {
			int a = 100 / 0;
		}
		catch (ArithmeticException ex) {
			//System.out.println(ex); // <- 예외 객체 print String 자동 호출
			System.out.println(ex.getMessage()); // <- 예외 객체에 저장된 메세지 리턴
			// ex.getMessage()는 예외 객체 ex에 저장된 메세지 리턴
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("End of main");
	}

}
