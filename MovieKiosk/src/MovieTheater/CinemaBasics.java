package MovieTheater;

public class CinemaBasics
{


	//SeatProgramming sp = new SeatProgramming();
	//Paymenttest pt = new Paymenttest();

	
	private int movie;			// 영화제목
	private String seat  ;		// 좌석
	private int time;			// 예약한시간
	private int price;			// 총 지불해야하는 금액
	private int number;			// 예약번호


	public int getMovie()
	{
		return movie;
	}

	public void setMovie(int movie)
	{
		this.movie = movie;
	}

	public int getTime()
	{
		return time;
	}

	public void setTime(int time)
	{
		this.time = time;
	}

	public int getPrice()
	{
		
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public String getSeat()
	{
		
		return seat;
	}

	public void setSeat(String seat)
	{
		this.seat = seat;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number; 
	}
	

	@Override
	public String toString()
	{
		return     "   "+this.getMovie()  + "    "+
			       "   "+this.getSeat()   + "    "+ 
				   "   "+this.getTime()   + "    "+
			       "   "+this.getNumber() + "    "+
				   "   "+this.getPrice()  + "    ";
	}

} 
