package MovieTheater;

import java.util.*;

public class TISet
{

		// ��ȭ �ε��� String�� ��ȭ������ü TheaterInformation ��� Hashtable ��ü ����

		// ó�� ��ȹ�ߴ� ����� TheaterInformation Ŭ������ ��ȭ 5�� ��ü�� ���� ���� Hashtable�� key 1���� �����, key2 ���� �̵峪��... �� �־� �����ϴ� ������� �Ϸ�������
		// TheaterInformation Ŭ������ �ϳ���� �� ��ȭ�� 4�� �󿵰��� �����ڼ��� �����Ǵ� ��Ȳ�� �Ǿ������. (������� �����ߴµ� �ҿ� ������ ���� ����)
		// ��ȭ ���� Ŭ������ ������ �߰� Hashtable �� ���� Ÿ���� ��ü�� �� ���� ��� �� �� ���� ��Ȳ
		// Hashtable �� ��� ������ ����������... �׷��� ����.
		 static Hashtable<String, TheaterInformation> ht = new Hashtable<String, TheaterInformation>();
		 static Hashtable<String, TheaterInformation2> ht2 = new Hashtable<String, TheaterInformation2>();
		 static Hashtable<String, TheaterInformation3> ht3 = new Hashtable<String, TheaterInformation3>();
		 static Hashtable<String, TheaterInformation4> ht4 = new Hashtable<String, TheaterInformation4>();
		 static Hashtable<String, TheaterInformation5> ht5 = new Hashtable<String, TheaterInformation5>();


		 static Hashtable<String, TheaterInformation6> ht6 = new Hashtable<String, TheaterInformation6>();


		 
		private String findIndex;
		private String findMovie;
		
		static public void set() //Hashtable �� ��ȭ������ ����ϴ�
		{	


				ht.put("1",new TheaterInformation("[û��] ����� (������_�簳��) ",19,13,00,15,40,20,30,22,20,20,20,20,20));
				ht2.put("2",new TheaterInformation2("[15��] ���ͳ� ������",15,17,45,19,00,19,30,22,00,20,20,20,20));
				ht3.put("3",new TheaterInformation3("[û��] ���",19,18,00,19,00,20,30,22,30,20,20,20,20));
				ht4.put("4",new TheaterInformation4("[15��] �̵峪�� �� �ĸ�",15,11,00,14,40,18,30,19,20,20,20,20,20));
				ht5.put("5",new TheaterInformation5("[��ü����] �ҿ�",0,9,00,10,40,16,30,17,00,20,20,20,20));


				// �ε����� ��ȭ����,����������ȭ����  �������� ���ؼ� ����
				ht6.put("1",new TheaterInformation6("[û��] ����� (������_�簳��) ",19,13,00,15,40,20,30,22,20,20,20,20,20));
				ht6.put("2",new TheaterInformation6("[15��] ���ͳ� ������",15,17,45,19,00,19,30,22,00,20,20,20,20));
				ht6.put("3",new TheaterInformation6("[û��] ���",19,18,00,19,00,20,30,22,30,20,20,20,20));
				ht6.put("4",new TheaterInformation6("[15��] �̵峪�� �� �ĸ�",15,11,00,14,40,18,30,19,20,20,20,20,20));
				ht6.put("5",new TheaterInformation6("[��ü����] �ҿ�",0,9,00,10,40,16,30,17,00,20,20,20,20));


				

		}
		
