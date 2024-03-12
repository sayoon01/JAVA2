import java.lang.ArithmeticException;

public class PrintException4 {

	public static void main(String[] args) {
		f();
	}
	
	static void f() {
		g();
	}
	
	static void g() {
		h();
	}
	
	static void h() {
		try {
			int a = 100 / 0;
		}
		catch (ArithmeticException ex) {
			
			StackTraceElement[] arr; // <- 배열 형식으로 retrun
			//ex.getStackTrace는 스택의 상태 리턴 하는데 배열로 리턴
			
			arr = ex.getStackTrace(); //  <- 예외 발생 당시 스택의 상태를 자세히 검사하기 위해 사용
			for(StackTraceElement ele : arr) {
				System.out.printf("%s\t^s\t%s\t%d\n", ele.getClassName(), ele.getMethodName(), ele.getFileName(), ele.getLineNumber());
			}
		}
	}
}
