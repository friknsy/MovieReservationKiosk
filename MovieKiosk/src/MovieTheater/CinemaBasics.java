package MovieTheater;

public class CinemaBasics
{


	//SeatProgramming sp = new SeatProgramming();
	//Paymenttest pt = new Paymenttest();

	
	private int movie;			// ��ȭ����
	private String seat  ;		// �¼�
	private int time;			// �����ѽð�
	private int price;			// �� �����ؾ��ϴ� �ݾ�
	private int number;			// �����ȣ


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
