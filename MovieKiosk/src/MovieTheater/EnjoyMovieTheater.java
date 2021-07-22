package MovieTheater;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Menus //�ϼ��� ����

{
	public static final int QUICK_RESERVATION=1;		 //��������
	public static final int VIEWLIST_RESERVATION=2;		//��ȭ ��ȸ �� ����
	public static final int CONFIRM_CANCEL=3;		//���� Ȯ�� �� ���
	public static final int E_EXIT=4;		//����

}

public class EnjoyMovieTheater //-- �ϼ�!
{	
	// �ֿ� �Ӽ� ����
	
	private static BufferedReader br;
	private static Integer sel;			// -- ���ð�
	private static String con;// -- ��� ����
	private static boolean flag;
	
	
	static TISet tis = new TISet();  //TISet Ŭ���� �ν��Ͻ� ����
	static SeatSetting sst = new SeatSetting();
	static CinemaReservation sr = new CinemaReservation();

	static int yesorno;
	public static int whatMovie;
	public static int whatTime;
	static int howManyP; //how many people �̶�� ��
	static int rowSelected; //�¼� ��

	

	
	
	

	// �ʱ�ȭ�� // -- �ϼ�!!
	static
	{	
		tis.set();
		//BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));
		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
		
		

	}


	// �޴� ��� �޼ҵ�
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
		String s44=",k;    �� ��������       .xc    :k'    �� ��ȭ ��ȸ �� ����     ;0k,     do     �� ���� ���� Ȯ��       od      ,k;     �� ����      .xc  ";
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
		System.out.println("\t1. ���� ����");
		System.out.println("\t2. ��ȭ ��ȸ �� ����");
		System.out.println("\t3. ���� Ȯ��");
		System.out.println("\t4. ����");
		
		
		
