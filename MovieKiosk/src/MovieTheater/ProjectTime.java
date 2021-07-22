package MovieTheater;

import java.util.Calendar;
import java.io.IOException;
import java.util.ArrayList;


// [���� ���� ��ȭ�� �������� Ŭ����]


public class ProjectTime
{
      Calendar cal = Calendar.getInstance();
      int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
      int minute = cal.get(Calendar.MINUTE); 
	  int near;		// ���� �ð��� ���� ����� �� �ð� 
	  String near1;	// ���� �ð��� ���� ����� �� �ð�

	  int fin;		// ����ð�(��+��)
	  String abab;	// ����ð�(��+��)	  
	   
	  String aaa1;	// ���� ��
	  String bbb1;	// ���� ��
	  String moviename;

	  int movieIndex; //�������ſ�ȭ�� <movieIndex>��° ��ȭ�̴�.
	  int TimeIndex; //�������ſ�ȭ�� <TimeIndex>��° Ÿ���̴�.
		
	  int[][] hours = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};						// ��ȭ �� �ð� ����

	 

	 void diff() 	// ���� �ð��� ���̰� ���� ���� �ð� ���	
	 {      		
		near = 0;							// ���� �ð��� ���� ����� �� �ð��� ������ ����
        int min = Integer.MAX_VALUE;		// �ٻ簪 �񱳽� �ʿ��� ���� �ִ밪 	
	
		// ���� �ð�
		int aaa = (int)(Math.log10(hourOfDay)+1);		
		aaa1 = Integer.toString(hourOfDay);
		if (aaa <=1)										// (0��~09��)�� ��� int�� 9�� 8�� �̷��ϱ�
			aaa1 = "0" + Integer.toString(hourOfDay);		// String���� ��ȯ�ؼ� 09 08 �� �̷����ؼ� ����Ҷ� ����Ϸ���	 
		else												
			 aaa1 = Integer.toString(hourOfDay);
				
		// ���� ��
		int bbb = (int)(Math.log10(minute)+1);
		bbb1 = Integer.toString(minute);					
		if (bbb<=1)											// 10������(0~9���ϰ��) ���� ����
			bbb1 = "0"+ Integer.toString(minute);			// 9�а� ���� ��� 9 �� "09"
		else 
			bbb1 = Integer.toString(minute);				
		
		abab = aaa1 + bbb1;									// �ÿ� ���� ��ģ �� (10�� 9��)  109 ��"1009"
		fin = Integer.parseInt(abab);						// 1009 
															

		// ���� �ð� �а� ���ؼ� ���� ����� ��ȭ�ð��� ã�� ��
		for(int i=0;i<hours.length;i++)
        {	
			for (int j=0;j<hours[i].length ;j++)
			{				
				int k = hours[i][j]-fin;					// �󿵽ð� - ����ð�
			
				if (k<0)
				{
					continue;
				}
				if (k>=0 && min>k)		
				{
					 min = k;						 
					 near = hours[i][j];

					 movieIndex = i+1;
						
					 TimeIndex = j+1;
				}
			}
		}
	 }

	int nearmovie()										// ���� ����� �󿵽ð� String ��ȯ(near1) int ��ȯ(near) �Ѵ� �� 
	{		
		// �� ��ȭ									
		int length = (int)(Math.log10(near)+1);			
		 near1 = Integer.toString(near);					// ���� �ð� �а� ���� int �� String ��ȯ
		if (length<4)
			near1 = "0" + Integer.toString(near);
		else
			near1 = Integer.toString(near);	
		return near;
	}




	void print() throws IOException
	{

		
		System.out.println("\t�ɢɢɢɢɢɢɢ�[ ���� ��ȭ ���� ]�ɢɢɢɢɢɢɢ�");
		System.out.println("\t�ɢɰ��� ���� �� �� �ִ� ��ȭ�� ��õ�ص帳�ϴ٢ɢ�\n");
		System.out.println("\t\t==���� �ð� ���� ���� ���� ��ȭ== \n" );

		try
		{
			System.out.println("\t����ð� " + aaa1  + " : " + bbb1 + 
							"�� ������ ��ȭ �ð��� " + near1.substring(0,2) + " : " +  near1.substring(2,4) + "�Դϴ�.");				
		}
		catch (Exception e)
		{
			System.out.println("\t���� �󿵰����� ��ȭ�� �����ϴ�. ������ �̿����ּ���");
			System.exit(-1);
		}		
		
		System.out.println();
		System.out.println();
		
		//System.out.println("\t\t\t"+ near1.substring(0,2) + " : " +  near1.substring(2,4) );

		//�׽�ƮSystem.out.print(movieIndex + "�� ° ��ȭ�� " +TimeIndex + "��°Ÿ�� ��ȭ�Դϴ�\n");
		

	}

	boolean ab(int a, int b)
   {

		int aaa = (int)(Math.log10(hourOfDay)+1);		
		aaa1 = Integer.toString(hourOfDay);
		if (aaa <=1)										// (0��~09��)�� ��� int�� 9�� 8�� �̷��ϱ�
			aaa1 = "0" + Integer.toString(hourOfDay);		// String���� ��ȯ�ؼ� 09 08 �� �̷����ؼ� ����Ҷ� ����Ϸ���	 
		else												
			 aaa1 = Integer.toString(hourOfDay);
				
		// ���� ��
		int bbb = (int)(Math.log10(minute)+1);
		bbb1 = Integer.toString(minute);					
		if (bbb<=1)											// 10������(0~9���ϰ��) ���� ����
			bbb1 = "0"+ Integer.toString(minute);			// 9�а� ���� ��� 9 �� "09"
		else 
			bbb1 = Integer.toString(minute);				
		
		abab = aaa1 + bbb1;									// �ÿ� ���� ��ģ �� (10�� 9��)  109 ��"1009"
		fin = Integer.parseInt(abab);					// 1009 

		boolean aa=true;
		int[][] arr = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
						{1100,1440,1830,1920},{900,1040,1630,1700}}; 


		if (arr[a][b] > fin)
		 aa = true;
			
		else if (arr[a][b] < fin)
		 aa = false;

		return aa;

   } 





	public static void main(String[] args) throws IOException
	{
		int[][] arr = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};


	     ProjectTime ob = new ProjectTime();
		 
		 ob.diff();
		 int result=ob.nearmovie();
		 ob.print();


	} // end main
		
		
		
	

}// end ProjectTime













