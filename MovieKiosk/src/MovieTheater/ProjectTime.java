package MovieTheater;

import java.util.Calendar;
import java.io.IOException;
import java.util.ArrayList;


// [빠른 예매 영화를 가져오는 클래스]


public class ProjectTime
{
      Calendar cal = Calendar.getInstance();
      int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
      int minute = cal.get(Calendar.MINUTE); 
	  int near;		// 현재 시간과 가장 가까운 상영 시간 
	  String near1;	// 현재 시간과 가장 가까운 상영 시간

	  int fin;		// 현재시각(시+분)
	  String abab;	// 현재시각(시+분)	  
	   
	  String aaa1;	// 현재 시
	  String bbb1;	// 현재 분
	  String moviename;

	  int movieIndex; //빠른예매영화는 <movieIndex>번째 영화이다.
	  int TimeIndex; //빠른예매영화는 <TimeIndex>번째 타임이다.
		
	  int[][] hours = {{1300,1540,2030,2220},{1745,1900,1930,2200},{1800,1900,2030,2230},
								{1100,1440,1830,1920},{900,1040,1630,1700}};						// 영화 상영 시간 정리

	 

	 void diff() 	// 현재 시간과 차이가 제일 적은 시간 출력	
	 {      		
		near = 0;							// 현재 시간과 가장 가까운 상영 시간을 저장할 변수
        int min = Integer.MAX_VALUE;		// 근사값 비교시 필요한 정수 최대값 	
	
		// 현재 시각
		int aaa = (int)(Math.log10(hourOfDay)+1);		
		aaa1 = Integer.toString(hourOfDay);
		if (aaa <=1)										// (0시~09시)일 경우 int면 9시 8시 이러니까
			aaa1 = "0" + Integer.toString(hourOfDay);		// String으로 변환해서 09 08 시 이렇게해서 출력할때 사용하려고	 
		else												
			 aaa1 = Integer.toString(hourOfDay);
				
		// 현재 분
		int bbb = (int)(Math.log10(minute)+1);
		bbb1 = Integer.toString(minute);					
		if (bbb<=1)											// 10분이전(0~9분일경우) 위와 동일
			bbb1 = "0"+ Integer.toString(minute);			// 9분과 같을 경우 9 → "09"
		else 
			bbb1 = Integer.toString(minute);				
		
		abab = aaa1 + bbb1;									// 시와 분을 합친 것 (10시 9분)  109 →"1009"
		fin = Integer.parseInt(abab);						// 1009 
															

		// 현재 시각 분과 비교해서 가장 가까운 영화시간대 찾는 거
		for(int i=0;i<hours.length;i++)
        {	
			for (int j=0;j<hours[i].length ;j++)
			{				
				int k = hours[i][j]-fin;					// 상영시각 - 현재시각
			
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

	int nearmovie()										// 가장 가까운 상영시간 String 반환(near1) int 반환(near) 둘다 됨 
	{		
		// 상영 영화									
		int length = (int)(Math.log10(near)+1);			
		 near1 = Integer.toString(near);					// 현재 시각 분과 동일 int → String 변환
		if (length<4)
			near1 = "0" + Integer.toString(near);
		else
			near1 = Integer.toString(near);	
		return near;
	}




	void print() throws IOException
	{

		
		System.out.println("\t▨▨▨▨▨▨▨▨[ 빠른 영화 예매 ]▨▨▨▨▨▨▨▨");
		System.out.println("\t▨▨가장 빨리 볼 수 있는 영화를 추천해드립니다▨▨\n");
		System.out.println("\t\t==현재 시각 기준 가장 빠른 영화== \n" );

		try
		{
			System.out.println("\t현재시간 " + aaa1  + " : " + bbb1 + 
							"에 근접한 영화 시간은 " + near1.substring(0,2) + " : " +  near1.substring(2,4) + "입니다.");				
		}
		catch (Exception e)
		{
			System.out.println("\t현재 상영가능한 영화가 없습니다. 다음에 이용해주세요");
			System.exit(-1);
		}		
		
		System.out.println();
		System.out.println();
		
		//System.out.println("\t\t\t"+ near1.substring(0,2) + " : " +  near1.substring(2,4) );

		//테스트System.out.print(movieIndex + "번 째 영화의 " +TimeIndex + "번째타임 영화입니다\n");
		

	}

	boolean ab(int a, int b)
   {

		int aaa = (int)(Math.log10(hourOfDay)+1);		
		aaa1 = Integer.toString(hourOfDay);
		if (aaa <=1)										// (0시~09시)일 경우 int면 9시 8시 이러니까
			aaa1 = "0" + Integer.toString(hourOfDay);		// String으로 변환해서 09 08 시 이렇게해서 출력할때 사용하려고	 
		else												
			 aaa1 = Integer.toString(hourOfDay);
				
		// 현재 분
		int bbb = (int)(Math.log10(minute)+1);
		bbb1 = Integer.toString(minute);					
		if (bbb<=1)											// 10분이전(0~9분일경우) 위와 동일
			bbb1 = "0"+ Integer.toString(minute);			// 9분과 같을 경우 9 → "09"
		else 
			bbb1 = Integer.toString(minute);				
		
		abab = aaa1 + bbb1;									// 시와 분을 합친 것 (10시 9분)  109 →"1009"
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













