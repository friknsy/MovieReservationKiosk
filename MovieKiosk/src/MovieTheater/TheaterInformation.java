package MovieTheater;


//TheaterInformation 클래스에는 private 접근제어자 속성값들과 그에 접근하기 위한 getter/setter 메소드들로 이루어져 있습니다. 
//이 속성값들은 TISet 클래스에서 초기화 시킵니다. 


public class TheaterInformation
{

				private String movieName; //영화이름
				private int ageAllowance; //관람등급
				private int hour1; //첫 번째 상영시작시간의 '시간'
				private int minute1; // 첫 번째 상영시작시간의 '분'  이하 2~4번째 상영시작시간의 시간과 분
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 영화의 1타임 예매된 좌석 수
				private static int reservedSeats2; //각 영화별 2타임 예매된 좌석 수
				private static int reservedSeats3; //각 영화별 3타임 예매된 좌석 수
				private static int reservedSeats4; //각 영화별 4타임 예매된 좌석 수
				
				

				// 사용자 정의 생성자 (인자를 받는 생성자)
				public TheaterInformation (String movieName, int ageAllowance, int hour1, int minute1, 
					int hour2, int minute2, int hour3, int minute3, int hour4, int minute4, int reservedSeats1
					,int reservedSeats2,int reservedSeats3,int reservedSeats4)
				{
					this.movieName = movieName;
					this.ageAllowance = ageAllowance;
					this.hour1 = hour1;
					this.minute1 = minute1;
					this.hour2 = hour2;
					this.minute2 = minute2;
					this.hour3 = hour3;
					this.minute3 = minute3;
					this.hour4 = hour4;
					this.minute4 = minute4; 
					this.reservedSeats1 = reservedSeats1;
					this.reservedSeats2 = reservedSeats2;
					this.reservedSeats3 = reservedSeats3;
					this.reservedSeats4 = reservedSeats4;
				}

				public String getName()
				{
					return movieName;
					
				}
				public int getAge()
				{
					return ageAllowance;
				}	
				public int getHour1()
				{
					return hour1;
				}
				public int getMinute1()
				{
					return minute1;
				}
				public int getHour2()
				{
					return hour2;
				}
				public int getMinute2()
				{
					return minute2;
				}	
				public int getHour3()
				{
					return hour3;
				}
				public int getMinute3()
				{
					return minute3;
				}	
				public int getHour4()
				{
					return hour4;
				}
				public int getMinute4()
				{
					return minute4;
				}	
				public int getReservedSeats1()
				{
					return reservedSeats1;
				}
				public int getReservedSeats2()
				{
					return reservedSeats2;
				}
				public int getReservedSeats3()
				{
					return reservedSeats3;
				}
				public int getReservedSeats4()
				{
					return reservedSeats4;
				}
				
				
				
				
				
				
				//여기는 Setter. 나머지 속성의 경우 정해진 것이지만
				//예약된 좌석의 경우 난수발생/예매완료 에 따라 변하기 때문에 Setter 설정해두었습니다. 
				public void setReservedSeats1(int a)
				{
					reservedSeats1 += a;
				}
				public void setReservedSeats2(int a)
				{
					reservedSeats2 += a;
				}
				public void setReservedSeats3(int a)
				{
					reservedSeats3 += a;
				}
				public void setReservedSeats4(int a)
				{
					reservedSeats4 += a;
				}

				public void cutReservedSeats1(int a)
				{
					reservedSeats1 -=a;
				}
				// 예매 좌석 수를 감소시키는 메소드
				public void cutReservedSeats2(int a)
				{
					reservedSeats2 -=a;
				}
				public void cutReservedSeats3(int a)
				{
					reservedSeats3 -=a;
				}
				public void cutReservedSeats4(int a)
				{
					reservedSeats4 -=a;
				}


}

class TheaterInformation2
{

				private String movieName; //영화이름
				private int ageAllowance; //관람등급
				private int hour1; //첫 번째 상영시작시간의 '시간'
				private int minute1; // 첫 번째 상영시작시간의 '분'  이하 2~4번째 상영시작시간의 시간과 분
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 영화의 1타임 예매된 좌석 수
				private static int reservedSeats2; //각 영화별 2타임 예매된 좌석 수
				private static int reservedSeats3; //각 영화별 3타임 예매된 좌석 수
				private static int reservedSeats4; //각 영화별 4타임 예매된 좌석 수
				
