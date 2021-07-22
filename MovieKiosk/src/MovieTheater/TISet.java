package MovieTheater;

import java.util.*;

public class TISet
{

		// 영화 인덱스 String과 영화정보객체 TheaterInformation 담는 Hashtable 객체 생성

		// 처음 기획했던 방식은 TheaterInformation 클래스로 영화 5개 객체를 각각 만들어서 Hashtable의 key 1에는 기생충, key2 에는 미드나잇... 을 넣어 저장하는 방식으로 하려했으나
		// TheaterInformation 클래스가 하나라면 각 영화별 4개 상영관의 예약자수가 공유되는 상황이 되어버린다. (기생충을 예약했는데 소울 예약자 수가 증가)
		// 영화 별로 클래스를 만들어야 했고 Hashtable 에 여러 타입의 객체가 들어갈 수가 없어서 쓸 수 없는 상황
		// Hashtable 이 없어도 진행이 가능하지만... 그래도 진행.
		 static Hashtable<String, TheaterInformation> ht = new Hashtable<String, TheaterInformation>();
		 static Hashtable<String, TheaterInformation2> ht2 = new Hashtable<String, TheaterInformation2>();
		 static Hashtable<String, TheaterInformation3> ht3 = new Hashtable<String, TheaterInformation3>();
		 static Hashtable<String, TheaterInformation4> ht4 = new Hashtable<String, TheaterInformation4>();
		 static Hashtable<String, TheaterInformation5> ht5 = new Hashtable<String, TheaterInformation5>();


		 static Hashtable<String, TheaterInformation6> ht6 = new Hashtable<String, TheaterInformation6>();


		 
		private String findIndex;
		private String findMovie;
		
		static public void set() //Hashtable 에 영화정보를 담습니다
		{	


				ht.put("1",new TheaterInformation("[청불] 기생충 (감독판_재개봉) ",19,13,00,15,40,20,30,22,20,20,20,20,20));
				ht2.put("2",new TheaterInformation2("[15세] 이터널 선샤인",15,17,45,19,00,19,30,22,00,20,20,20,20));
				ht3.put("3",new TheaterInformation3("[청불] 쏘우",19,18,00,19,00,20,30,22,30,20,20,20,20));
				ht4.put("4",new TheaterInformation4("[15세] 미드나잇 인 파리",15,11,00,14,40,18,30,19,20,20,20,20,20));
				ht5.put("5",new TheaterInformation5("[전체관람] 소울",0,9,00,10,40,16,30,17,00,20,20,20,20));


				// 인덱스로 영화제목,성인인증영화여부  가져오기 위해서 생성
				ht6.put("1",new TheaterInformation6("[청불] 기생충 (감독판_재개봉) ",19,13,00,15,40,20,30,22,20,20,20,20,20));
				ht6.put("2",new TheaterInformation6("[15세] 이터널 선샤인",15,17,45,19,00,19,30,22,00,20,20,20,20));
				ht6.put("3",new TheaterInformation6("[청불] 쏘우",19,18,00,19,00,20,30,22,30,20,20,20,20));
				ht6.put("4",new TheaterInformation6("[15세] 미드나잇 인 파리",15,11,00,14,40,18,30,19,20,20,20,20,20));
				ht6.put("5",new TheaterInformation6("[전체관람] 소울",0,9,00,10,40,16,30,17,00,20,20,20,20));


				

		}
		
