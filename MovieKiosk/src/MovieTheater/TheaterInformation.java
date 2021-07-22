package MovieTheater;


//TheaterInformation Ŭ�������� private ���������� �Ӽ������ �׿� �����ϱ� ���� getter/setter �޼ҵ��� �̷���� �ֽ��ϴ�. 
//�� �Ӽ������� TISet Ŭ�������� �ʱ�ȭ ��ŵ�ϴ�. 


public class TheaterInformation
{

				private String movieName; //��ȭ�̸�
				private int ageAllowance; //�������
				private int hour1; //ù ��° �󿵽��۽ð��� '�ð�'
				private int minute1; // ù ��° �󿵽��۽ð��� '��'  ���� 2~4��° �󿵽��۽ð��� �ð��� ��
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 ��ȭ�� 1Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats2; //�� ��ȭ�� 2Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats3; //�� ��ȭ�� 3Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats4; //�� ��ȭ�� 4Ÿ�� ���ŵ� �¼� ��
				
				

				// ����� ���� ������ (���ڸ� �޴� ������)
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
				
				
				
				
				
				
				//����� Setter. ������ �Ӽ��� ��� ������ ��������
				//����� �¼��� ��� �����߻�/���ſϷ� �� ���� ���ϱ� ������ Setter �����صξ����ϴ�. 
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
				// ���� �¼� ���� ���ҽ�Ű�� �޼ҵ�
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

				private String movieName; //��ȭ�̸�
				private int ageAllowance; //�������
				private int hour1; //ù ��° �󿵽��۽ð��� '�ð�'
				private int minute1; // ù ��° �󿵽��۽ð��� '��'  ���� 2~4��° �󿵽��۽ð��� �ð��� ��
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 ��ȭ�� 1Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats2; //�� ��ȭ�� 2Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats3; //�� ��ȭ�� 3Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats4; //�� ��ȭ�� 4Ÿ�� ���ŵ� �¼� ��
				
				// ����� ���� ������ (���ڸ� �޴� ������)
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
				
				
				
				
				
				
				//����� Setter. ������ �Ӽ��� ��� ������ ��������
				//����� �¼��� ��� �����߻�/���ſϷ� �� ���� ���ϱ� ������ Setter �����صξ����ϴ�. 
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

				private String movieName; //��ȭ�̸�
				private int ageAllowance; //�������
				private int hour1; //ù ��° �󿵽��۽ð��� '�ð�'
				private int minute1; // ù ��° �󿵽��۽ð��� '��'  ���� 2~4��° �󿵽��۽ð��� �ð��� ��
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 ��ȭ�� 1Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats2; //�� ��ȭ�� 2Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats3; //�� ��ȭ�� 3Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats4; //�� ��ȭ�� 4Ÿ�� ���ŵ� �¼� ��
				
						

				// ����� ���� ������ (���ڸ� �޴� ������)
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

				
				
			
				
				
				
				
				//����� Setter. ������ �Ӽ��� ��� ������ ��������
				//����� �¼��� ��� �����߻�/���ſϷ� �� ���� ���ϱ� ������ Setter �����صξ����ϴ�. 
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

				private String movieName; //��ȭ�̸�
				private int ageAllowance; //�������
				private int hour1; //ù ��° �󿵽��۽ð��� '�ð�'
				private int minute1; // ù ��° �󿵽��۽ð��� '��'  ���� 2~4��° �󿵽��۽ð��� �ð��� ��
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 ��ȭ�� 1Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats2; //�� ��ȭ�� 2Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats3; //�� ��ȭ�� 3Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats4; //�� ��ȭ�� 4Ÿ�� ���ŵ� �¼� ��
				
				
				

				// ����� ���� ������ (���ڸ� �޴� ������)
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
				
				
				
				
				
				
				//����� Setter. ������ �Ӽ��� ��� ������ ��������
				//����� �¼��� ��� �����߻�/���ſϷ� �� ���� ���ϱ� ������ Setter �����صξ����ϴ�. 
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

				private String movieName; //��ȭ�̸�
				private int ageAllowance; //�������
				private int hour1; //ù ��° �󿵽��۽ð��� '�ð�'
				private int minute1; // ù ��° �󿵽��۽ð��� '��'  ���� 2~4��° �󿵽��۽ð��� �ð��� ��
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 ��ȭ�� 1Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats2; //�� ��ȭ�� 2Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats3; //�� ��ȭ�� 3Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats4; //�� ��ȭ�� 4Ÿ�� ���ŵ� �¼� ��
				
				

				// ����� ���� ������ (���ڸ� �޴� ������)
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
				
				
				
				
				
				
				//����� Setter. ������ �Ӽ��� ��� ������ ��������
				//����� �¼��� ��� �����߻�/���ſϷ� �� ���� ���ϱ� ������ Setter �����صξ����ϴ�. 
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

				private String movieName; //��ȭ�̸�
				private int ageAllowance; //�������
				private int hour1; //ù ��° �󿵽��۽ð��� '�ð�'
				private int minute1; // ù ��° �󿵽��۽ð��� '��'  ���� 2~4��° �󿵽��۽ð��� �ð��� ��
				private int hour2;
				private int minute2;
				private int hour3;
				private int minute3;
				private int hour4;
				private int minute4;
				private static int reservedSeats1; //1 ��ȭ�� 1Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats2; //�� ��ȭ�� 2Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats3; //�� ��ȭ�� 3Ÿ�� ���ŵ� �¼� ��
				private static int reservedSeats4; //�� ��ȭ�� 4Ÿ�� ���ŵ� �¼� ��
				
				

				// ����� ���� ������ (���ڸ� �޴� ������)
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
				
				
				
				
				
				
				//����� Setter. ������ �Ӽ��� ��� ������ ��������
				//����� �¼��� ��� �����߻�/���ſϷ� �� ���� ���ϱ� ������ Setter �����صξ����ϴ�. 
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







