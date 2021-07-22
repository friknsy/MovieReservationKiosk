package MovieTheater;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Menus //완성된 형태

{
	public static final int QUICK_RESERVATION=1;		 //빠른예매
	public static final int VIEWLIST_RESERVATION=2;		//영화 조회 및 예매
	public static final int CONFIRM_CANCEL=3;		//내역 확인 및 취소
	public static final int E_EXIT=4;		//종료

}

public class EnjoyMovieTheater //-- 완성!
{	
	// 주요 속성 구성
	
	private static BufferedReader br;
	private static Integer sel;			// -- 선택값
	private static String con;// -- 계속 여부
	private static boolean flag;
	
	
	static TISet tis = new TISet();  //TISet 클래스 인스턴스 생성
	static SeatSetting sst = new SeatSetting();
	static CinemaReservation sr = new CinemaReservation();

	static int yesorno;
	public static int whatMovie;
	public static int whatTime;
	static int howManyP; //how many people 이라는 뜻
	static int rowSelected; //좌석 행

	

	
	
	

	// 초기화블럭 // -- 완성!!
	static
	{	
		tis.set();
		//BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));
		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
		
		

	}


	// 메뉴 출력 메소드
	public static void menuDisp() 

	{

		String s= "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String s1="MMx.  .xWMMXc   ,KMX;        cNMk.  .oNMN:  :NMK,  :NMMMd  .kMMMMMM0'  :NMMWl  .OMMNx,   .   .lXMMX:    ;KMMMO.   oMMx.       .kMMMMM";
		String s2="MMx.   '0MWd.   ,KMX;  'xOOOOXWMk.   .oNN:  :NMK,  :NMMMd  .kMMMMMM0'  :NMMWl  .OMNo   :k0Ol.  :XMX;     lNMX;    oMMx.  :OOOO0NMMMMM";
		String s3="MMx. .. :XO. .. ,KMX;  .clllkNMMk. .,  lK:  :NMK,  :NMMMd  .kMMMMMM0'  .clll'  .OM0'  ;XMMMWo  .dMX;   . .xNl ..  oMMx.  'lllo0MMMMMM";
		String s4="MMd. ,:..l; ,c. ,KMX;   ....cXMMk. .dc .lc  :NMK,  :NMMMd  .kMMMMMM0'   ....   .OMk.  cWMMMMx.  oMX:  .:, ,o. c;  oMMx.   ....xMMMMMM";
		String s5="MMx. ,k:   .xo  ,KMX;  'kKKKXWMMk. .xXc ..  :NMX;  ,KMMWl  '0MMMMMM0'  ,O000:  .OMK,  ,KMMMNc  .kMN:   lk.   :O;  oMMx.  cKKKKNMMMMMM";
		String s6="MMx. '00'  lNo  ,KMX;  .lddddkNMk. .dMXc    :NMWx.  ;ddc.  lNMMMMMM0'  :NMMWl  .OMWx.  'oxd;   lNMX;   lNo. .OK,  oMMx.  ,dddddKMMMMM";
		String s7="MMx. ;KWOlxXMd. ;XMX:        ;KMO' .xMMXl.  cNMMNk;.    .'dXMMMMMMM0,  cNMMWo. 'OMMW0c.     .:kNMMXc  .oWXxlOWK; .dMMk.       .dWMMMM";
		String s8="MMN0OKWMMMMMMX0OKWMWKOOOOO00OKWMN0O0NMMMN0OOXWMMMMWKOkkk0NMMMMMMMMMNKO0XWMMMX0O0NMMMMWX0kkkOXWMMMMWKOO0XMMMMMMWKO0XMMN0O0OOOOO0XMMMMM";
		String s9="MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";

		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println("\n");


		String s11=".ll:ccccccccccccccccccccccco,   'olcccccccccccccccccccccccccccc:lxl.     :occcccccccccccccccccccccccccc:co;     .ll:cccccccccccccccccco,  ";
		String s22=",kc                      'kc    :O;	                  	c0k,     dd                             dd      ,kc                  'kc   ";     
		String s33=",k;                      .xc    :k'                             ;0k,     do                             od      ,k;                  .xc  ";
		String s44=",k;    ① 빠른예매       .xc    :k'    ② 영화 조회 및 예매     ;0k,     do     ③ 예매 내역 확인       od      ,k;     ④ 종료      .xc  ";
		String s55=",k;                      .xc    :k'                             ;0k,     do                             od      ,k;                  .xc  ";
		String s66=",k;                      .xc    :k'                             ;0k,     do                             od      ,k;                  .xc ";
		String s88=",k;                      .xc    :k'                             ;0k,                                    od      ,k;                  .xc  ";
		String s99=".doccccccccccccccccccccccclx    ,xocccccccccccccccccccccccccccccokd.     cxcccccccccccccccccccccccccccccxc      .doccccccccccccccccccclx  ";


		System.out.println(s11);
		System.out.println(s22);
		System.out.println(s33);
		System.out.println(s44);
		System.out.println(s55);
		System.out.println(s66);
		//System.out.println(s77);
		//System.out.println(s88);
		System.out.println(s99);


		System.out.println("\n\n\t[ HOME MENU ]");
		System.out.println("\t1. 빠른 예매");
		System.out.println("\t2. 영화 조회 및 예매");
		System.out.println("\t3. 내역 확인");
		System.out.println("\t4. 종료");
		
		
		
		System.out.print("\t>> 원하는 메뉴를 입력하세요(1~4) : ");



	}
	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{

		do
		{

			try
			{
				sel =Integer.parseInt(br.readLine());
				

				if (sel<1 || sel>4)
				{
					System.out.print("\t잘못된 입력입니다. 1-4 중 원하는 메뉴를 선택해주세요 : ");
				}
				else 
				{
					System.out.println("\n\n");
					return;

				}
					
				
			}
			catch (Exception e)
			{
				System.out.print("\t잘못된 입력입니다. 1-4 중 원하는 메뉴를 선택해주세요 : ");
			}
		}
		while (true);

		


		
	}
	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{


		switch (sel)
		{
		case Menus.QUICK_RESERVATION: quickReserv(); break;
		case Menus.VIEWLIST_RESERVATION: viewListReserv(); break;
		case Menus.CONFIRM_CANCEL: confirmCancel(); break;
		case Menus.E_EXIT : exit(); break; 
		default : System.out.println("\t잘못된 입력입니다. 다시 입력해주세요^^"); break;
		
		}

	}
	// 빠른예매 메소드
	public static void quickReserv() throws IOException
	{	
		/*static int yesorno;
		static int whatMovie;
		static int whatTime;
		static int howManyP; 클래스영역에 이 변수들 선언*/

		//System.out.println("현재 빠른 영화는 기생충 13:00 입니다(예를 들어 1번영화 1타임)");
		//if (그 영화가 만석이라면 )
		//{그 영화의 시간 기준으로 다음으로 빠른 영화를 출력해서 보여준다. }     그런데만약 그 영화도 만석이라면,,,? 그러면 그냥 시간엄청뒤에니까 다다음영화도 없으면 그냥 홈으로... 
		//"현재 가장 빨리 볼 수 있는영화가 없습니다."



		int[][] arr = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};


