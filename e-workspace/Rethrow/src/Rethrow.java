public class Rethrow {

	public static void main(String[] args) {
		try {
			f();
		}
		catch(Exception ex) {
			ex.printStackTrace(); // message도 같이 출력
		}
		System.out.println("This is main()");
	}
	
	static void f() throws Exception
	{
		try {
			g();
		}
		catch (Exception ex) {
			System.out.println("Exception is caught in f().");
			throw ex; //<- 던졌다 , 호출한 쪽으로 간다 즉 main으로
		}
	}
	
	static void g() throws Exception 
	{
		throw new Exception ("Exception generated in g()."); // <- 인위적 오류 발생, 호출한 쪽으로 간다 (f())
	}
}