				// 사용자 정의 생성자 (인자를 받는 생성자)
				public TheaterInformation2 (String movieName, int ageAllowance, int hour1, int minute1, 
					int hour2, int minute2, int hour3, int minute3, int hour4, int minute4, int reservedSeats1,int reservedSeats2,int reservedSeats3,int reservedSeats4)
				{
					this.movieName = movieName;
					this.ageAllowance = ageAllowance;
					this.hour1 = hour1;
					this.minute1 = minute1;
					this.hour2 = hour2;
					this.minute2 = minute2;
					this.hour3 = hour3;
					this.minute3 = minute3;
					this.hour4 = hour4;
					this.minute4 = minute4; 
					this.reservedSeats1 = reservedSeats1;
					this.reservedSeats2 = reservedSeats2;
					this.reservedSeats3 = reservedSeats3;
					this.reservedSeats4 = reservedSeats4;
				}

				public String getName()
				{
					return movieName;
					
				}
				public int getAge()
				{
					return ageAllowance;
				}	
				public int getHour1()
				{
					return hour1;
				}
				public int getMinute1()
				{
					return minute1;
				}
				public int getHour2()
				{
					return hour2;
				}
				public int getMinute2()
				{
					return minute2;
				}	
				public int getHour3()
				{
					return hour3;
				}
				public int getMinute3()
				{
					return minute3;
				}	
				public int getHour4()
				{
					return hour4;
				}
				public int getMinute4()
				{
					return minute4;
				}	
				public int getReservedSeats1()
				{
					return reservedSeats1;
				}
				public int getReservedSeats2()
				{
					return reservedSeats2;
				}
				public int getReservedSeats3()
				{
					return reservedSeats3;
				}
				public int getReservedSeats4()
				{
					return reservedSeats4;
				}
				
				
				
				
				
				
				//여기는 Setter. 나머지 속성의 경우 정해진 것이지만
				//예약된 좌석의 경우 난수발생/예매완료 에 따라 변하기 때문에 Setter 설정해두었습니다. 
				public void setReservedSeats1(int a)
				{
					reservedSeats1 += a;
				}
				public void setReservedSeats2(int a)
				{
					reservedSeats2 += a;
				}
				public void setReservedSeats3(int a)
				{
					reservedSeats3 += a;
				}
				public void setReservedSeats4(int a)
				{
					reservedSeats4 += a;
				}

				public void cutReservedSeats1(int a)
				{
					reservedSeats1 -=a;
				}
				public void cutReservedSeats2(int a)
				{
					reservedSeats2 -=a;
				}
				public void cutReservedSeats3(int a)
				{
					reservedSeats3 -=a;
				}
				public void cutReservedSeats4(int a)
				{
					reservedSeats4 -=a;
				}


}
class TheaterInformation3
{

				private String movieName; //영화이름
				private int ageAllowance; //관람등급
				private int hour1; //첫 번째 상영시작시간의 '시간'
				private int minute1; // 첫 번째 상영시작시간의 '분'  이하 2~4번째 상영시작시간의 시간과 분
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 영화의 1타임 예매된 좌석 수
				private static int reservedSeats2; //각 영화별 2타임 예매된 좌석 수
				private static int reservedSeats3; //각 영화별 3타임 예매된 좌석 수
				private static int reservedSeats4; //각 영화별 4타임 예매된 좌석 수
				
						

				// 사용자 정의 생성자 (인자를 받는 생성자)
				public TheaterInformation3 (String movieName, int ageAllowance, int hour1, int minute1, 
					int hour2, int minute2, int hour3, int minute3, int hour4, int minute4, int reservedSeats1,int reservedSeats2,int reservedSeats3,int reservedSeats4)
				{
					this.movieName = movieName;
					this.ageAllowance = ageAllowance;
					this.hour1 = hour1;
					this.minute1 = minute1;
					this.hour2 = hour2;
					this.minute2 = minute2;
					this.hour3 = hour3;
					this.minute3 = minute3;
					this.hour4 = hour4;
					this.minute4 = minute4; 
					this.reservedSeats1 = reservedSeats1;
					this.reservedSeats2 = reservedSeats2;
					this.reservedSeats3 = reservedSeats3;
					this.reservedSeats4 = reservedSeats4;
				}

