package dto;

public class Movie
{
	private int movieid;
	private String moviename;
	private double movieprice;
	private double movierating;
	private String moviegenre;
	private String movielanguage;
	private byte[] movieimage;
	
	public int getMovieid()
	{
		return movieid;
	}
	public String getMoviename() 
	{
		return moviename;
	}
	public double getMovieprice() 
	{
		return movieprice;
	}
	public double getMovierating()
	{
		return movierating;
	}
	public String getMoviegenre()
	{
		return moviegenre;
	}
	public String getMovielanguage() 
	{
		return movielanguage;
	}
	public byte[] getMovieimage() 
	{
		return movieimage;
	}
	
	public void setMovieid(int movieid) 
	{
		this.movieid = movieid;
	}
	public void setMoviename(String moviename) 
	{
		this.moviename = moviename;
	}
	public void setMovieprice(double movieprice) 
	{
		this.movieprice = movieprice;
	}
	public void setMovierating(double movierating)
	{
		this.movierating = movierating;
	}
	public void setMoviegenre(String moviegenre) 
	{
		this.moviegenre = moviegenre;
	}
	public void setMovielanguage(String movielanguage)
	{
		this.movielanguage = movielanguage;
	}
	public void setMovieimage(byte[] movieimage)
	{
		this.movieimage = movieimage;
	}
}
