
public class Date {
	private int year, month, day;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public Date()
	{
		this(1990,1,1);
	}
	public Date(int year)
	{
		this(year,1,1);
	}
	public Date(int year, int month)
	{
		this(year,month,1);
	}
	
	public Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	protected boolean isReap() {
		if((year%4 == 0 && year%100 != 0)|| year%400 ==0)
			return true;
		else
			return false;
	}
	
	public String testReapYears() {
		if(isReap())
			return (year + "년은 윤년입니다.");
		else
			return (year + "년은 윤년이 아닙니다.");
	}
}
