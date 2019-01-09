package datastructures;
import java.util.GregorianCalendar;

import bridgelabz.utility.utility;

public class Calendar 
{


private static int Day_of_Week;
public static void printCalendar(int year,int month)
{
	int Leapyear;
	int dayOfWeek=1;
	String space=" ";
	String []monthName= {"january","feb","march","April","May","June","july","August","Sep","oct","Nov","Dec"};
	int []calDays= {31,28,31,30,31,30,31,31,30,31,30,31};
	GregorianCalendar cal=new GregorianCalendar(year,month,1);
	if(year%100==0)
	
	 if(year%400==0)
		{
			calDays[1]=28;
			
		}
		else if(year%4==0)
		{
			calDays[1]=29;
			
		}
	System.out.println("year: "+ year + space + "month:"+monthName[month]+"\n");
	System.out.println(" S M T W TH F SA \n");
	for(int daycounter=1;daycounter<=calDays[month];daycounter++);
			
			int daycounter = 0;
			if(daycounter>9)
			{
				space=" ";
			}
			if(daycounter==1)
			{
				while(dayOfWeek!=cal.get(Calendar.Day_of_Week))
				{
					System.out.println(space+ " ");
					dayOfWeek++;
					
				}
			}
	

				else
				{
					if(dayOfWeek==8)
					{
						System.out.println("\n"+ daycounter + space);
						dayOfWeek=2;
						
					}
					else
					{
						System.out.println(daycounter + space);
						dayOfWeek++;
					
					}
								
				}
	
			}
public static void main(String[] args) 
{

System.out.println("enter the year");
int year=utility.getint();
System.out.println("enter the month number");
int month=utility.getint();
printCalendar(year,month);
}
	}


