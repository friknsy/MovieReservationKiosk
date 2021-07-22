package MovieTheater;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.InputMismatchException;

public class CinemaReservation
{
	Scanner sc = new Scanner(System.in);

	


	//CinemaBasics 클래스를 사용하기 위해 객체 생성
	 CinemaBasics ob = new CinemaBasics();
	

	
	//CinemaBasics 객체만 담을 수 있는 ArrayList 생성
	 public static ArrayList<CinemaBasics> arr = new ArrayList<CinemaBasics>(); 
	


	// 정보저장메소드
	public void saveInformation(int a, int b, int c, String s, int d)
    {

			CinemaBasics ob = new CinemaBasics();
			
		
			ob.setMovie(a);
			ob.setTime(b);
			ob.setPrice(c);	
			ob.setNumber(d);
			ob.setSeat(s);
			
			
			arr.add(ob);
	}
	

	// 예매번호 확인 메소드
	public void search()
	{
		TISet tis = new TISet();
		int[][] timeArr = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};
		 
		while(true){


					try
					{   

						int check=0;
						//ob.setPrice(pm.price);
						System.out.print("예매확인을 위해 예매번호를 입력해주세요(취소:-1) :");

						
						// 찾으려는 예매번호 입력받고 number2에 저장
						int number2 = sc.nextInt();

						if (number2==-1)
						{
							System.out.println("내역확인을 취소하고 메인으로 돌아갑니다.");
							return;
						}
						

						for(int i=0; i<arr.size() ;i++ )
						{	
							// ArrayList에 저장돼있는 값들의 Number을 불러오기
							



							if(arr.get(i).getNumber()==(number2)) 
							{
								System.out.println();
								System.out.println("\t\t [영화입장권/영수증겸용]");
								System.out.println("============================================================");
								//System.out.println("영화제목    좌석번호            시간     예매번호    총 금액");
								//System.out.println("============================================================");
									//tis.movieNameOnly2(Integer.toString(arr.get(i).getMovie()));
									String s = Integer.toString(arr.get(i).getMovie());
									System.out.print("영화제목 : ");
									tis.movieNameOnly2(s);
									System.out.println("좌석번호 : " + arr.get(i).getSeat());
									String tempSS = Integer.toString(timeArr[arr.get(i).getMovie()-1][arr.get(i).getTime()-1]);
									System.out.printf("상영시간 : %s  :  %s\n",tempSS.substring(0,2),tempSS.substring(2,4));
									System.out.println("예매번호 : " + arr.get(i).getNumber());
									System.out.println("결제금액 : " + arr.get(i).getPrice());
								System.out.println("=============================================================");
								check++;											
									
							}// end if()
							
						}

						if (check==0) // arraylist에 같은 예매번호가 존재하지 않는다고 하면(없는 예매번호라면) 다시 반복문을 돌면서 예매번호를 받는다.
						{
							System.out.println("유효하지 않은 예매번호입니다. 다시 확인해주세요");

						}else
							return;
							
						
						
					}
					catch /*(InputMismatchException e)*/(Exception e)
					{
						System.out.println(e+" :예외발생");
						System.out.println("잘못된 예약번호를 입력하셨습니다. 다섯자리의 숫자를 입력해주세요.");
						// 잘못입력된 값 비워주기
						sc.nextLine();
					}
			



		}	


	}// end search()
	


	// 랜덤번호 출력 메소드
	public static int random()
	{
		int authNo = (int)(Math.random() * (99999 - 10000 + 1)) + 10000;
		System.out.printf("부여된 예매번호 : %d\n" , authNo);
		System.out.println("예매번호를 기억해주세요! 예매내역 확인 시 필요합니다");
		return authNo;


	}// end random()



}
