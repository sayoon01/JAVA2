
public class Date {
	int year,month,day;
	
	public Date()
	{
		this(1990,1,1);
	}
	public Date(int year)
	{
		this(year,1,1);
	}
	public Date(int year,int month)
	{
		this(year,month,1);
	}
	public Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return "" + year + "³â " + month + "¿ù " + day + "ÀÏ";
	}
}
