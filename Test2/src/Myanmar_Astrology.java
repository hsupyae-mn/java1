import java.util.Scanner;
public class Myanmar_Astrology {
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the year you were born!");
		int Year =input.nextInt();
		System.out.print("Enter the day you were born! Sunday=1,Monday=2,Tuesday=3,wednesday=4,thursday=5,friday=6,saturday=7");
				
		int day=input.nextInt();
		Year=Year-638;
		System.out.print("you are ");
		if (Year%7 ==1)
		{
		 switch (day)
		 {
		  case 1:System.out.println("binga born");break;
		  case 2:System.out.println("puti born");break;
		  case 3:System.out.println("thirt born");break;
		  case 4:System.out.println("mayana born");break;
		  case 5:System.out.println("adipadi born");break;
		  case 6:System.out.println("Yarza born");break;
		  case 7:System.out.println("Ahtun born");break;
		  }
		}
		else if(Year%7==2)
		{
		switch(day)
		
		{
		  case 1:System.out.println("Ahtun born");break;
		  case 2:System.out.println("binga born");break;
		  case 3:System.out.println("puti born");break;
		  case 4:System.out.println("thirt born");break;
		  case 5:System.out.println("mayana born");break;
		  case 6:System.out.println("adipadi born");break;
		  case 7:System.out.println("Yarza born");break;
		}  
		
		}
		else if(Year%7==3)
		{
			switch(day)
			{
			case 1:System.out.println("Yarza born");break;
			  case 2:System.out.println("Ahtun born");break;
			  case 3:System.out.println("binga born");break;
			  case 4:System.out.println("puti born");break;
			  case 5:System.out.println("thirt born");break;
			  case 6:System.out.println("mayana born");break;
			  case 7:System.out.println("adipadi born");break;
			}  
			}
		else if(Year%7==4)
		{
			switch(day)
			{
			case 1:System.out.println("adipadi born");break;
			  case 2:System.out.println("Yarza born");break;
			  case 3:System.out.println("Ahtun born");break;
			  case 4:System.out.println("binga born");break;
			  case 5:System.out.println("puti born");break;
			  case 6:System.out.println("thirt born");break;
			  case 7:System.out.println("mayana born");break;
			}  
			}
		else if(Year%7==5)
		{
			switch(day)
			{
			case 1:System.out.println("mayana born");break;
			  case 2:System.out.println("adipadi born");break;
			  case 3:System.out.println("Yarza born");break;
			  case 4:System.out.println("Ahtun born");break;
			  case 5:System.out.println("binga born");break;
			  case 6:System.out.println("puti born");break;
			  case 7:System.out.println("thirt born");break;
			}  
			}
		else if(Year%7==6)
		{
			switch(day)
			{
			case 1:System.out.println("thirt born");break;
			  case 2:System.out.println("mayana born");break;
			  case 3:System.out.println("adipadi born");break;
			  case 4:System.out.println("Yarza born");break;
			  case 5:System.out.println("Ahtun born");break;
			  case 6:System.out.println("binga born");break;
			  case 7:System.out.println("puti born");break;
			}  
			}
		else if(Year%7==7)
		{
			switch(day)
			{
			case 1:System.out.println("puti born");break;
			  case 2:System.out.println("thirt born");break;
			  case 3:System.out.println("mayana born");break;
			  case 4:System.out.println("adipadi born");break;
			  case 5:System.out.println("Yarza born");break;
			  case 6:System.out.println("Ahtun born");break;
			  case 7:System.out.println("binga born");break;
			}  
			}
		else if(Year%7==0)
		{
			switch(day)
			{
			case 1:System.out.println("puti born");break;
			  case 2:System.out.println("thirt born");break;
			  case 3:System.out.println("mayana born");break;
			  case 4:System.out.println("adipadi born");break;
			  case 5:System.out.println("Yarza born");break;
			  case 6:System.out.println("Ahtun born");break;
			  case 7:System.out.println("binga born");break;
			}  
			}
		
			}
		
					
		
		
	}
	


