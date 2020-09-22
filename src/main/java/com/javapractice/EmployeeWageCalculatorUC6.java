package com.javapractice;

public class EmployeeWageCalculatorUC6 {

	public static void main(String args[])
	{
		int total=0, wdays=0, whrs=0, wagephr=20, fulltime=8, parttime=4, unitwage;
		
		for(int i=1; i<=30; i++)
		{
			int ec=(int)(Math.random()*3);
			
			//Limit check
			if(whrs>100 || wdays>20)
			{
				System.out.println("Limit of work reached.");
				break;
			}
			
			if(ec==0)
			{
				System.out.println("No wage earned on day: "+i);
			}
			else if(ec==1)
			{
				unitwage=wagephr*fulltime;
				total+=unitwage;
				wdays++;
				whrs+=fulltime;
				System.out.println("Wage earned on day "+ i +" by working full time is: "+ unitwage);
			}
			else{
				unitwage=wagephr*parttime;
				total+=unitwage;
				wdays++;
				whrs+=parttime;
				System.out.println("Wage earned on day "+ i +" by working part time is: "+ unitwage);
			}
		}
		System.out.println("Total working time: "+wdays+ " days & "+whrs+ " hours.");
		System.out.println("The total wage earned by the employee this month: "+total);
	}
}
