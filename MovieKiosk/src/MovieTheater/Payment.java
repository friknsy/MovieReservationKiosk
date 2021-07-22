package MovieTheater;

import java.util.Scanner;


public class Payment
{
	//test 용
	static int movieName;
	static int movieTime;
	static int seatRow;
	int inwon;

	Scanner sc = new Scanner(System.in);

	private int price;

	void payment(int movieName, int movieTime, int inwon)
	{
		//행 할인 

		SeatSetting ss = new SeatSetting();
	
		//조조할인 
		if ((movieName==4 && movieTime==1) || (movieName==5 && movieTime==1) ) 
			price = 6000 * inwon;
		//좌석차등제
		else 
			price =10000*(ss.ar+ss.br+ss.er+ss.fr) + 12000*(ss.cr+ss.dr);
	}

	
	// price에 값 저장 → 다른 크래스에서 쓸 수 있도록
	public int totalPrice()
	{
		System.out.println();
		System.out.println("고객님의 총 결제금액은 : " + price +"입니다.");
		return price;
		
	}

	void payYesno()
	{
		System.out.println();
		System.out.print("▶ 결제를 진행하시겠습니까?(y/n) : ");
		String yesno = sc.next();
		if (yesno.equals("Y") ||yesno.equals("y") )
		{
			priceChange();			// 현금 or 카드로 넘어감
		}
		else if (yesno.equals("N") ||yesno.equals("n"))
		{
			System.out.println();
			System.out.print("메인 화면으로 돌아갑니다.");				

		}
	}


	void priceChange()
	{	
		System.out.println();

		while (true)
		{
			System.out.print("▶ 카드결제라면 1번, 현금결제라면 2번을 입력해주세요. : ");
			int n = sc.nextInt();
			System.out.println();
			
			if (n<1||n>2)
			{
				System.out.print("▶ 1번 혹은 2번을 입력해주세요");
				continue;
			}		
						
			else if (n==1)
			{
				System.out.println("카드 결제가 완료되었습니다. ");
				break;// home으로
			}	
			else
			{
				System.out.println();
				System.out.print("\n▶ 지불하실 금액을 입력해주세요 : ");
				int customerMoney = sc.nextInt();
				System.out.println();
				while (true)
				{
					if(customerMoney < price)
					{
						int c = price - customerMoney;
						System.out.print("\n※ "+c+"원이 부족합니다. 잔액을 입력해주세요 : " );
						int m = sc.nextInt();
						
						if (m + customerMoney == price)
							break;
						
					}
					else if (customerMoney > price)
					{
						int a = customerMoney - price;
						System.out.println("※ "+a+"을 더 입력받았습니다. 반환하겠습니다.");
						break;
						
					}
					else
						break;
					
				}
				
				System.out.println("\n▶ 결제가 완료되었습니다.");
			}break;
		}


	}//priceChange() end


}




/// 외부의 메인 메소드에서는
/*
Payment pm = new Payment();

pm.payment(영화번호, 영화타임, 좌석행, 인원수);
int result(이거 스태틱으로 선언해야하나...지금은 잘모르겠다) = pm.public int totalPrice();
pm.priceChage(int a);*/