		public void print(String findIndex) //Hashtable�� ��� ��ȭ������ ����մϴ� .(findIndex�� ��ȭ�� �ο��� ������ȣ)
		{
				
				
				
				System.out.println("no. ����                            ���   1ȸ��    2ȸ��    3ȸ��    4ȸ��    �����¼���     1ȸ��     2ȸ��      3ȸ��      4ȸ��");


				if (findIndex.equals("2"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation2 ti2 = ht2.get(findIndex);  //get(Ű) �� ��
					if (ti2 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti2.getName());  //%-30s �̰Ŵ� ���������� �ȴ�. 
						//System.out.print(ti.getAge()+"��  ");
						System.out.printf("%38d��   ",ti2.getAge());
						System.out.print(String.format("%02d",ti2.getHour1()) + ":" + String.format("%02d",ti2.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti2.getHour2()) + ":" + String.format("%02d",ti2.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti2.getHour3()) + ":" + String.format("%02d",ti2.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti2.getHour4()) + ":" + String.format("%02d",ti2.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti2.getReservedSeats1() + "��/60��  " );
						System.out.print(ti2.getReservedSeats2() + "��/60��  " );
						System.out.print(ti2.getReservedSeats3() + "��/60��  " );
						System.out.print(ti2.getReservedSeats4() + "��/60��  " );

						

					}
					System.out.println("\n\n");
					return;
				}

				if (findIndex.equals("3"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation3 ti3 = ht3.get(findIndex);  //get(Ű) �� ��
					if (ti3 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti3.getName());  //%-30s �̰Ŵ� ���������� �ȴ�. 
						//System.out.print(ti.getAge()+"��  ");
						System.out.printf("%38d��   ",ti3.getAge());
						System.out.print(String.format("%02d",ti3.getHour1()) + ":" + String.format("%02d",ti3.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti3.getHour2()) + ":" + String.format("%02d",ti3.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti3.getHour3()) + ":" + String.format("%02d",ti3.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti3.getHour4()) + ":" + String.format("%02d",ti3.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti3.getReservedSeats1() + "��/60��  " );
						System.out.print(ti3.getReservedSeats2() + "��/60��  " );
						System.out.print(ti3.getReservedSeats3() + "��/60��  " );
						System.out.print(ti3.getReservedSeats4() + "��/60��  " );

						

					}
					System.out.println("\n\n");
					return;
				}

				if (findIndex.equals("4"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation4 ti4 = ht4.get(findIndex);  //get(Ű) �� ��
					if (ti4 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti4.getName());  //%-30s �̰Ŵ� ���������� �ȴ�. 
						//System.out.print(ti.getAge()+"��  ");
						System.out.printf("%38d��   ",ti4.getAge());
						System.out.print(String.format("%02d",ti4.getHour1()) + ":" + String.format("%02d",ti4.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti4.getHour2()) + ":" + String.format("%02d",ti4.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti4.getHour3()) + ":" + String.format("%02d",ti4.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti4.getHour4()) + ":" + String.format("%02d",ti4.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti4.getReservedSeats1() + "��/60��  " );
						System.out.print(ti4.getReservedSeats2() + "��/60��  " );
						System.out.print(ti4.getReservedSeats3() + "��/60��  " );
						System.out.print(ti4.getReservedSeats4() + "��/60��  " );

						

					}
					System.out.println("\n\n");
					return;
				}
				if (findIndex.equals("5"))
				{
					
					this.findIndex = findIndex;
					TheaterInformation5 ti5 = ht5.get(findIndex);  //get(Ű) �� ��
					if (ti5 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						System.out.printf("%2s %-30s\n",findIndex,ti5.getName());  //%-30s �̰Ŵ� ���������� �ȴ�. 
						//System.out.print(ti.getAge()+"��  ");
						System.out.printf("%38d��   ",ti5.getAge());
						System.out.print(String.format("%02d",ti5.getHour1()) + ":" + String.format("%02d",ti5.getMinute1())+"    ") ;
						
						System.out.print(String.format("%02d",ti5.getHour2()) + ":" + String.format("%02d",ti5.getMinute2())+"    ") ;	
						System.out.print(String.format("%02d",ti5.getHour3()) + ":" + String.format("%02d",ti5.getMinute3())+ "    ") ;
						System.out.print(String.format("%02d",ti5.getHour4()) + ":" + String.format("%02d",ti5.getMinute4())+ "                " ) ;
						
											
						System.out.print(ti5.getReservedSeats1() + "��/60��  " );
						System.out.print(ti5.getReservedSeats2() + "��/60��  " );
						System.out.print(ti5.getReservedSeats3() + "��/60��  " );
						System.out.print(ti5.getReservedSeats4() + "��/60��  " );

						

					}
					System.out.println("\n\n");
					return;
				}




				//ht ��� �ؽ����̺��� ��� �� ���� �˻� (key�� �̿��Ͽ� �˻�)
				this.findIndex = findIndex;
				TheaterInformation ti = ht.get(findIndex);  //get(Ű) �� ��
				if (ti != null) // Ű���� ã������! �̶�� �ǹ�
				{
					
					System.out.printf("%2s %-30s\n",findIndex,ti.getName());  //%-30s �� ���������� �ȴ�. 
					System.out.printf("%38d��   ",ti.getAge());
					System.out.print(String.format("%02d",ti.getHour1()) + ":" + String.format("%02d",ti.getMinute1())+"    ") ;
					
					System.out.print(String.format("%02d",ti.getHour2()) + ":" + String.format("%02d",ti.getMinute2())+"    ") ;	
					System.out.print(String.format("%02d",ti.getHour3()) + ":" + String.format("%02d",ti.getMinute3())+ "    ") ;
					System.out.print(String.format("%02d",ti.getHour4()) + ":" + String.format("%02d",ti.getMinute4())+ "                " ) ;
					
										
					System.out.print(ti.getReservedSeats1() + "��/60��  " );
					System.out.print(ti.getReservedSeats2() + "��/60��  " );
					System.out.print(ti.getReservedSeats3() + "��/60��  " );
					System.out.print(ti.getReservedSeats4() + "��/60��  " );

					

				}
				System.out.println("\n\n");







		}//end print()

		
		
		public void changeSNums(String findMovie, int a, int b ) //findMovie��° ��ȭ�� a��° Ÿ���� ������¼����� b��ŭ ������Ű�� �޼ҵ�
		{			
				
				
				
				if(findMovie.equals("2")) 
				{
					this.findMovie = findMovie;
					TheaterInformation2 ti2 = ht2.get(findMovie);  //get(Ű) �� ��
					if (ti2 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti2.setReservedSeats1(b);/*System.out.println(ti2.getReservedSeats1() + "������ �����Ǿ����ϴ�.");*/ break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
							case 2: ti2.setReservedSeats2(b);/*System.out.println(ti2.getReservedSeats2() + "������ �����Ǿ����ϴ�.");*/  break;
							case 3: ti2.setReservedSeats3(b);/*System.out.println(ti2.getReservedSeats3() + "������ �����Ǿ����ϴ�.");*/  break;
							case 4: ti2.setReservedSeats4(b);/*System.out.println(ti2.getReservedSeats4() + "������ �����Ǿ����ϴ�.");*/  break;

						
						}			
					}
					
				  return;	
				}

				if(findMovie.equals("3")) 
				{
					this.findMovie = findMovie;
					TheaterInformation3 ti3 = ht3.get(findMovie);  //get(Ű) �� ��
					if (ti3 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti3.setReservedSeats1(b);break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
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
					TheaterInformation4 ti4 = ht4.get(findMovie);  //get(Ű) �� ��
					if (ti4 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti4.setReservedSeats1(b);break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
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
					TheaterInformation5 ti5 = ht5.get(findMovie);  //get(Ű) �� ��
					if (ti5 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti5.setReservedSeats1(b);break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
							case 2: ti5.setReservedSeats2(b);break;
							case 3: ti5.setReservedSeats3(b);break;
							case 4: ti5.setReservedSeats4(b);break;

						
						}			
					}
					
				  return;	
				}
			
			
			

				
				this.findMovie = findMovie;
				TheaterInformation ti = ht.get(findMovie);  //get(Ű) �� ��
				if (ti != null) // Ű���� ã������! �̶�� �ǹ�
				{


					
					switch (a)
					{
						case 1: ti.setReservedSeats1(b);break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
						case 2: ti.setReservedSeats2(b);break;
						case 3: ti.setReservedSeats3(b);break;
						case 4: ti.setReservedSeats4(b);break;

					
					}
					

				}






			
		}//end ()



		/*public void cutSNums(String findMovie, int a, int b )//findMovie��° ��ȭ�� a��° Ÿ���� ������¼����� b��ŭ ���ҽ�Ű�� �޼ҵ�
		{
					
				
				
				if(findMovie.equals("2")) 
				{
					this.findMovie = findMovie;
					TheaterInformation2 ti2 = ht2.get(findMovie);  //get(Ű) �� ��
					if (ti2 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti2.cutReservedSeats1(b);System.out.println(ti2.getReservedSeats1() + "������ ���ҵǾ����ϴ�." );break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
							case 2: ti2.cutReservedSeats2(b);System.out.println(ti2.getReservedSeats2() + "������ ���ҵǾ����ϴ�." );break;
							case 3: ti2.cutReservedSeats3(b);System.out.println(ti2.getReservedSeats3() + "������ ���ҵǾ����ϴ�." );break;
							case 4: ti2.cutReservedSeats4(b);System.out.println(ti2.getReservedSeats4() + "������ ���ҵǾ����ϴ�." );break;

						
						}			
					}
					
				  return;	
				}

				if(findMovie.equals("3")) 
				{
					this.findMovie = findMovie;
					TheaterInformation3 ti3 = ht3.get(findMovie);  //get(Ű) �� ��
					if (ti3 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti3.cutReservedSeats1(b);System.out.println(ti3.getReservedSeats1() + "������ ���ҵǾ����ϴ�." );break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
							case 2: ti3.cutReservedSeats2(b);System.out.println(ti3.getReservedSeats2() + "������ ���ҵǾ����ϴ�." );break;
							case 3: ti3.cutReservedSeats3(b);System.out.println(ti3.getReservedSeats3() + "������ ���ҵǾ����ϴ�." );break;
							case 4: ti3.cutReservedSeats4(b);System.out.println(ti3.getReservedSeats4() + "������ ���ҵǾ����ϴ�." );break;

						
						}			
					}
					
				  return;	
				}
				
				if(findMovie.equals("4")) 
				{
					this.findMovie = findMovie;
					TheaterInformation4 ti4 = ht4.get(findMovie);  //get(Ű) �� ��
					if (ti4 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti4.cutReservedSeats1(b);System.out.println(ti4.getReservedSeats1() + "������ ���ҵǾ����ϴ�." );break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
							case 2: ti4.cutReservedSeats2(b);System.out.println(ti4.getReservedSeats2() + "������ ���ҵǾ����ϴ�." );break;
							case 3: ti4.cutReservedSeats3(b);System.out.println(ti4.getReservedSeats3() + "������ ���ҵǾ����ϴ�." );break;
							case 4: ti4.cutReservedSeats4(b);System.out.println(ti4.getReservedSeats4() + "������ ���ҵǾ����ϴ�." );break;

						
						}			
					}
					
				  return;	
				}
				
				if(findMovie.equals("5")) 
				{
					this.findMovie = findMovie;
					TheaterInformation5 ti5 = ht5.get(findMovie);  //get(Ű) �� ��
					if (ti5 != null) // Ű���� ã������! �̶�� �ǹ�
					{
						
						
						
						switch (a)
						{
							case 1: ti5.cutReservedSeats1(b);System.out.println(ti5.getReservedSeats1() + "������ ���ҵǾ����ϴ�." );break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
							case 2: ti5.cutReservedSeats2(b);System.out.println(ti5.getReservedSeats2() + "������ ���ҵǾ����ϴ�." );break;
							case 3: ti5.cutReservedSeats3(b);System.out.println(ti5.getReservedSeats3() + "������ ���ҵǾ����ϴ�." );break;
							case 4: ti5.cutReservedSeats4(b);System.out.println(ti5.getReservedSeats4() + "������ ���ҵǾ����ϴ�." );break;

						
						}			
					}
					
				  return;	
				}
			
			
			

				
				this.findMovie = findMovie;
				TheaterInformation ti = ht.get(findMovie);  //get(Ű) �� ��
				if (ti != null) // Ű���� ã������! �̶�� �ǹ�
				{
					
					switch (a)
					{
						case 1: ti.cutReservedSeats1(b);System.out.println(ti.getReservedSeats1() + "������ ���ҵǾ����ϴ�." );break; //--> �̷��� �ϸ� �¼����� n����ŭ �����Ѵ�.
						case 2: ti.cutReservedSeats2(b);System.out.println(ti.getReservedSeats2() + "������ ���ҵǾ����ϴ�." );break;
						case 3: ti.cutReservedSeats3(b);System.out.println(ti.getReservedSeats3() + "������ ���ҵǾ����ϴ�." );break;
						case 4: ti.cutReservedSeats4(b);System.out.println(ti.getReservedSeats4() + "������ ���ҵǾ����ϴ�." );break;

					
					}
					

				}

		}//end cutSNums()*/


		public void movieNameOnly (String s) //��ȭ���񸸹�ȯ�ϴ� �޼ҵ�
		{
			
			
			System.out.println("\t\t=====[��ȭ����]=====\n");
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
				
				TheaterInformation6 ti6 = ht6.get(s);  //get(Ű) �� ��
				if (ti6 != null) // Ű���� ã������! �̶�� �ǹ�
				{
					System.out.println(ti6.getName());					

				}
			

		}
		public boolean adultCheck(String findIndex) //�������� �ƴ��� ��ȯ�ϴ� �޼ҵ�
		{
			
			boolean result = true;
			
			this.findIndex = findIndex;
			TheaterInformation6 ti6 = ht6.get(findIndex);  //get(Ű) �� ��
			if (ti6 != null) // Ű���� ã������! �̶�� �ǹ�
			{
				if (ti6.getAge()==19)
				{
					System.out.println("�� ���������� �ʿ��� ��ȭ�Դϴ�");
					result=true;
					
				}
				else
				{
					System.out.println("�� ���������� �ʿ����� ���� ��ȭ�Դϴ�.");
					result=false;

				}
				
				

			}
			return result;

		}//end 


}