		public void print(String findIndex) //Hashtable에 담긴 영화정보를 출력합니다 .(findIndex는 영화에 부여된 고유번호)
		{
				
				
				
				System.out.println("no. 제목                            등급   1회차    2회차    3회차    4회차    예약좌석수     1회차     2회차      3회차      4회차");


				if (findIndex.equals("2"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation2 ti2 = ht2.get(findIndex);  //get(키) → 값
					if (ti2 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti2.getName());  //%-30s 이거는 왼쪽정렬이 된다. 
						//System.out.print(ti.getAge()+"세  ");
						System.out.printf("%38d세   ",ti2.getAge());
						System.out.print(String.format("%02d",ti2.getHour1()) + ":" + String.format("%02d",ti2.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti2.getHour2()) + ":" + String.format("%02d",ti2.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti2.getHour3()) + ":" + String.format("%02d",ti2.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti2.getHour4()) + ":" + String.format("%02d",ti2.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti2.getReservedSeats1() + "석/60석  " );
						System.out.print(ti2.getReservedSeats2() + "석/60석  " );
						System.out.print(ti2.getReservedSeats3() + "석/60석  " );
						System.out.print(ti2.getReservedSeats4() + "석/60석  " );

						

					}
					System.out.println("\n\n");
					return;
				}

				if (findIndex.equals("3"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation3 ti3 = ht3.get(findIndex);  //get(키) → 값
					if (ti3 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti3.getName());  //%-30s 이거는 왼쪽정렬이 된다. 
						//System.out.print(ti.getAge()+"세  ");
						System.out.printf("%38d세   ",ti3.getAge());
						System.out.print(String.format("%02d",ti3.getHour1()) + ":" + String.format("%02d",ti3.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti3.getHour2()) + ":" + String.format("%02d",ti3.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti3.getHour3()) + ":" + String.format("%02d",ti3.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti3.getHour4()) + ":" + String.format("%02d",ti3.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti3.getReservedSeats1() + "석/60석  " );
						System.out.print(ti3.getReservedSeats2() + "석/60석  " );
						System.out.print(ti3.getReservedSeats3() + "석/60석  " );
						System.out.print(ti3.getReservedSeats4() + "석/60석  " );

						

					}
					System.out.println("\n\n");
					return;
				}

				if (findIndex.equals("4"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation4 ti4 = ht4.get(findIndex);  //get(키) → 값
					if (ti4 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti4.getName());  //%-30s 이거는 왼쪽정렬이 된다. 
						//System.out.print(ti.getAge()+"세  ");
						System.out.printf("%38d세   ",ti4.getAge());
						System.out.print(String.format("%02d",ti4.getHour1()) + ":" + String.format("%02d",ti4.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti4.getHour2()) + ":" + String.format("%02d",ti4.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti4.getHour3()) + ":" + String.format("%02d",ti4.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti4.getHour4()) + ":" + String.format("%02d",ti4.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti4.getReservedSeats1() + "석/60석  " );
						System.out.print(ti4.getReservedSeats2() + "석/60석  " );
						System.out.print(ti4.getReservedSeats3() + "석/60석  " );
						System.out.print(ti4.getReservedSeats4() + "석/60석  " );

						

					}
					System.out.println("\n\n");
					return;
				}
				if (findIndex.equals("5"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation5 ti5 = ht5.get(findIndex);  //get(키) → 값
					if (ti5 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti5.getName());  //%-30s 이거는 왼쪽정렬이 된다. 
						//System.out.print(ti.getAge()+"세  ");
						System.out.printf("%38d세   ",ti5.getAge());
						System.out.print(String.format("%02d",ti5.getHour1()) + ":" + String.format("%02d",ti5.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti5.getHour2()) + ":" + String.format("%02d",ti5.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti5.getHour3()) + ":" + String.format("%02d",ti5.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti5.getHour4()) + ":" + String.format("%02d",ti5.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti5.getReservedSeats1() + "석/60석  " );
						System.out.print(ti5.getReservedSeats2() + "석/60석  " );
						System.out.print(ti5.getReservedSeats3() + "석/60석  " );
						System.out.print(ti5.getReservedSeats4() + "석/60석  " );

						

					}
					System.out.println("\n\n");
					return;
				}




				//ht 라는 해시테이블의 요소 중 값을 검색 (key를 이용하여 검색)
				this.findIndex = findIndex;
				TheaterInformation ti = ht.get(findIndex);  //get(키) → 값
				if (ti != null) // 키값을 찾았으면! 이라는 의미
				{
					
					System.out.printf("%2s %-30s\n",findIndex,ti.getName());  //%-30s 로 왼쪽정렬이 된다. 
					System.out.printf("%38d세   ",ti.getAge());
					System.out.print(String.format("%02d",ti.getHour1()) + ":" + String.format("%02d",ti.getMinute1())+"    ") ;
					
					System.out.print(String.format("%02d",ti.getHour2()) + ":" + String.format("%02d",ti.getMinute2())+"    ") ;	
					System.out.print(String.format("%02d",ti.getHour3()) + ":" + String.format("%02d",ti.getMinute3())+ "    ") ;
					System.out.print(String.format("%02d",ti.getHour4()) + ":" + String.format("%02d",ti.getMinute4())+ "                " ) ;
					
										
					System.out.print(ti.getReservedSeats1() + "석/60석  " );
					System.out.print(ti.getReservedSeats2() + "석/60석  " );
					System.out.print(ti.getReservedSeats3() + "석/60석  " );
					System.out.print(ti.getReservedSeats4() + "석/60석  " );

					

				}
				System.out.println("\n\n");







		}//end print()

		
		
		public void changeSNums(String findMovie, int a, int b ) //findMovie번째 영화의 a번째 타임의 예약된좌석수를 b만큼 증가시키는 메소드
		{			
				
				
				
				if(findMovie.equals("2")) 
				{
					this.findMovie = findMovie;
					TheaterInformation2 ti2 = ht2.get(findMovie);  //get(키) → 값
					if (ti2 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti2.setReservedSeats1(b);/*System.out.println(ti2.getReservedSeats1() + "석으로 증가되었습니다.");*/ break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti2.setReservedSeats2(b);/*System.out.println(ti2.getReservedSeats2() + "석으로 증가되었습니다.");*/  break;
							case 3: ti2.setReservedSeats3(b);/*System.out.println(ti2.getReservedSeats3() + "석으로 증가되었습니다.");*/  break;
							case 4: ti2.setReservedSeats4(b);/*System.out.println(ti2.getReservedSeats4() + "석으로 증가되었습니다.");*/  break;

						
						}			
					}
					
				  return;	
				}

				if(findMovie.equals("3")) 
				{
					this.findMovie = findMovie;
					TheaterInformation3 ti3 = ht3.get(findMovie);  //get(키) → 값
					if (ti3 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti3.setReservedSeats1(b);break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti3.setReservedSeats2(b);break;
							case 3: ti3.setReservedSeats3(b);break;
							case 4: ti3.setReservedSeats4(b);break;

						
						}			
					}
					
				  return;	
				}
				
				if(findMovie.equals("4")) 
				{
					this.findMovie = findMovie;
					TheaterInformation4 ti4 = ht4.get(findMovie);  //get(키) → 값
					if (ti4 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti4.setReservedSeats1(b);break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti4.setReservedSeats2(b);break;
							case 3: ti4.setReservedSeats3(b);break;
							case 4: ti4.setReservedSeats4(b);break;

						
						}			
					}
					
				  return;	
				}
				
				if(findMovie.equals("5")) 
				{
					this.findMovie = findMovie;
					TheaterInformation5 ti5 = ht5.get(findMovie);  //get(키) → 값
					if (ti5 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti5.setReservedSeats1(b);break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti5.setReservedSeats2(b);break;
							case 3: ti5.setReservedSeats3(b);break;
							case 4: ti5.setReservedSeats4(b);break;

						
						}			
					}
					
				  return;	
				}
			
			
			

				
				this.findMovie = findMovie;
				TheaterInformation ti = ht.get(findMovie);  //get(키) → 값
				if (ti != null) // 키값을 찾았으면! 이라는 의미
				{


					
					switch (a)
					{
						case 1: ti.setReservedSeats1(b);break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
						case 2: ti.setReservedSeats2(b);break;
						case 3: ti.setReservedSeats3(b);break;
						case 4: ti.setReservedSeats4(b);break;

					
					}
					

				}






			
		}//end ()



