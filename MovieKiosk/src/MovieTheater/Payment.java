package MovieTheater;

import java.util.Scanner;


public class Payment
{
	//test ��
	static int movieName;
	static int movieTime;
	static int seatRow;
	int inwon;

	Scanner sc = new Scanner(System.in);

	private int price;

	void payment(int movieName, int movieTime, int inwon)
	{
		//�� ���� 

		SeatSetting ss = new SeatSetting();
	
		//�������� 
		if ((movieName==4 && movieTime==1) || (movieName==5 && movieTime==1) ) 
			price = 6000 * inwon;
		//�¼�������
		else 
			price =10000*(ss.ar+ss.br+ss.er+ss.fr) + 12000*(ss.cr+ss.dr);
	}

	
	// price�� �� ���� �� �ٸ� ũ�������� �� �� �ֵ���
	public int totalPrice()
	{
		System.out.println();
		System.out.println("������ �� �����ݾ��� : " + price +"�Դϴ�.");
		return price;
		
	}

	void payYesno()
	{
		System.out.println();
		System.out.print("�� ������ �����Ͻðڽ��ϱ�?(y/n) : ");
		String yesno = sc.next();
		if (yesno.equals("Y") ||yesno.equals("y") )
		{
			priceChange();			// ���� or ī��� �Ѿ
		}
		else if (yesno.equals("N") ||yesno.equals("n"))
		{
			System.out.println();
			System.out.print("���� ȭ������ ���ư��ϴ�.");				

		}
	}


	void priceChange()
	{	
		System.out.println();

		while (true)
		{
			System.out.print("�� ī�������� 1��, ���ݰ������ 2���� �Է����ּ���. : ");
			int n = sc.nextInt();
			System.out.println();
			
			if (n<1||n>2)
			{
				System.out.print("�� 1�� Ȥ�� 2���� �Է����ּ���");
				continue;
			}		
						
			else if (n==1)
			{
				System.out.println("ī�� ������ �Ϸ�Ǿ����ϴ�. ");
				break;// home����
			}	
			else
			{
				System.out.println();
				System.out.print("\n�� �����Ͻ� �ݾ��� �Է����ּ��� : ");
				int customerMoney = sc.nextInt();
				System.out.println();
				while (true)
				{
					if(customerMoney < price)
					{
						int c = price - customerMoney;
						System.out.print("\n�� "+c+"���� �����մϴ�. �ܾ��� �Է����ּ��� : " );
						int m = sc.nextInt();
						
						if (m + customerMoney == price)
							break;
						
					}
					else if (customerMoney > price)
					{
						int a = customerMoney - price;
						System.out.println("�� "+a+"�� �� �Է¹޾ҽ��ϴ�. ��ȯ�ϰڽ��ϴ�.");
						break;
						
					}
					else
						break;
					
				}
				
				System.out.println("\n�� ������ �Ϸ�Ǿ����ϴ�.");
			}break;
		}


	}//priceChange() end


}




/// �ܺ��� ���� �޼ҵ忡����
/*
Payment pm = new Payment();

pm.payment(��ȭ��ȣ, ��ȭŸ��, �¼���, �ο���);
int result(�̰� ����ƽ���� �����ؾ��ϳ�...������ �߸𸣰ڴ�) = pm.public int totalPrice();
pm.priceChage(int a);*/



