package MovieTheater;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;


public class Authentication 
{
	
	
	boolean adultCheck;

  
  // 생성자
  String str;
  int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
  int tot = 0;
  
  Calendar cal = Calendar.getInstance();
  int year = cal.get(Calendar.YEAR);
  
  
  void getChk()  throws IOException
  {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     do
     {
		 System.out.println();
        System.out.print("▶ 주민번호를 입력하세요 : ");
        str = br.readLine();
  
        if (str.length() != 14)
        {
			System.out.println();
           System.out.println(">> 잘못 입력하셨습니다. 다시 입력해주세요");
  
        }
     }while(str.length()!=14);
  
  
  
  }

  void calChk() throws IOException
  {
     String birthYear = str.substring(0,2);
     char ch = str.charAt(7);
  
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        for (int i=0; i<13; i++)
  
        {
           if (i==6)
              continue;
  
           tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));
  
        }
  
        int su = 11 - tot%11;
        su = su % 10;
  
        if (su==Integer.parseInt(str.substring(13)))
        {
  
           int age;
  
           if (ch<'3')
              age = year - (1900 + Integer.parseInt(birthYear))+1;
           else
              age = year - (2000 + Integer.parseInt(birthYear))+1;
  
           if (age>19) 
			{
					System.out.println();
				   System.out.println(">> "+age +"세로 성인인증이 완료되었습니다.");
				   adultCheck = true;				
           }

  
           else
			 {
				   System.out.println("성인이 아닙니다.");
				   adultCheck = false;				
			 }

        }
  
       else
	   {
			 System.out.println(">> 잘못된 주민번호입니다.");
			adultCheck=false;
		
	   }
  

  
  }
}