		/*public void cutSNums(String findMovie, int a, int b )//findMovie번째 영화의 a번째 타임의 예약된좌석수를 b만큼 감소시키는 메소드
		{
					
				
				
				if(findMovie.equals("2")) 
				{
					this.findMovie = findMovie;
					TheaterInformation2 ti2 = ht2.get(findMovie);  //get(키) → 값
					if (ti2 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti2.cutReservedSeats1(b);System.out.println(ti2.getReservedSeats1() + "석으로 감소되었습니다." );break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti2.cutReservedSeats2(b);System.out.println(ti2.getReservedSeats2() + "석으로 감소되었습니다." );break;
							case 3: ti2.cutReservedSeats3(b);System.out.println(ti2.getReservedSeats3() + "석으로 감소되었습니다." );break;
							case 4: ti2.cutReservedSeats4(b);System.out.println(ti2.getReservedSeats4() + "석으로 감소되었습니다." );break;

						
						}			
					}
					
				  return;	
				}

				if(findMovie.equals("3")) 
				{
					this.findMovie = findMovie;
					TheaterInformation3 ti3 = ht3.get(findMovie);  //get(키) → 값
					if (ti3 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti3.cutReservedSeats1(b);System.out.println(ti3.getReservedSeats1() + "석으로 감소되었습니다." );break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti3.cutReservedSeats2(b);System.out.println(ti3.getReservedSeats2() + "석으로 감소되었습니다." );break;
							case 3: ti3.cutReservedSeats3(b);System.out.println(ti3.getReservedSeats3() + "석으로 감소되었습니다." );break;
							case 4: ti3.cutReservedSeats4(b);System.out.println(ti3.getReservedSeats4() + "석으로 감소되었습니다." );break;

						
						}			
					}
					
				  return;	
				}
				
				if(findMovie.equals("4")) 
				{
					this.findMovie = findMovie;
					TheaterInformation4 ti4 = ht4.get(findMovie);  //get(키) → 값
					if (ti4 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti4.cutReservedSeats1(b);System.out.println(ti4.getReservedSeats1() + "석으로 감소되었습니다." );break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti4.cutReservedSeats2(b);System.out.println(ti4.getReservedSeats2() + "석으로 감소되었습니다." );break;
							case 3: ti4.cutReservedSeats3(b);System.out.println(ti4.getReservedSeats3() + "석으로 감소되었습니다." );break;
							case 4: ti4.cutReservedSeats4(b);System.out.println(ti4.getReservedSeats4() + "석으로 감소되었습니다." );break;

						
						}			
					}
					
				  return;	
				}
				
				if(findMovie.equals("5")) 
				{
					this.findMovie = findMovie;
					TheaterInformation5 ti5 = ht5.get(findMovie);  //get(키) → 값
					if (ti5 != null) // 키값을 찾았으면! 이라는 의미
					{
						
						
						
						switch (a)
						{
							case 1: ti5.cutReservedSeats1(b);System.out.println(ti5.getReservedSeats1() + "석으로 감소되었습니다." );break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
							case 2: ti5.cutReservedSeats2(b);System.out.println(ti5.getReservedSeats2() + "석으로 감소되었습니다." );break;
							case 3: ti5.cutReservedSeats3(b);System.out.println(ti5.getReservedSeats3() + "석으로 감소되었습니다." );break;
							case 4: ti5.cutReservedSeats4(b);System.out.println(ti5.getReservedSeats4() + "석으로 감소되었습니다." );break;

						
						}			
					}
					
				  return;	
				}
			
			
			

				
				this.findMovie = findMovie;
				TheaterInformation ti = ht.get(findMovie);  //get(키) → 값
				if (ti != null) // 키값을 찾았으면! 이라는 의미
				{
					
					switch (a)
					{
						case 1: ti.cutReservedSeats1(b);System.out.println(ti.getReservedSeats1() + "석으로 감소되었습니다." );break; //--> 이렇게 하면 좌석수가 n석만큼 증가한다.
						case 2: ti.cutReservedSeats2(b);System.out.println(ti.getReservedSeats2() + "석으로 감소되었습니다." );break;
						case 3: ti.cutReservedSeats3(b);System.out.println(ti.getReservedSeats3() + "석으로 감소되었습니다." );break;
						case 4: ti.cutReservedSeats4(b);System.out.println(ti.getReservedSeats4() + "석으로 감소되었습니다." );break;

					
					}
					

				}

		}//end cutSNums()*/


