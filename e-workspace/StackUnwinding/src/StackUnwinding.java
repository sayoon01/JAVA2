
public class StackUnwinding {

	public static void main(String[] args) {
		try {
			f();
		}
		catch (Exception ex) {
			Exception ex3 = new Exception();
			System.out.print("main(): ");
			ex3.printStackTrace();
		}
	}
	
	static void f() throws Exception 
	{
		try {
			g();
		}
		catch(Exception ex) {
			Exception ex2 = new Exception();
			System.out.print("f(): ");
			ex2.printStackTrace();
			throw ex2;
		}
	}
	
	static void g() throws Exception 
	{
		Exception ex = new Exception();
		System.out.print("g(): ");
		ex.printStackTrace();
		throw ex; //예외 발생-> 호출 했던 곳 try블록으로 이동 -> 현재 메소드 g()는 종료 (스택에서 제거)
		          // -> g() 종료 (stack에서 종료)
	}
}
