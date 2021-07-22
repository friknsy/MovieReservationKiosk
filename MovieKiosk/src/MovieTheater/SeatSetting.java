package MovieTheater;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException; 


public class SeatSetting

{
	// �ֿ� ���� ����
	public int inwon;								// �ο� ��
	public int x,y;									// ��, �� �Է� ��
	int n;											// �߻���ų ������ ��
	public String[] alp = {"A", "B", "C", "D", "E", "F"};	// �� ��
	String check;									// Y/N 
	static int ar,br,cr,dr,er,fr;					// �̷��� �صθ� ���߿� �¼��������� ����������. 
													// �ο� 3���� ar=2 br=1 cr=0 dr=0 er=0 fr=0 �̷��Լ���
													// ���� �� 10000(ar+br+er+fr) + 120000(cr+dr) �ϸ� �¼������� �ο��̳��´�	
	static ArrayList<String> list = new ArrayList<String>();												

	public static String getTemp() 
	{
		  
		  String str = " ";
		  for(String s : list)
		  {
			 str += s+ "  ";
		  }
			 
		  return str; 		  
	 }


	void initializePlz() // ar,br,cr,dr,er,fr (�� ���ð���) �� �ٽ� 0���� �ʱ�ȭ�Ǿ���Ѵ�. �ȱ׷��� �����Ҷ����� �����ż� 180000���̳��´�. 
	{
		ar=0;
		br=0;
		cr=0;
		dr=0;
		er=0;
		fr=0;
	}
	void initializeList ()
	{
		list.clear();
	}
	void justOneTimePlz () // �������� �¼� 20�� ä��� �� '����' �� ���� �ؾ��Ѵ�. �� ���� ä���� �¼��� 2/3 �� ��
	{
		fillSeatRandom(1,1);
		fillSeatRandom(1,2);
		fillSeatRandom(1,3);
		fillSeatRandom(1,4);
		fillSeatRandom(2,1);
		fillSeatRandom(2,2);
		fillSeatRandom(2,3);
		fillSeatRandom(2,4);
		fillSeatRandom(3,1);
		fillSeatRandom(3,2);
		fillSeatRandom(3,3);
		fillSeatRandom(3,4);
		fillSeatRandom(4,1);
		fillSeatRandom(4,2);
		fillSeatRandom(4,3);
		fillSeatRandom(4,4);
		fillSeatRandom(5,1);
		fillSeatRandom(5,2);
		fillSeatRandom(5,3);
		fillSeatRandom(5,4);
		

	}


	static int[][] arr1 = new int[6][10];//paracite Time1
	static int[][] arr2 = new int[6][10];//paracite Time2
	static int[][] arr3 = new int[6][10];//paracite Time3
	static int[][] arr4 = new int[6][10];//paracite Time4
	

	static int[][] arr5 = new int[6][10];//eternal Time1
	static int[][] arr6 = new int[6][10];//eternal Time2
	static int[][] arr7 = new int[6][10];//eternal Time3
	static int[][] arr8 = new int[6][10];//eternal Time4
	

	static int[][] arr9 = new int[6][10];//saw Time1
	static int[][] arr10 = new int[6][10];//saw Time2
	static int[][] arr11 = new int[6][10];//saw Time3
	static int[][] arr12 = new int[6][10];//saw Time4
	

	static int[][] arr13 = new int[6][10];//midnight Time1
	static int[][] arr14 = new int[6][10];//midnight Time2
	static int[][] arr15 = new int[6][10];//midnight Time3
	static int[][] arr16 = new int[6][10];//midnight Time4
	

	static int[][] arr17 = new int[6][10];//soul Time1
	static int[][] arr18 = new int[6][10];//soul Time2
	static int[][] arr19 = new int[6][10];//soul Time3
	static int[][] arr20 = new int[6][10];//soul Time4

	
	//void �¼���������ä���()

 