		public void movieNameOnly (String s) //영화제목만반환하는 메소드
		{
			
			
			System.out.println("\t\t=====[영화제목]=====\n");
			switch (s)
			{
				case "1": System.out.println("\t\t\t" + ht.get(s).getName());break;
				case "2": System.out.println("\t\t\t" + ht2.get(s).getName());break;
				case "3": System.out.println("\t\t\t" + ht3.get(s).getName());break;
				case "4": System.out.println("\t\t\t" + ht4.get(s).getName());break;
				case "5": System.out.println("\t\t\t" + ht5.get(s).getName());break;
			
			}
			
		
		}//end movieNameOnly()

		public void movieNameOnly2 (String s)
		{
				
				TheaterInformation6 ti6 = ht6.get(s);  //get(키) → 값
				if (ti6 != null) // 키값을 찾았으면! 이라는 의미
				{
					System.out.println(ti6.getName());					

				}
			

		}
		public boolean adultCheck(String findIndex) //성인인지 아닌지 반환하는 메소드
		{
			
			boolean result = true;
			
			this.findIndex = findIndex;
			TheaterInformation6 ti6 = ht6.get(findIndex);  //get(키) → 값
			if (ti6 != null) // 키값을 찾았으면! 이라는 의미
			{
				if (ti6.getAge()==19)
				{
					System.out.println("※ 성인인증이 필요한 영화입니다");
					result=true;
					
				}
				else
				{
					System.out.println("※ 성인인증이 필요하지 않은 영화입니다.");
					result=false;

				}
				
				

			}
			return result;

		}//end 


}






