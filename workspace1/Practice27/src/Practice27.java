
public class Practice27 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = new Date();
		Date d4 = new Date();
		d1.year = 2004;
		d2.year = 1997;
		d3.year = 1900;
		d4.year = 2000;
		
		System.out.println(d1.testReapYears());
		System.out.println(d2.testReapYears());
		System.out.println(d3.testReapYears());
		System.out.println(d4.testReapYears());
	}

}
