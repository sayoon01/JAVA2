
public class Date {
	int year;
	
	protected boolean isReap()
	{
		if(year%4==0)
			{return true;
			
			}
		else if(year%100==0)
			{return false;
			
			}
		else if(year%400==0)
			{return true;
			
			}
		else
			{return false;
			
			}
	}
	
	public String testReapYears()
	{
		if(isReap())
			return "" +year + "¿∫ ¿±≥‚¿‘¥œ¥Ÿ.";
		else
			return "" + year + "¿∫ ¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.";
	}
}