				public String getName()
				{
					return movieName;
					
				}
				public int getAge()
				{
					return ageAllowance;
				}	
				public int getHour1()
				{
					return hour1;
				}
				public int getMinute1()
				{
					return minute1;
				}
				public int getHour2()
				{
					return hour2;
				}
				public int getMinute2()
				{
					return minute2;
				}	
				public int getHour3()
				{
					return hour3;
				}
				public int getMinute3()
				{
					return minute3;
				}	
				public int getHour4()
				{
					return hour4;
				}
				public int getMinute4()
				{
					return minute4;
				}	
				public int getReservedSeats1()
				{
					return reservedSeats1;
				}
				public int getReservedSeats2()
				{
					return reservedSeats2;
				}
				public int getReservedSeats3()
				{
					return reservedSeats3;
				}
				public int getReservedSeats4()
				{
					return reservedSeats4;
				}

				
				
			
				
				
				
				
				//여기는 Setter. 나머지 속성의 경우 정해진 것이지만
				//예약된 좌석의 경우 난수발생/예매완료 에 따라 변하기 때문에 Setter 설정해두었습니다. 
				public void setReservedSeats1(int a)
				{
					reservedSeats1 += a;
				}
				public void setReservedSeats2(int a)
				{
					reservedSeats2 += a;
				}
				public void setReservedSeats3(int a)
				{
					reservedSeats3 += a;
				}
				public void setReservedSeats4(int a)
				{
					reservedSeats4 += a;
				}




				public void cutReservedSeats1(int a)
				{
					reservedSeats1 -=a;
				}				
				public void cutReservedSeats2(int a)
				{
					reservedSeats2 -=a;
				}
				public void cutReservedSeats3(int a)
				{
					reservedSeats3 -=a;
				}
				public void cutReservedSeats4(int a)
				{
					reservedSeats4 -=a;
				}	



}
class TheaterInformation4
{

				private String movieName; //영화이름
				private int ageAllowance; //관람등급
				private int hour1; //첫 번째 상영시작시간의 '시간'
				private int minute1; // 첫 번째 상영시작시간의 '분'  이하 2~4번째 상영시작시간의 시간과 분
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 영화의 1타임 예매된 좌석 수
				private static int reservedSeats2; //각 영화별 2타임 예매된 좌석 수
				private static int reservedSeats3; //각 영화별 3타임 예매된 좌석 수
				private static int reservedSeats4; //각 영화별 4타임 예매된 좌석 수
				
				
				

				// 사용자 정의 생성자 (인자를 받는 생성자)
				public TheaterInformation4 (String movieName, int ageAllowance, int hour1, int minute1, 
					int hour2, int minute2, int hour3, int minute3, int hour4, int minute4, int reservedSeats1,int reservedSeats2,int reservedSeats3,int reservedSeats4)
				{
					this.movieName = movieName;
					this.ageAllowance = ageAllowance;
					this.hour1 = hour1;
					this.minute1 = minute1;
					this.hour2 = hour2;
					this.minute2 = minute2;
					this.hour3 = hour3;
					this.minute3 = minute3;
					this.hour4 = hour4;
					this.minute4 = minute4; 
					this.reservedSeats1 = reservedSeats1;
					this.reservedSeats2 = reservedSeats2;
					this.reservedSeats3 = reservedSeats3;
					this.reservedSeats4 = reservedSeats4;
				}