	     ProjectTime ob = new ProjectTime();
		 
		 ob.diff();
		 int result=ob.nearmovie();
		 
		 ob.print();

		 
		System.out.print("\t");
		tis.movieNameOnly(Integer.toString(+ ob.movieIndex));
		System.out.println();
		


		//System.out.println("청소년 관람 불가 영화는 성인인증 후 관람하실 수 있습니다.");
		System.out.print("▶ 예매하시겠습니까 ? 그렇다면 1을 입력해주세요 : ");
		yesorno = Integer.parseInt(br.readLine());
		if (yesorno!=1)
		{
			System.out.println("이용해주셔서 감사합니다\n\n\n");
			return; //다시 홈으로 돌아간다.
		}
		



		boolean amOrNot = tis.adultCheck(Integer.toString(ob.movieIndex));

		//System.out.println(amOrNot); //true면 성인인증이 필요한영화 false면 성인인증안해도되는영화

		if (amOrNot)//성인인증이 필요하다면 
		{
			Authentication athentic = new Authentication();
			athentic.getChk();
			athentic.calChk();

			if (athentic.adultCheck==false) //성인이아니거나 잘못된 주민번호이면
			{
				System.out.println("성인이 아니거나 잘못된 주민번호를 입력하셨습니다.\n 예매가 중단되고 홈 메뉴로 돌아갑니다.");
				return; //홈으로 돌아간다.
				
			}
			
		}


