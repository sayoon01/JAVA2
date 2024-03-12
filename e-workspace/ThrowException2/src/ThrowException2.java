public class ThrowException2 {

	public static void main(String[] args) 
	{
		try {
			f();
		}
		catch (Exception ex) {
			System.out.println("Exception is caught");
		}
		System.out.println("This is main()");
	}
	
	static void f() throws Exception // <- 선언 
	{
		Exception ex = new Exception(); // <- Exception 은 checked 객체는 예외대응 필요
		throw ex; // 인위적인 예외 발생, 예외 객체를 던짐 / rethrowing (catch한 예외를 다시 던짐)
		          //  -> compile error 1. 예외 catch문 필요 2.미리 선언 <- 예외처리 하지 않았으므로
	}

}