				public String getName()
				{
					return movieName;
					
				}
				public int getAge()
				{
					return ageAllowance;
				}	
				public int getHour1()
				{
					return hour1;
				}
				public int getMinute1()
				{
					return minute1;
				}
				public int getHour2()
				{
					return hour2;
				}
				public int getMinute2()
				{
					return minute2;
				}	
				public int getHour3()
				{
					return hour3;
				}
				public int getMinute3()
				{
					return minute3;
				}	
				public int getHour4()
				{
					return hour4;
				}
				public int getMinute4()
				{
					return minute4;
				}	
				public int getReservedSeats1()
				{
					return reservedSeats1;
				}
				public int getReservedSeats2()
				{
					return reservedSeats2;
				}
				public int getReservedSeats3()
				{
					return reservedSeats3;
				}
				public int getReservedSeats4()
				{
					return reservedSeats4;
				}
				
				
				
				
				
				
				//여기는 Setter. 나머지 속성의 경우 정해진 것이지만
				//예약된 좌석의 경우 난수발생/예매완료 에 따라 변하기 때문에 Setter 설정해두었습니다. 
				public void setReservedSeats1(int a)
				{
					reservedSeats1 += a;
				}
				public void setReservedSeats2(int a)
				{
					reservedSeats2 += a;
				}
				public void setReservedSeats3(int a)
				{
					reservedSeats3 += a;
				}
				public void setReservedSeats4(int a)
				{
					reservedSeats4 += a;
				}

				public void cutReservedSeats1(int a)
				{
					reservedSeats1 -=a;
				}
				public void cutReservedSeats2(int a)
				{
					reservedSeats2 -=a;
				}
				public void cutReservedSeats3(int a)
				{
					reservedSeats3 -=a;
				}
				public void cutReservedSeats4(int a)
				{
					reservedSeats4 -=a;
				}


}
class TheaterInformation5
{

				private String movieName; //영화이름
				private int ageAllowance; //관람등급
				private int hour1; //첫 번째 상영시작시간의 '시간'
				private int minute1; // 첫 번째 상영시작시간의 '분'  이하 2~4번째 상영시작시간의 시간과 분
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 영화의 1타임 예매된 좌석 수
				private static int reservedSeats2; //각 영화별 2타임 예매된 좌석 수
				private static int reservedSeats3; //각 영화별 3타임 예매된 좌석 수
				private static int reservedSeats4; //각 영화별 4타임 예매된 좌석 수
				
				

				// 사용자 정의 생성자 (인자를 받는 생성자)
				public TheaterInformation5 (String movieName, int ageAllowance, int hour1, int minute1, 
					int hour2, int minute2, int hour3, int minute3, int hour4, int minute4, int reservedSeats1,int reservedSeats2,int reservedSeats3,int reservedSeats4)
				{
					this.movieName = movieName;
					this.ageAllowance = ageAllowance;
					this.hour1 = hour1;
					this.minute1 = minute1;
					this.hour2 = hour2;
					this.minute2 = minute2;
					this.hour3 = hour3;
					this.minute3 = minute3;
					this.hour4 = hour4;
					this.minute4 = minute4; 
					this.reservedSeats1 = reservedSeats1;
					this.reservedSeats2 = reservedSeats2;
					this.reservedSeats3 = reservedSeats3;
					this.reservedSeats4 = reservedSeats4;
				}

				public String getName()
				{
					return movieName;
					
				}
				public int getAge()
				{
					return ageAllowance;
				}	
				public int getHour1()
				{
					return hour1;
				}
				public int getMinute1()
				{
					return minute1;
				}
				public int getHour2()
				{
					return hour2;
				}
				public int getMinute2()
				{
					return minute2;
				}	
				public int getHour3()
				{
					return hour3;
				}
				public int getMinute3()
				{
					return minute3;
				}	
				public int getHour4()
				{
					return hour4;
				}
				public int getMinute4()
				{
					return minute4;
				}	
				public int getReservedSeats1()
				{
					return reservedSeats1;
				}
				public int getReservedSeats2()
				{
					return reservedSeats2;
				}
				public int getReservedSeats3()
				{
					return reservedSeats3;
				}
				public int getReservedSeats4()
				{
					return reservedSeats4;
				}
				
				
				
				
				
				
				//여기는 Setter. 나머지 속성의 경우 정해진 것이지만
				//예약된 좌석의 경우 난수발생/예매완료 에 따라 변하기 때문에 Setter 설정해두었습니다. 
				public void setReservedSeats1(int a)
				{
					reservedSeats1 += a;
				}
				public void setReservedSeats2(int a)
				{
					reservedSeats2 += a;
				}
				public void setReservedSeats3(int a)
				{
					reservedSeats3 += a;
				}
				public void setReservedSeats4(int a)
				{
					reservedSeats4 += a;
				}