		whatMovie = ob.movieIndex;	
		whatTime = ob.TimeIndex;

		//좌석을 고른다. 아래 두 줄

		

		
		sst.reserveSeat(whatMovie,whatTime);
		sst.printSeatState(whatMovie,whatTime);

		//===========================	
		

		howManyP = sst.inwon;// 원래 inwon도 static 변수라서 이렇게 접근하면안되는데 우선 방법을 몰라서 이렇게 해뒀다.
		//rowSelected = sp.x;
		
		//System.out.println("인원수 : " + howManyP);//테스트
		//System.out.println("선택행 "  + rowSelected);
		
		Payment pm = new Payment();
		
		pm.payment(whatMovie,whatTime,howManyP); // 결제처리 메소드에 어떤영화, 어떤시간,인원 매개변수로 넘겨준다. 
		int paymentAmount = pm.totalPrice(); // totalPrice() 는 반환형이 int 인데 앞에 반환변수를 받을 int가 없잉 pm.totalPrice라고만 써도 돌아가고 게다가 출력구문만 딱 출력해준다... 와우
		pm.payYesno();
		

		System.out.println("\n\n\n▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
		System.out.println("\n\t\t◈ 예매가 완료되었습니다 ◈\n");

		System.out.print("\t영화제목 : " );
		tis.movieNameOnly2(Integer.toString(whatMovie));
		System.out.println();
		System.out.print("\t상영시간 : ");
		String tempS = Integer.toString(arr[whatMovie-1][whatTime-1]);
		System.out.printf("%s  :  %s\n",tempS.substring(0,2),tempS.substring(2,4));
		System.out.println();
		System.out.print("\t선택좌석  : ");
		String wow = sst.getTemp();
		System.out.print(wow+"\n");
		System.out.println();
		System.out.println("\t총 결제금액 : " +paymentAmount);
		System.out.println("\n\n▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨\n\n");
		

		int a=sr.random();
		 
		String s = sst.getTemp();		 
		 
		sr.saveInformation(whatMovie,whatTime,paymentAmount,s,a);
		 		
		
		
		sst.initializePlz();
		sst.initializeList ();
		

		tis.changeSNums(Integer.toString(whatMovie),whatTime,howManyP); 


		
		 
		
		
		//테스트 영화시간 출력
		System.out.println("==============================================================================================================================================\n");
		tis.print("1");
		tis.print("2");
		tis.print("3");
		tis.print("4");
		tis.print("5");
		System.out.println("==============================================================================================================================================\n\n");
		
		

	}
	// 영화조회및예매 메소드
	public static void viewListReserv() throws IOException
	{
		int[][] arr = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};
		System.out.println(" ==============================================================================================================================================");
		System.out.println(" ====================================▧▧▧▧▧▧▧▧▧▧ 상영 시간표 ] ▧▧▧▧▧▧▧▧▧▧▧▧===============================================  ");
		System.out.println(" ==============================================================================================================================================\n");
		
		tis.print("1");  // 1,2,3,4,5번째 영화 속성들을 출력한다. 
		tis.print("2");
		tis.print("3");
		tis.print("4");
		tis.print("5");

		



		//do
		//{
		//	boolean flag;
			do
			{
			
					
									
					do
					{
						try
						{
							System.out.print("▶ 어떤 영화를 예매하시겠습니까? ( 1번 ~ 5번 중 선택해주세요 ) : ");
							whatMovie = Integer.parseInt(br.readLine());							
						}
						catch (Exception e)
						{
							//Exception 종류 파악하기 위해
							//System.out.println(e);
							System.out.println("숫자 1 - 5 중에서 선택해 주세요^^");
							
						}

					}
					while (whatMovie<1 || whatMovie>5);



					
					do
					{
						try
						{
							System.out.print("\n▶ 이 영화의 어떤 시간을 예매하시겠습니까? ( 1타임 ~ 4타임 중 선택해주세요 ) : ");
							whatTime = Integer.parseInt(br.readLine());
							if (whatTime<1 || whatTime>4)
							{
								System.out.println("숫자 1 - 5 중에서 선택해 주세요!*^^*");
							}
						}
						catch (Exception e)
						{
							System.out.println("숫자 1 - 5 중에서 선택해 주세요^^");
							
						}


					}
					while (whatTime<1 || whatTime>4);

			
			

					ProjectTime pt = new ProjectTime();
					flag = pt.ab(whatMovie-1,whatTime-1); 

					if (flag)
						break;
					else 
					System.out.println("아쉽지만 이미 상영이 완료된 영화입니다. 영화를 다시 선택해주세요 ㅠㅠ");
			}
			while (true);
			