		System.out.print("\t>> ���ϴ� �޴��� �Է��ϼ���(1~4) : ");



	}
	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{

		do
		{

			try
			{
				sel =Integer.parseInt(br.readLine());
				

				if (sel<1 || sel>4)
				{
					System.out.print("\t�߸��� �Է��Դϴ�. 1-4 �� ���ϴ� �޴��� �������ּ��� : ");
				}
				else 
				{
					System.out.println("\n\n");
					return;

				}
					
				
			}
			catch (Exception e)
			{
				System.out.print("\t�߸��� �Է��Դϴ�. 1-4 �� ���ϴ� �޴��� �������ּ��� : ");
			}
		}
		while (true);

		


		
	}
	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{


		switch (sel)
		{
		case Menus.QUICK_RESERVATION: quickReserv(); break;
		case Menus.VIEWLIST_RESERVATION: viewListReserv(); break;
		case Menus.CONFIRM_CANCEL: confirmCancel(); break;
		case Menus.E_EXIT : exit(); break; 
		default : System.out.println("\t�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���^^"); break;
		
		}

	}
	// �������� �޼ҵ�
	public static void quickReserv() throws IOException
	{	
		/*static int yesorno;
		static int whatMovie;
		static int whatTime;
		static int howManyP; Ŭ���������� �� ������ ����*/

		//System.out.println("���� ���� ��ȭ�� ����� 13:00 �Դϴ�(���� ��� 1����ȭ 1Ÿ��)");
		//if (�� ��ȭ�� �����̶�� )
		//{�� ��ȭ�� �ð� �������� �������� ���� ��ȭ�� ����ؼ� �����ش�. }     �׷������� �� ��ȭ�� �����̶��,,,? �׷��� �׳� �ð���û�ڿ��ϱ� �ٴ�����ȭ�� ������ �׳� Ȩ����... 
		//"���� ���� ���� �� �� �ִ¿�ȭ�� �����ϴ�."



		int[][] arr = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};


	     ProjectTime ob = new ProjectTime();
		 
		 ob.diff();
		 int result=ob.nearmovie();
		 
		 ob.print();

		 
		System.out.print("\t");
		tis.movieNameOnly(Integer.toString(+ ob.movieIndex));
		System.out.println();
		


		//System.out.println("û�ҳ� ���� �Ұ� ��ȭ�� �������� �� �����Ͻ� �� �ֽ��ϴ�.");
		System.out.print("�� �����Ͻðڽ��ϱ� ? �׷��ٸ� 1�� �Է����ּ��� : ");
		yesorno = Integer.parseInt(br.readLine());
		if (yesorno!=1)
		{
			System.out.println("�̿����ּż� �����մϴ�\n\n\n");
			return; //�ٽ� Ȩ���� ���ư���.
		}
		



		boolean amOrNot = tis.adultCheck(Integer.toString(ob.movieIndex));

		//System.out.println(amOrNot); //true�� ���������� �ʿ��ѿ�ȭ false�� �����������ص��Ǵ¿�ȭ

		if (amOrNot)//���������� �ʿ��ϴٸ� 
		{
			Authentication athentic = new Authentication();
			athentic.getChk();
			athentic.calChk();

			if (athentic.adultCheck==false) //�����̾ƴϰų� �߸��� �ֹι�ȣ�̸�
			{
				System.out.println("������ �ƴϰų� �߸��� �ֹι�ȣ�� �Է��ϼ̽��ϴ�.\n ���Ű� �ߴܵǰ� Ȩ �޴��� ���ư��ϴ�.");
				return; //Ȩ���� ���ư���.
				
			}
			
		}


		whatMovie = ob.movieIndex;	
		whatTime = ob.TimeIndex;

		//�¼��� ����. �Ʒ� �� ��

		

		
		sst.reserveSeat(whatMovie,whatTime);
		sst.printSeatState(whatMovie,whatTime);

		//===========================	
		

		howManyP = sst.inwon;// ���� inwon�� static ������ �̷��� �����ϸ�ȵǴµ� �켱 ����� ���� �̷��� �ص״�.
		//rowSelected = sp.x;
		
		//System.out.println("�ο��� : " + howManyP);//�׽�Ʈ
		//System.out.println("������ "  + rowSelected);
		
		Payment pm = new Payment();
		
		pm.payment(whatMovie,whatTime,howManyP); // ����ó�� �޼ҵ忡 ���ȭ, ��ð�,�ο� �Ű������� �Ѱ��ش�. 
		int paymentAmount = pm.totalPrice(); // totalPrice() �� ��ȯ���� int �ε� �տ� ��ȯ������ ���� int�� ���� pm.totalPrice��� �ᵵ ���ư��� �Դٰ� ��±����� �� ������ش�... �Ϳ�
		pm.payYesno();
		

		System.out.println("\n\n\n�ɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢ�");
		System.out.println("\n\t\t�� ���Ű� �Ϸ�Ǿ����ϴ� ��\n");

		System.out.print("\t��ȭ���� : " );
		tis.movieNameOnly2(Integer.toString(whatMovie));
		System.out.println();
		System.out.print("\t�󿵽ð� : ");
		String tempS = Integer.toString(arr[whatMovie-1][whatTime-1]);
		System.out.printf("%s  :  %s\n",tempS.substring(0,2),tempS.substring(2,4));
		System.out.println();
		System.out.print("\t�����¼�  : ");
		String wow = sst.getTemp();
		System.out.print(wow+"\n");
		System.out.println();
		System.out.println("\t�� �����ݾ� : " +paymentAmount);
		System.out.println("\n\n�ɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢ�\n\n");
		

		int a=sr.random();
		 
		String s = sst.getTemp();		 
		 
		sr.saveInformation(whatMovie,whatTime,paymentAmount,s,a);
		 		
		
		
		sst.initializePlz();
		sst.initializeList ();
		

		tis.changeSNums(Integer.toString(whatMovie),whatTime,howManyP); 


		
		 
		
		
		//�׽�Ʈ ��ȭ�ð� ���
		System.out.println("==============================================================================================================================================\n");
		tis.print("1");
		tis.print("2");
		tis.print("3");
		tis.print("4");
		tis.print("5");
		System.out.println("==============================================================================================================================================\n\n");
		
		

	}
	// ��ȭ��ȸ�׿��� �޼ҵ�
	public static void viewListReserv() throws IOException
	{
		int[][] arr = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};
		System.out.println(" ==============================================================================================================================================");
		System.out.println(" ====================================�ʢʢʢʢʢʢʢʢʢ� �� �ð�ǥ ] �ʢʢʢʢʢʢʢʢʢʢʢ�===============================================  ");
		System.out.println(" ==============================================================================================================================================\n");
		
		tis.print("1");  // 1,2,3,4,5��° ��ȭ �Ӽ����� ����Ѵ�. 
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
							System.out.print("�� � ��ȭ�� �����Ͻðڽ��ϱ�? ( 1�� ~ 5�� �� �������ּ��� ) : ");
							whatMovie = Integer.parseInt(br.readLine());							
						}
						catch (Exception e)
						{
							//Exception ���� �ľ��ϱ� ����
							//System.out.println(e);
							System.out.println("���� 1 - 5 �߿��� ������ �ּ���^^");
							
						}

					}
					while (whatMovie<1 || whatMovie>5);



					
					do
					{
						try
						{
							System.out.print("\n�� �� ��ȭ�� � �ð��� �����Ͻðڽ��ϱ�? ( 1Ÿ�� ~ 4Ÿ�� �� �������ּ��� ) : ");
							whatTime = Integer.parseInt(br.readLine());
							if (whatTime<1 || whatTime>4)
							{
								System.out.println("���� 1 - 5 �߿��� ������ �ּ���!*^^*");
							}
						}
						catch (Exception e)
						{
							System.out.println("���� 1 - 5 �߿��� ������ �ּ���^^");
							
						}


					}
					while (whatTime<1 || whatTime>4);

			
			

					ProjectTime pt = new ProjectTime();
					flag = pt.ab(whatMovie-1,whatTime-1); 

					if (flag)
						break;
					else 
					System.out.println("�ƽ����� �̹� ���� �Ϸ�� ��ȭ�Դϴ�. ��ȭ�� �ٽ� �������ּ��� �Ф�");
			}
			while (true);
			





		//System.out.println(result);//�ð��� ���������� true, �ð��� ��������  false

		
	 
		
		
		System.out.println();
		System.out.print("�� �����Ͻðڽ��ϱ� ? �׷��ٸ� 1�� �Է����ּ��� : ");

		// �������� ��ȭ���� Ȯ���Ѵ�
		yesorno = Integer.parseInt(br.readLine());
		if (yesorno!=1)
		{
			return; //�ٽ� Ȩ���� ���ư���.
		}
		



		boolean amOrNot = tis.adultCheck(Integer.toString(whatMovie));

		//System.out.println(amOrNot); //true�� ���������� �ʿ��ѿ�ȭ false�� �����������ص��Ǵ¿�ȭ

		if (amOrNot)//���������� �ʿ��ϴٸ� 
		{
			Authentication athentic = new Authentication();
			athentic.getChk();
			athentic.calChk();

			if (!athentic.adultCheck) //�����̾ƴϰų� �߸��� �ֹι�ȣ�̸�
			{
				System.out.println("������ �ƴϰų� �߸��� �ֹι�ȣ�� �Է��ϼ̽��ϴ�.\n ���Ű� �ߴܵǰ� Ȩ �޴��� ���ư��ϴ�.");
				return; //Ȩ���� ���ư���.
				
			}
			
		}

		

		sst.reserveSeat(whatMovie,whatTime);
		sst.printSeatState(whatMovie,whatTime);

		howManyP = sst.inwon; // ���� inwon�� static ������ �̷��� �����ϸ�ȵǴµ� �켱 ����� ���� �̷��� �ص״�.
		
		


		Payment pm = new Payment();
		
		pm.payment(whatMovie,whatTime,howManyP); // ����ó�� �޼ҵ忡 ���ȭ, ��ð�,�ο� �Ű������� �Ѱ��ش�. 
		pm.totalPrice();
		pm.payYesno();
		int paymentAmount = pm.totalPrice();

		System.out.println("\n\n\n�ɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢ�");
		System.out.println("\n\t\t�� ���Ű� �Ϸ�Ǿ����ϴ� ��\n");

		System.out.print("\t��ȭ���� : " );
		tis.movieNameOnly2(Integer.toString(whatMovie));
		System.out.println();
		System.out.print("\t�󿵽ð� : ");
		String tempS = Integer.toString(arr[whatMovie-1][whatTime-1]);
		System.out.printf("%s  :  %s\n",tempS.substring(0,2),tempS.substring(2,4));
		System.out.println();
		System.out.print("\t�����¼�  : ");
		String wow = sst.getTemp();
		System.out.print(wow+"\n");
		System.out.println();
		System.out.println("\t�� �����ݾ� : " +paymentAmount);
		System.out.println("\n\n�ɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢɢ�\n\n");

		int a=sr.random();
		 
		String s = sst.getTemp();		 
		 
		sr.saveInformation(whatMovie,whatTime,paymentAmount,s,a);
		 		
		
		
		sst.initializePlz();
		sst.initializeList ();
		

		tis.changeSNums(Integer.toString(whatMovie),whatTime,howManyP); 
		 
		
		
		//�׽�Ʈ ��ȭ�ð� ���
		System.out.println("==============================================================================================================================================\n");
		tis.print("1");
		tis.print("2");
		tis.print("3");
		tis.print("4");
		tis.print("5");
		System.out.println("==============================================================================================================================================\n\n");


		
	}

	// ����Ȯ�� �޼ҵ�
	public static void confirmCancel() throws IOException
	{
			
			 sr.search();
	}



	// ���α׷� ���� �޼ҵ�
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
		System.out.println("\n\t���α׷� ����");
		SeatSetting sst = new SeatSetting();

		System.out.println("�¼����� Ȯ�ο� : �� ��ȭ�� �¼� ��Ȳ�� �̷����ϴ�");
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
		System.exit(-1); // return�� �޼ҵ����������� System.exit() �Ű����� 0 1 -1 

	}
	
	
	
	// main() �޼ҵ�
	public static void main(String[] args) throws IOException
	{
		


		sst.justOneTimePlz(); // �� ��ȭ������ �¼��� 20���� �������� �����ϰ� �����Ѵ�.
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