				public void cutReservedSeats1(int a)
				{
					reservedSeats1 -=a;
				}

				public void cutReservedSeats2(int a)
				{
					reservedSeats2 -=a;
				}
				public void cutReservedSeats3(int a)
				{
					reservedSeats3 -=a;
				}
				public void cutReservedSeats4(int a)
				{
					reservedSeats4 -=a;
				}


}
class TheaterInformation6
{

				private String movieName; //영화이름
				private int ageAllowance; //관람등급
				private int hour1; //첫 번째 상영시작시간의 '시간'
				private int minute1; // 첫 번째 상영시작시간의 '분'  이하 2~4번째 상영시작시간의 시간과 분
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 영화의 1타임 예매된 좌석 수
				private static int reservedSeats2; //각 영화별 2타임 예매된 좌석 수
				private static int reservedSeats3; //각 영화별 3타임 예매된 좌석 수
				private static int reservedSeats4; //각 영화별 4타임 예매된 좌석 수
				
				

				// 사용자 정의 생성자 (인자를 받는 생성자)
				public TheaterInformation6 (String movieName, int ageAllowance, int hour1, int minute1, 
					int hour2, int minute2, int hour3, int minute3, int hour4, int minute4, int reservedSeats1,int reservedSeats2,int reservedSeats3,int reservedSeats4)
				{
					this.movieName = movieName;
					this.ageAllowance = ageAllowance;
					this.hour1 = hour1;
					this.minute1 = minute1;
					this.hour2 = hour2;
					this.minute2 = minute2;
					this.hour3 = hour3;
					this.minute3 = minute3;
					this.hour4 = hour4;
					this.minute4 = minute4; 
					this.reservedSeats1 = reservedSeats1;
					this.reservedSeats2 = reservedSeats2;
					this.reservedSeats3 = reservedSeats3;
					this.reservedSeats4 = reservedSeats4;
				}

				public String getName()
				{
					return movieName;
					
				}
				public int getAge()
				{
					return ageAllowance;
				}	
				public int getHour1()
				{
					return hour1;
				}
				public int getMinute1()
				{
					return minute1;
				}
				public int getHour2()
				{
					return hour2;
				}
				public int getMinute2()
				{
					return minute2;
				}	
				public int getHour3()
				{
					return hour3;
				}
				public int getMinute3()
				{
					return minute3;
				}	
				public int getHour4()
				{
					return hour4;
				}
				public int getMinute4()
				{
					return minute4;
				}	
				public int getReservedSeats1()
				{
					return reservedSeats1;
				}
				public int getReservedSeats2()
				{
					return reservedSeats2;
				}
				public int getReservedSeats3()
				{
					return reservedSeats3;
				}
				public int getReservedSeats4()
				{
					return reservedSeats4;
				}
				
				
				
				
				
				
				//여기는 Setter. 나머지 속성의 경우 정해진 것이지만
				//예약된 좌석의 경우 난수발생/예매완료 에 따라 변하기 때문에 Setter 설정해두었습니다. 
				public void setReservedSeats1(int a)
				{
					reservedSeats1 += a;
				}
				public void setReservedSeats2(int a)
				{
					reservedSeats2 += a;
				}
				public void setReservedSeats3(int a)
				{
					reservedSeats3 += a;
				}
				public void setReservedSeats4(int a)
				{
					reservedSeats4 += a;
				}

				public void cutReservedSeats1(int a)
				{
					reservedSeats1 -=a;
				}

				public void cutReservedSeats2(int a)
				{
					reservedSeats2 -=a;
				}
				public void cutReservedSeats3(int a)
				{
					reservedSeats3 -=a;
				}
				public void cutReservedSeats4(int a)
				{
					reservedSeats4 -=a;
				}


}