		//System.out.println(result);//시간이 안지났으면 true, 시간이 지났으면  false

		
	 
		
		
		System.out.println();
		System.out.print("▶ 예매하시겠습니까 ? 그렇다면 1을 입력해주세요 : ");

		// 성인인증 영화인지 확인한다
		yesorno = Integer.parseInt(br.readLine());
		if (yesorno!=1)
		{
			return; //다시 홈으로 돌아간다.
		}
		



		boolean amOrNot = tis.adultCheck(Integer.toString(whatMovie));

		//System.out.println(amOrNot); //true면 성인인증이 필요한영화 false면 성인인증안해도되는영화

		if (amOrNot)//성인인증이 필요하다면 
		{
			Authentication athentic = new Authentication();
			athentic.getChk();
			athentic.calChk();

			if (!athentic.adultCheck) //성인이아니거나 잘못된 주민번호이면
			{
				System.out.println("성인이 아니거나 잘못된 주민번호를 입력하셨습니다.\n 예매가 중단되고 홈 메뉴로 돌아갑니다.");
				return; //홈으로 돌아간다.
				
			}
			
		}

		

		sst.reserveSeat(whatMovie,whatTime);
		sst.printSeatState(whatMovie,whatTime);

		howManyP = sst.inwon; // 원래 inwon도 static 변수라서 이렇게 접근하면안되는데 우선 방법을 몰라서 이렇게 해뒀다.
		
		


		Payment pm = new Payment();
		
		pm.payment(whatMovie,whatTime,howManyP); // 결제처리 메소드에 어떤영화, 어떤시간,인원 매개변수로 넘겨준다. 
		pm.totalPrice();
		pm.payYesno();
		int paymentAmount = pm.totalPrice();

		System.out.println("\n\n\n▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
		System.out.println("\n\t\t◈ 예매가 완료되었습니다 ◈\n");

		System.out.print("\t영화제목 : " );
		tis.movieNameOnly2(Integer.toString(whatMovie));
		System.out.println();
		System.out.print("\t상영시간 : ");
		String tempS = Integer.toString(arr[whatMovie-1][whatTime-1]);
		System.out.printf("%s  :  %s\n",tempS.substring(0,2),tempS.substring(2,4));
		System.out.println();
		System.out.print("\t선택좌석  : ");
		String wow = sst.getTemp();
		System.out.print(wow+"\n");
		System.out.println();
		System.out.println("\t총 결제금액 : " +paymentAmount);
		System.out.println("\n\n▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨\n\n");

		int a=sr.random();
		 
		String s = sst.getTemp();		 
		 
		sr.saveInformation(whatMovie,whatTime,paymentAmount,s,a);
		 		
		
		
		sst.initializePlz();
		sst.initializeList ();
		

		tis.changeSNums(Integer.toString(whatMovie),whatTime,howManyP); 
		 
		
		
		//테스트 영화시간 출력
		System.out.println("==============================================================================================================================================\n");
		tis.print("1");
		tis.print("2");
		tis.print("3");
		tis.print("4");
		tis.print("5");
		System.out.println("==============================================================================================================================================\n\n");


		
	}

	// 내역확인 메소드
	public static void confirmCancel() throws IOException
	{
			
			 sr.search();
	}