	//=================================================
	void paraciteTime1FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr1[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr1[a][b]=1;

		}// end for1
	}
	void paraciteTime1ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					paraciteTime1ReserveForTwo();
					paraciteTime1ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					paraciteTime1ReserveForTwo();
					paraciteTime1ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					paraciteTime1ReserveForTwo();
					break;
				}

				else
				{
					paraciteTime1ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void paraciteTime1ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime1PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr1[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr1[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;

					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void paraciteTime1ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime1PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr1[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr1[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr1[x-1][y-2]=1;
						arr1[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);


						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr1[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr1[x-1][y-1]=1;
						arr1[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;

						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr1[x-1][y-2]==1) ) || (arr1[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void paraciteTime1PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr1.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr1[i].length; j++)
			{
				if (arr1[i][j]==0)
					System.out.print("��");
				else if (arr1[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}


	//======================================================= paraciteTime1 �޼ҵ� 4�� paracite Time2 �޼ҵ�4�� paracite Time3 �޼ҵ� 4�� paraciteTime4 �޼ҵ� 4��  �̳���Time1�޼ҵ�4�� ......  soulTime4�޼ҵ�4��


	void paraciteTime2FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr2[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr2[a][b]=1;

		}// end for1
	}
	void paraciteTime2ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					paraciteTime2ReserveForTwo();
					paraciteTime2ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					paraciteTime2ReserveForTwo();
					paraciteTime2ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					paraciteTime2ReserveForTwo();
					break;
				}

				else
				{
					paraciteTime2ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void paraciteTime2ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime2PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr2[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr2[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void paraciteTime2ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime2PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr2[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr2[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr2[x-1][y-2]=1;
						arr2[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr2[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr2[x-1][y-1]=1;
						arr2[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);



						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr2[x-1][y-2]==1) ) || (arr2[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void paraciteTime2PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr2.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr2[i].length; j++)
			{
				if (arr2[i][j]==0)
					System.out.print("��");
				else if (arr2[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}


//======================================================================================


	void paraciteTime3FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr3[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr3[a][b]=1;

		}// end for1
	}
	void paraciteTime3ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					paraciteTime3ReserveForTwo();
					paraciteTime3ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					paraciteTime3ReserveForTwo();
					paraciteTime3ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					paraciteTime3ReserveForTwo();
					break;
				}

				else
				{
					paraciteTime3ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void paraciteTime3ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime3PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr3[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr3[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void paraciteTime3ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime3PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr3[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr3[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr3[x-1][y-2]=1;
						arr3[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr3[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr3[x-1][y-1]=1;
						arr3[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);


						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr3[x-1][y-2]==1) ) || (arr3[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void paraciteTime3PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr3.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr3[i].length; j++)
			{
				if (arr3[i][j]==0)
					System.out.print("��");
				else if (arr3[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//=====================================================================================

	void paraciteTime4FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr4[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr4[a][b]=1;

		}// end for1
	}
	void paraciteTime4ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					paraciteTime4ReserveForTwo();
					paraciteTime4ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					paraciteTime4ReserveForTwo();
					paraciteTime4ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					paraciteTime4ReserveForTwo();
					break;
				}

				else
				{
					paraciteTime4ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void paraciteTime4ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime4PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr4[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr4[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void paraciteTime4ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			paraciteTime4PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr4[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr4[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr4[x-1][y-2]=1;
						arr4[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr4[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr4[x-1][y-1]=1;
						arr4[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr4[x-1][y-2]==1) ) || (arr4[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void paraciteTime4PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr4.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr4[i].length; j++)
			{
				if (arr4[i][j]==0)
					System.out.print("��");
				else if (arr4[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}


//============================================================================================================================================


	void eternalTime1FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr5[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr5[a][b]=1;

		}
	}
	void eternalTime1ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					eternalTime1ReserveForTwo();
					eternalTime1ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					eternalTime1ReserveForTwo();
					eternalTime1ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					eternalTime1ReserveForTwo();
					break;
				}

				else
				{
					eternalTime1ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void eternalTime1ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime1PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr5[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr5[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void eternalTime1ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime1PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr5[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr5[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr5[x-1][y-2]=1;
						arr5[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr5[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr5[x-1][y-1]=1;
						arr5[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr5[x-1][y-2]==1) ) || (arr5[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void eternalTime1PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr5.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr5[i].length; j++)
			{
				if (arr5[i][j]==0)
					System.out.print("��");
				else if (arr5[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//=============================================================================

	void eternalTime2FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr6[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr6[a][b]=1;

		}// end for1
	}
	void eternalTime2ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					eternalTime2ReserveForTwo();
					eternalTime2ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					eternalTime2ReserveForTwo();
					eternalTime2ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					eternalTime2ReserveForTwo();
					break;
				}

				else
				{
					eternalTime2ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void eternalTime2ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime2PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr6[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr6[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void eternalTime2ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime2PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr6[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr6[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr6[x-1][y-2]=1;
						arr6[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}


					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr6[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr6[x-1][y-1]=1;
						arr6[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);
						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);


						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr6[x-1][y-2]==1) ) || (arr6[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void eternalTime2PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr6.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr6[i].length; j++)
			{
				if (arr6[i][j]==0)
					System.out.print("��");
				else if (arr6[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}
//===================================================================================

	void eternalTime3FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr7[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr7[a][b]=1;

		}// end for1
	}
	void eternalTime3ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					eternalTime3ReserveForTwo();
					eternalTime3ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					eternalTime3ReserveForTwo();
					eternalTime3ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					eternalTime3ReserveForTwo();
					break;
				}

				else
				{
					eternalTime3ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void eternalTime3ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime3PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr7[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr7[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void eternalTime3ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime3PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr7[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr7[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// 
						arr7[x-1][y-2]=1;
						arr7[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;							

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr7[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// 
						arr7[x-1][y-1]=1;
						arr7[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr7[x-1][y-2]==1) ) || (arr7[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void eternalTime3PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr7.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr7[i].length; j++)
			{
				if (arr7[i][j]==0)
					System.out.print("��");
				else if (arr7[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//==================================================================================
	void eternalTime4FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr8[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr8[a][b]=1;

		}// end for1
	}
	void eternalTime4ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					eternalTime4ReserveForTwo();
					eternalTime4ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					eternalTime4ReserveForTwo();
					eternalTime4ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					eternalTime4ReserveForTwo();
					break;
				}

				else
				{
					eternalTime4ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void eternalTime4ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime4PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr8[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr8[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void eternalTime4ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			eternalTime4PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr8[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr8[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr8[x-1][y-2]=1;
						arr8[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr8[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr8[x-1][y-1]=1;
						arr8[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr8[x-1][y-2]==1) ) || (arr8[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void eternalTime4PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr8.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr8[i].length; j++)
			{
				if (arr8[i][j]==0)
					System.out.print("��");
				else if (arr8[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}
//====================================================================================
	void sawTime1FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr9[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr9[a][b]=1;

		}// end for1
	}
	void sawTime1ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					sawTime1ReserveForTwo();
					sawTime1ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					sawTime1ReserveForTwo();
					sawTime1ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					sawTime1ReserveForTwo();
					break;
				}

				else
				{
					sawTime1ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void sawTime1ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime1PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr9[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr9[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void sawTime1ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime1PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr9[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr9[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr9[x-1][y-2]=1;
						arr9[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr9[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr9[x-1][y-1]=1;
						arr9[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr9[x-1][y-2]==1) ) || (arr9[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void sawTime1PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr9.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr9[i].length; j++)
			{
				if (arr9[i][j]==0)
					System.out.print("��");
				else if (arr9[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//======================================================================================
	void sawTime2FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr10[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr10[a][b]=1;

		}// end for1
	}
	void sawTime2ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					sawTime2ReserveForTwo();
					sawTime2ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					sawTime2ReserveForTwo();
					sawTime2ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					sawTime2ReserveForTwo();
					break;
				}

				else
				{
					sawTime2ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void sawTime2ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime2PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr10[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr10[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void sawTime2ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime2PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr10[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr10[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr10[x-1][y-2]=1;
						arr10[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr10[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr10[x-1][y-1]=1;
						arr10[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr10[x-1][y-2]==1) ) || (arr10[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void sawTime2PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr10.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr10[i].length; j++)
			{
				if (arr10[i][j]==0)
					System.out.print("��");
				else if (arr10[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}
//=======================================================================================
	void sawTime3FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr11[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr11[a][b]=1;

		}// end for1
	}
	void sawTime3ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					sawTime3ReserveForTwo();
					sawTime3ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					sawTime3ReserveForTwo();
					sawTime3ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					sawTime3ReserveForTwo();
					break;
				}

				else
				{
					sawTime3ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void sawTime3ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime3PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr11[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr11[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void sawTime3ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime3PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr11[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr11[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr11[x-1][y-2]=1;
						arr11[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr11[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr11[x-1][y-1]=1;
						arr11[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr11[x-1][y-2]==1) ) || (arr11[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void sawTime3PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr11.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr11[i].length; j++)
			{
				if (arr11[i][j]==0)
					System.out.print("��");
				else if (arr11[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}
//===========================================================================================
	void sawTime4FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr12[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr12[a][b]=1;

		}// end for1
	}
	void sawTime4ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					sawTime4ReserveForTwo();
					sawTime4ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					sawTime4ReserveForTwo();
					sawTime4ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					sawTime4ReserveForTwo();
					break;
				}

				else
				{
					sawTime4ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void sawTime4ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime4PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr12[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr12[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void sawTime4ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			sawTime4PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr12[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr12[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr12[x-1][y-2]=1;
						arr12[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr12[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr12[x-1][y-1]=1;
						arr12[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr12[x-1][y-2]==1) ) || (arr12[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void sawTime4PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr12.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr12[i].length; j++)
			{
				if (arr12[i][j]==0)
					System.out.print("��");
				else if (arr12[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

	//=======================================================================================

	void midnightTime1FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr13[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr13[a][b]=1;

		}// end for1
	}
	void midnightTime1ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					midnightTime1ReserveForTwo();
					midnightTime1ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					midnightTime1ReserveForTwo();
					midnightTime1ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					midnightTime1ReserveForTwo();
					break;
				}

				else
				{
					midnightTime1ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void midnightTime1ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime1PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr13[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr13[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void midnightTime1ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime1PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr13[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr13[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr13[x-1][y-2]=1;
						arr13[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr13[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr13[x-1][y-1]=1;
						arr13[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr13[x-1][y-2]==1) ) || (arr13[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void midnightTime1PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr13.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr13[i].length; j++)
			{
				if (arr13[i][j]==0)
					System.out.print("��");
				else if (arr13[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}
 //==============================================================================
	void midnightTime2FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr14[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr14[a][b]=1;

		}// end for1
	}
	void midnightTime2ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					midnightTime2ReserveForTwo();
					midnightTime2ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					midnightTime2ReserveForTwo();
					midnightTime2ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					midnightTime2ReserveForTwo();
					break;
				}

				else
				{
					midnightTime2ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void midnightTime2ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime2PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr14[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr14[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);

					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void midnightTime2ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime2PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr14[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr14[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr14[x-1][y-2]=1;
						arr14[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;		
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr14[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr14[x-1][y-1]=1;
						arr14[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr14[x-1][y-2]==1) ) || (arr14[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void midnightTime2PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr14.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr14[i].length; j++)
			{
				if (arr14[i][j]==0)
					System.out.print("��");
				else if (arr14[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//=======================================================================================
	void midnightTime3FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr15[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr15[a][b]=1;

		}// end for1
	}
	void midnightTime3ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					midnightTime3ReserveForTwo();
					midnightTime3ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					midnightTime3ReserveForTwo();
					midnightTime3ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					midnightTime3ReserveForTwo();
					break;
				}

				else
				{
					midnightTime3ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void midnightTime3ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime3PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr15[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr15[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void midnightTime3ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime3PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr15[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr15[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr15[x-1][y-2]=1;
						arr15[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr15[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr15[x-1][y-1]=1;
						arr15[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr15[x-1][y-2]==1) ) || (arr15[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void midnightTime3PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr15.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr15[i].length; j++)
			{
				if (arr15[i][j]==0)
					System.out.print("��");
				else if (arr15[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}
//==============================================================================================
	void midnightTime4FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr16[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr16[a][b]=1;

		}// end for1
	}
	void midnightTime4ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					midnightTime4ReserveForTwo();
					midnightTime4ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					midnightTime4ReserveForTwo();
					midnightTime4ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					midnightTime4ReserveForTwo();
					break;
				}

				else
				{
					midnightTime4ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void midnightTime4ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime4PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr16[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr16[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void midnightTime4ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			midnightTime4PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr16[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr16[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr16[x-1][y-2]=1;
						arr16[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						


						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr16[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr16[x-1][y-1]=1;
						arr16[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr16[x-1][y-2]==1) ) || (arr16[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void midnightTime4PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr16.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr16[i].length; j++)
			{
				if (arr16[i][j]==0)
					System.out.print("��");
				else if (arr16[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//========================================================================================
	void soulTime1FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr17[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr17[a][b]=1;

		}// end for1
	}
	void soulTime1ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					soulTime1ReserveForTwo();
					soulTime1ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					soulTime1ReserveForTwo();
					soulTime1ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					soulTime1ReserveForTwo();
					break;
				}

				else
				{
					soulTime1ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void soulTime1ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime1PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr17[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr17[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void soulTime1ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime1PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr17[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr17[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr17[x-1][y-2]=1;
						arr17[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr17[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr17[x-1][y-1]=1;
						arr17[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr17[x-1][y-2]==1) ) || (arr17[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void soulTime1PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr17.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr17[i].length; j++)
			{
				if (arr17[i][j]==0)
					System.out.print("��");
				else if (arr17[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//===================================================================================================

	void soulTime2FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr18[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr18[a][b]=1;

		}// end for1
	}
	void soulTime2ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					soulTime2ReserveForTwo();
					soulTime2ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					soulTime2ReserveForTwo();
					soulTime2ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					soulTime2ReserveForTwo();
					break;
				}

				else
				{
					soulTime2ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void soulTime2ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime2PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr18[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr18[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void soulTime2ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime2PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr18[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr18[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// 
						arr18[x-1][y-2]=1;
						arr18[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;							

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr18[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// 
						arr18[x-1][y-1]=1;
						arr18[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr18[x-1][y-2]==1) ) || (arr18[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void soulTime2PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr18.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr18[i].length; j++)
			{
				if (arr18[i][j]==0)
					System.out.print("��");
				else if (arr18[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//====================================================================================================
	void soulTime3FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr19[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr19[a][b]=1;

		}// end for1
	}
	void soulTime3ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					soulTime3ReserveForTwo();
					soulTime3ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					soulTime3ReserveForTwo();
					soulTime3ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					soulTime3ReserveForTwo();
					break;
				}

				else
				{
					soulTime3ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void soulTime3ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime3PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr19[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr19[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void soulTime3ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime3PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr19[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr19[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr19[x-1][y-2]=1;
						arr19[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						


						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr19[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr19[x-1][y-1]=1;
						arr19[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr19[x-1][y-2]==1) ) || (arr19[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void soulTime3PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr19.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr19[i].length; j++)
			{
				if (arr19[i][j]==0)
					System.out.print("��");
				else if (arr19[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}
//================================================================================
	void soulTime4FillRandom()
	{
		// �¼� ���� ä��� 
		Random rd = new Random();
		n = 20; 

		for (int i=0; i<n; i++)
		{
			int a = rd.nextInt(6);
			int b = rd.nextInt(10);

			//�ߺ��� ����
			for (int j=0; j<=i; j++)
			{
				if (arr20[a][b]==1)
				{
					i--;
					break;
				}//end if

			}//end for2

			arr20[a][b]=1;

		}// end for1
	}
	void soulTime4ReserveSeat()//��ȭ�¼�
	{
			// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);


		
		while (true)
		{
			try
			{
				System.out.printf("\n�� �ο� �� �Է� (�ִ� 4��) : ");
				inwon = sc.nextInt();

				if (inwon>4)
				{	
					System.out.printf("\n�ִ� 4������� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
				
				else if (inwon==4)
				{
					soulTime4ReserveForTwo();
					soulTime4ReserveForTwo();
					break;
				}

				else if (inwon==3)
				{
					soulTime4ReserveForTwo();
					soulTime4ReserveForOne();
					break;
				}

				else if (inwon==2)
				{
					soulTime4ReserveForTwo();
					break;
				}

				else
				{
					soulTime4ReserveForOne();
					break;
				}
					
			}//end try

			catch (InputMismatchException e)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc = new Scanner(System.in);

			}
			
		}//end while		
	}
	void soulTime4ReserveForOne()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime4PrintSeats();
			
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A - 1 / B - 2 / C - 3 / D - 4 / E - 5 / F - 6)");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.println();
				System.out.print("��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else if (arr20[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				System.out.println();													//ArrayList<String> al = 
				System.out.printf("�����Ͻ� �¼��� %s%d�� �Դϴ�.\n\n", alp[x-1], y);	//String a = "A2"
				

				System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
				check = sc.next();

				if (check.equals("Y") || check.equals("y"))
				{	
					// ���� �Ϸ�
					arr20[x-1][y-1]=1;
					
					// ���߿� ������ ���� ���ȣ ���� ���� 
					if (x==1) ar++; //ar�� A���̶�� ��
					else if (x==2) br++;
					else if (x==3) cr++;
					else if (x==4) dr++;
					else if (x==5) er++;
					else fr++;
					String temp=alp[x-1];
					temp += Integer.toString(y);
					list.add(temp);


					break;
				}
				else	
				{
					System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
						continue;	//-- �¼� �ٽ� ����
					
					else
						break;		//-- home ����
					
				}
			
			}// end else

		}//end while
		
	}
	void soulTime4ReserveForTwo()
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println();
			soulTime4PrintSeats();
		
			System.out.println();
			System.out.println("�� ���� ���ڷ� �Է�. (A �� 1 / B �� 2 / C �� 3 / D �� 4 / E �� 5 / F �� 6)");
			System.out.println("�� �ο����� 2���̻��� ��� �¼� �ϳ��� �Է��Ͻø� 2�ڸ� ���� ���õ˴ϴ�");
			System.out.print("�� �����Ͻ� �¼��� ��, ���� �Է����ּ���.(���� ����) : ");
			x = sc.nextInt();
			y = sc.nextInt();
			

			if (x<1 || x>6 || y<1 || y>10 )
			{
				System.out.printf("\n��ȿ���� ���� �¼��Դϴ�. �ٽ� �������ּ���.\n");
				continue;
			}
			else if (arr20[x-1][y-1]==1)
			{
				System.out.println();
				System.out.print("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���.");
				System.out.println();
				continue;
			}
			else 
			{
				
				if ((y%2==0) && (arr20[x-1][y-2]==0))	// ������ ���� ¦���϶�
				{
					System.out.printf("\n�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y-1, alp[x-1], y);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();


					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr20[x-1][y-2]=1;
						arr20[x-1][y-1]=1;	
						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;	
						String temp=alp[x-1];
						temp += Integer.toString(y-1);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);						


						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
					}

				}// end if

				else if ((y%2==1) && (arr20[x-1][y]==0))	// ������ ���� Ȧ���϶�
				{

					System.out.println();
					System.out.printf("�����Ͻ� �¼��� %s%d��, %s%d�� �Դϴ�.\n\n", alp[x-1], y, alp[x-1], y+1);
					System.out.print("�� �¼��� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					check = sc.next();

					if (check.equals("Y") || check.equals("y"))
					{	
						// ���� �Ϸ�
						arr20[x-1][y-1]=1;
						arr20[x-1][y]=1;

						if (x==1) ar+=2; //ar�� A���̶�� ��
						else if (x==2) br+=2;
						else if (x==3) cr+=2;
						else if (x==4) dr+=2;
						else if (x==5) er+=2;
						else fr+=2;
						String temp=alp[x-1];
						temp += Integer.toString(y);
						list.add(temp);

						temp=alp[x-1];
						temp += Integer.toString(y+1);
						list.add(temp);

						//System.out.println("a�࿹�ళ�� : "+ ar); �׽�Ʈ
		

						break;
					}

					else	
					{
						System.out.print("�� �¼��� �ٽ� �����Ͻðڽ��ϱ�? : ");
						check = sc.next();

						if (check.equals("Y") || check.equals("y"))
							continue;	//-- �¼� �ٽ� ����
						
						else
							break;		//-- home ����
						
					}
					
				}// end else if

				if ( ((y>1) && (arr20[x-1][y-2]==1) ) || (arr20[x-1][y]==1))
				{
					System.out.printf("\n������ �Ұ��� �մϴ�. �ٸ� �¼��� �������ּ���.");
					System.out.println();
					continue;
				}// end if
			


			}// end else

		}//end while
		
	}   

	void soulTime4PrintSeats()
	{
			
		//int n=1;

		System.out.println("----------[�¼� ����]----------");
		System.out.printf("\n\t   [SCREEN]\n\n");
		System.out.print("     1 2 3 4 5 6 7 8 9 10");

		for (int i=0; i<arr20.length; i++)
		{
			System.out.printf("\n   %s ", alp[i]);


			for (int j=0; j<arr20[i].length; j++)
			{
				if (arr20[i][j]==0)
					System.out.print("��");
				else if (arr20[i][j]==1)
					System.out.print("��");
			}
			System.out.println();
		}		
	
	}

//==========================================
//=============================================


	void fillSeatRandom(int a, int b)
	{
		if (a==1)
		{
			switch (b)
			{
			case 1: paraciteTime1FillRandom(); break;
			case 2: paraciteTime2FillRandom(); break;
			case 3: paraciteTime3FillRandom(); break;
			case 4: paraciteTime4FillRandom(); break;
			}
		}
		if (a==2)
		{
			switch (b)
			{
			case 1: eternalTime1FillRandom(); break;
			case 2: eternalTime2FillRandom(); break;
			case 3: eternalTime3FillRandom(); break;
			case 4: eternalTime4FillRandom(); break;
			}
		}
		if (a==3)
		{
			switch (b)
			{
			case 1: sawTime1FillRandom(); break;
			case 2: sawTime2FillRandom(); break;
			case 3: sawTime3FillRandom(); break;
			case 4: sawTime4FillRandom(); break;
			}
		}
		if (a==4)
		{
			switch (b)
			{
			case 1: midnightTime1FillRandom(); break;
			case 2: midnightTime2FillRandom(); break;
			case 3: midnightTime3FillRandom(); break;
			case 4: midnightTime4FillRandom(); break;
			}
		}
		if (a==5)
		{
			switch (b)
			{
			case 1: soulTime1FillRandom(); break;
			case 2: soulTime2FillRandom(); break;
			case 3: soulTime3FillRandom(); break;
			case 4: soulTime4FillRandom(); break;
			
			}

		}
	}

	void reserveSeat(int a,int b)
	{
		if (a==1)
		{
			switch (b)
			{
			case 1: paraciteTime1ReserveSeat(); break;
			case 2: paraciteTime2ReserveSeat(); break;
			case 3: paraciteTime3ReserveSeat(); break;
			case 4: paraciteTime4ReserveSeat(); break;
			}
		}
		if (a==2)
		{
			switch (b)
			{
			case 1: eternalTime1ReserveSeat(); break;
			case 2: eternalTime2ReserveSeat(); break;
			case 3: eternalTime3ReserveSeat(); break;
			case 4: eternalTime4ReserveSeat(); break;
			}
		}
		if (a==3)
		{
			switch (b)
			{
			case 1: sawTime1ReserveSeat(); break;
			case 2: sawTime2ReserveSeat(); break;
			case 3: sawTime4ReserveSeat(); break;
			case 4: sawTime4ReserveSeat(); break;
			}
		}
		if (a==4)
		{
			switch (b)
			{
			case 1: midnightTime1ReserveSeat(); break;
			case 2: midnightTime2ReserveSeat(); break;
			case 3: midnightTime3ReserveSeat(); break;
			case 4: midnightTime4ReserveSeat(); break;
			}
		}
		if (a==5)
		{
			switch (b)
			{
			case 1: soulTime1ReserveSeat(); break;
			case 2: soulTime2ReserveSeat(); break;
			case 3: soulTime3ReserveSeat(); break;
			case 4: soulTime4ReserveSeat(); break;
			
			}

		}
	}

	public void printSeatState(int a, int b)
	{
		if (a==1)
		{
			switch (b)
			{
			case 1: paraciteTime1PrintSeats(); break;
			case 2: paraciteTime2PrintSeats(); break;
			case 3: paraciteTime3PrintSeats(); break;
			case 4: paraciteTime4PrintSeats(); break;
			}
		}
		if (a==2)
		{
			switch (b)
			{
			case 1: eternalTime1PrintSeats(); break;
			case 2: eternalTime2PrintSeats(); break;
			case 3: eternalTime3PrintSeats(); break;
			case 4: eternalTime4PrintSeats(); break;
			}
		}
		if (a==3)
		{
			switch (b)
			{
			case 1: sawTime1PrintSeats(); break;
			case 2: sawTime2PrintSeats(); break;
			case 3: sawTime3PrintSeats(); break;
			case 4: sawTime4PrintSeats(); break;
			}
		}
		if (a==4)
		{
			switch (b)
			{
			case 1: midnightTime1PrintSeats(); break;
			case 2: midnightTime2PrintSeats(); break;
			case 3: midnightTime3PrintSeats(); break;
			case 4: midnightTime4PrintSeats(); break;
			}
		}
		if (a==5)
		{
			switch (b)
			{
			case 1: soulTime1PrintSeats(); break;
			case 2: soulTime2PrintSeats(); break;
			case 3: soulTime3PrintSeats(); break;
			case 4: soulTime4PrintSeats(); break;
			
			}
		}
	
	}


}
