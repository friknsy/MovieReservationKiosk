package MovieTheater;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.InputMismatchException;

public class CinemaReservation
{
	Scanner sc = new Scanner(System.in);

	


	//CinemaBasics Ŭ������ ����ϱ� ���� ��ü ����
	 CinemaBasics ob = new CinemaBasics();
	

	
	//CinemaBasics ��ü�� ���� �� �ִ� ArrayList ����
	 public static ArrayList<CinemaBasics> arr = new ArrayList<CinemaBasics>(); 
	


	// ��������޼ҵ�
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
	

	// ���Ź�ȣ Ȯ�� �޼ҵ�
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
						System.out.print("����Ȯ���� ���� ���Ź�ȣ�� �Է����ּ���(���:-1) :");

						
						// ã������ ���Ź�ȣ �Է¹ް� number2�� ����
						int number2 = sc.nextInt();

						if (number2==-1)
						{
							System.out.println("����Ȯ���� ����ϰ� �������� ���ư��ϴ�.");
							return;
						}
						

						for(int i=0; i<arr.size() ;i++ )
						{	
							// ArrayList�� ������ִ� ������ Number�� �ҷ�����
							



							if(arr.get(i).getNumber()==(number2)) 
							{
								System.out.println();
								System.out.println("\t\t [��ȭ�����/���������]");
								System.out.println("============================================================");
								//System.out.println("��ȭ����    �¼���ȣ            �ð�     ���Ź�ȣ    �� �ݾ�");
								//System.out.println("============================================================");
									//tis.movieNameOnly2(Integer.toString(arr.get(i).getMovie()));
									String s = Integer.toString(arr.get(i).getMovie());
									System.out.print("��ȭ���� : ");
									tis.movieNameOnly2(s);
									System.out.println("�¼���ȣ : " + arr.get(i).getSeat());
									String tempSS = Integer.toString(timeArr[arr.get(i).getMovie()-1][arr.get(i).getTime()-1]);
									System.out.printf("�󿵽ð� : %s  :  %s\n",tempSS.substring(0,2),tempSS.substring(2,4));
									System.out.println("���Ź�ȣ : " + arr.get(i).getNumber());
									System.out.println("�����ݾ� : " + arr.get(i).getPrice());
								System.out.println("=============================================================");
								check++;											
									
							}// end if()
							
						}

						if (check==0) // arraylist�� ���� ���Ź�ȣ�� �������� �ʴ´ٰ� �ϸ�(���� ���Ź�ȣ���) �ٽ� �ݺ����� ���鼭 ���Ź�ȣ�� �޴´�.
						{
							System.out.println("��ȿ���� ���� ���Ź�ȣ�Դϴ�. �ٽ� Ȯ�����ּ���");

						}else
							return;
							
						
						
					}
					catch /*(InputMismatchException e)*/(Exception e)
					{
						System.out.println(e+" :���ܹ߻�");
						System.out.println("�߸��� �����ȣ�� �Է��ϼ̽��ϴ�. �ټ��ڸ��� ���ڸ� �Է����ּ���.");
						// �߸��Էµ� �� ����ֱ�
						sc.nextLine();
					}
			



		}	


	}// end search()
	


	// ������ȣ ��� �޼ҵ�
	public static int random()
	{
		int authNo = (int)(Math.random() * (99999 - 10000 + 1)) + 10000;
		System.out.printf("�ο��� ���Ź�ȣ : %d\n" , authNo);
		System.out.println("���Ź�ȣ�� ������ּ���! ���ų��� Ȯ�� �� �ʿ��մϴ�");
		return authNo;


	}// end random()



}