	// 프로그램 종료 메소드
	public static void exit()
	{

		String a1 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a2 = "MMMMMMMMXdccccccccccccOWMMKoccccOWMMMMKocccxWMMMMMMMMMWkccccOMMMMMMWKxl:;,,;:lkXWMMWOccccxNMMMMWkccccckWMMMMMKocccoKMMMMM0lcccdXMMMNOdc:;,;:cdONMMMMMMKocccdXMMMMMXdcccdXMMM0lcccccccclox0NMMMMMMMMMMMMM";
		String a3 = "MMMMMMMM0'            lWMMk.    .xWMMMk.   :XMMMMMMMMMN:    oWMMMWO:.          .lKMM0,   .dWMMWx.    '0MMMMMMXc    :XMMMK,   .dWMNx,           ,xNMMMMk.   '0MMMMM0'   '0MMMd            .,kNMMMMMMMMMMM";
		String a4 = "MMMMMMMM0'    ,lclllllOWMMk.     .xWMMk.   :NMMMMMMMMMN:    oWMMWd.    'cooc.    'kWM0'   .OMM0'   'lOMMMMMMMMXc    oWMNc   .dWMK:    .;lol;.    :KMMMk.   '0MMMMM0'   '0MMMd    .lool;.   .dWMMMMMMMMMM";
		String a5 = "MMMMMMMM0'   .kMMMMMMMMMMMk.      .xWMk.   :NMMMMMMMMMN:    oWMMk.   .oNMMMMXc    '0MMO.   ;KX:   .kWWMMMMMMMMMX:   .kWd.  .oNMNl    'kWMMMWO'    lNMMO.   '0MMMMM0'   '0MMMd    ;XMMMWo    :NMMMMMMMMMM";
		String a6 = "MMMMMMMM0'    ;llllloKMMMMk.  .:'  .dWO.   :NMMMMMMMMMN:    oWMNc    :NMMMMMMK,    oWMWk.   :c   .kWMMMMMMMMMMMMK;   ,o.   lNMM0'   .dWMMMMMWx.   '0MMO.   '0MMMMM0'   '0MMMd    ;XMWW0;    cWMMMMMMMMMM";
		String a7 = "MMMMMMMM0'          .xMMMMk.   lk.  .dO'   :NMMMMMMMMMN:    oWMX;    oWMMMMMMN:    cWMMWk.      .xWMMMMMMMMMMMMMMK;       cNMMMk.   .OMMMMMMMO'   .kMMk.   '0MMMMM0'   '0MMMd    .,;,'.    ;0MMMMMMMMMMM";
		String a8 = "MMMMMMMM0'    ':::::l0MMMMk.   cNk.  .o;   :NMMMMMMMMMN:    oWMN:    cWMMMMMMX;    lWMMMWx.    .dWMMMMMMMMMMMMMMMM0,     cXMMMMO.   .kMMMMMMMk.   .OMMO.   '0MMMMM0'   '0MMMd            'xXMMMMMMMMMMMM";
		String a9 = "MMMMMMMM0'   .kMMMMMMMMMMMk.   :NWk.  ..   :NMMMMWWMMMN:    oMMWd.   .OWMMMMWx.   .kMMMMMNc    :NMMMMMMMMMMMMMMMMMMx.   '0MMMMMX:    :XMMMMMX:    ;XMMK,   .xMMMMMk.   ;XMMMd    .ox:    ,0MMMMMMMMMMMMM";
		String a10 = "MMMMMMMM0'   .l0000000KWMMk.   :NMWk.      :NMN0l,:kKKo.   .kMMMXc    .oOKKOl.    oNMMMMMWl    lWMMMMMMMMMMMMMMMMMMk.   ,KMMMMMMO.    ,x0K0x,    .OMMMWo    'xKK0x'   .dWMMMd    ;XMXl    'OWMMMMMMMMMMM";
		String a11 = "MMMMMMMM0'            :XMMk.   :NMMWO.     :NMK;    ..    .oNMMMMXo.     ..     .xNMMMMMMWl    lWMMMMMMMMMMMMMMMMMMk.   ,KMMMMMMW0;     ...     ;OWMMMMXl.    ...    .oNMMMMd    ;XMMNl.   .kWMMMMMMMMMM";
		String a12 = "MMMMMMMMK;............:XMMO'...cNMMMWO,....cNMWKo,.     .:kNMMMMMMWKo;..    ..:dXMMMMMMMMWo....oWMMMMMMMMMMMMMMMMMMO'...:KMMMMMMMMNkc'.     .,ckNMMMMMMMWOc'.     .'cOWMMMMMx....cXMMMNo....,OWMMMMMMMMM";
		String a13 = "MMMMMMMMWXKKKKKKKKKKKKXWMMWKKKKXWMMMMMXKKKKXWMMMMWX0OkO0XWMMMMMMMMMMMWX0OOOO0NWMMMMMMMMMMMNKKKKNMMMMMMMMMMMMMMMMMMMWKKKKXWMMMMMMMMMMMNK0OkO0KNMMMMMMMMMMMMMNK0OkO0KNMMMMMMMMNKKKKXWMMMMWKKKKKXMMMMMMMMMM";
		String a14 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkllllxXMMMMMMM0olllo0MMMMMMMXkoc::::ldONMMMM0olllxXMMMMMMMXdllldXWOllllOWMMM0ollllllllllldXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a15 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;     lNMMMMM0,     dMMMMW0l.          'oXMM0'   .dWMMMMMWo    :NWl    cNMMMo            .OMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a16 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;     .xWMMMNc      dMMMWk.    .:lc:.    ,OWWo    ;XMMMMM0'   .OMWl    cNMMMo    .;::::::oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a17 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;      '0MMWd.      dMMMO.    cXMMMWK:    ,KMX;   .dWMMMWo    oWMWl    cNMMMo    :NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a18 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;   ..  :XMO.  ..   dMMWc    :XMMMMMMK,    oWMk.   ;kKMM0'   ,KMMWl    cNMMMo    .loooooOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a19 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;   ::   dX:  'l'   dMMX;    lWMMMMMMNc    cWMNc   ..dWWo   .xWMMWl    cNMMMo           ;XMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a20 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;   :O,  ':. .dx.   dMMN:    lWMMMMMMN:    lWMM0'    ;K0'   :NMMMWl    cNMMMo    .,;;;;;dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a21 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;   ;Kk.     :Xx.   dMMWo    'OMMMMMWk.   .kMMMWo    .do   .OMMMMWl    cNMMMo    :XMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a22 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;   ;KWo    ,0Mx.   dMMMX:    'dKXX0o.    lNMMMMX;    ..   oWMMMMWl    cNMMMo    ,OKKKKKKKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a23 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX;   ;XMX:  .kMMx.   dMMMMXc.    ....    .oXMMMMMMk.       ,KMMMMMWl    cNMMMd     ........xMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a24 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX:   :XMMXOkKWMMx.  .xMMMMMWOl,.      .,o0WMMMMMMMNl.     .xWMMMMMWo.   lWMMMd.           .dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a25 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKO0OKWMMMMMMMMMN0OO0NMMMMMMMMNKOkxxkOKWMMMMMMMMMMMN0OOO0OKWMMMMMMMX0OO0XMMMMX0O0OOOOO000O0XMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
		String a26 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);
		System.out.println(a16);
		System.out.println(a17);
		System.out.println(a18);
		System.out.println(a19);
		System.out.println(a20);
		System.out.println(a21);
		System.out.println(a22);
		System.out.println(a23);
		System.out.println(a24);
		System.out.println(a25);
		System.out.println(a26);
		System.out.println("\n\t프로그램 종료");
		SeatSetting sst = new SeatSetting();

