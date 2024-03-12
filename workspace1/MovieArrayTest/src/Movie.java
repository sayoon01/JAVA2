
public class Movie {
	String title, director;
	static int count = 0;
	
	public Movie(String title,String director)
	{
		this.title = title;
		this.director = director;
		count++;
	}
}