		System.out.println("좌석유지 확인용 : 각 영화별 좌석 현황은 이렇습니다");
		sst.printSeatState(1,1);
		sst.printSeatState(2,1);
		sst.printSeatState(3,1);
		sst.printSeatState(4,1);
		sst.printSeatState(5,1);		
		sst.printSeatState(1,2);
		sst.printSeatState(2,2);
		sst.printSeatState(3,2);
		sst.printSeatState(4,2);
		sst.printSeatState(5,2);		
		sst.printSeatState(1,3);
		sst.printSeatState(2,3);
		sst.printSeatState(3,3);
		sst.printSeatState(4,3);
		sst.printSeatState(5,3);		
		sst.printSeatState(1,4);
		sst.printSeatState(2,4);
		sst.printSeatState(3,4);
		sst.printSeatState(4,4);
		sst.printSeatState(5,4);
		System.exit(-1); // return은 메소드종료이지만 System.exit() 매개변수 0 1 -1 

	}
	
	
	
	// main() 메소드
	public static void main(String[] args) throws IOException
	{
		


		sst.justOneTimePlz(); // 각 영화관별로 좌석을 20개씩 랜덤으로 예약하고 시작한다.
		do
		{
			
			menuDisp();
			menuSelect();
			menuRun(); 

		}
		while (true);
		//sst.initializeList();


		
	}
}








