package com.javapractice;

public class SnakeLadderUC7 {

	public static void main(String args[])
	{
		int dice=0; int options=0; 
		int player1=0; int player2=0;
		int dicecount1=0; int dicecount2=0;
		int chance=1;
		int winner=0;
		while( player1!=100 && player2!=100 )
		{
			if(chance==1)
			{
				dice= 1 + (int)(Math.random()*6);
				dicecount1++;
				options= (int)(Math.random()*3);
				if(options==1)
				{
					while(options==1)
					{
						player1+=dice;
						if(player1>100)
						{
							player1-=dice;
							System.out.println("Player 1 postion:"+ player1);
							break;
						}
						else if(player1<100)
						{
							System.out.println("Player 1 postion:"+ player1);
						}
						else
						{
							winner=player1;
							break;
						}
						dice= 1 + (int)(Math.random()*6);
						dicecount1++;
						options= (int)(Math.random()*3);
					}
				}

				else if(options==2)
				{
					player1-=dice;
					if(player1<0)
						player1=0;
					chance=0;
					System.out.println("Player 1 postion:"+ player1);
					continue;
				}
				else 
				{
					chance=0;
					System.out.println("No change in the position of Player 1.");
					continue;
				}
				
			}
			
			else
			{
				dice= 1 + (int)(Math.random()*6);
				dicecount2++;
				options= (int)(Math.random()*3);
				if(options==1)
				{
					while(options==1)
					{
						player2+=dice;
						if(player2>100)
						{
							player2-=dice;
							System.out.println("Player 2 postion:"+ player2);
							break;
						}
						else if(player2<100)
						{
							System.out.println("Player 2 postion:"+ player2);
						}
						else
						{
							winner=player2;
							break;
						}
						dice= 1 + (int)(Math.random()*6);
						dicecount2++;
						options= (int)(Math.random()*3);
					}
				}

				else if(options==2)
				{
					player2-=dice;
					if(player2<0)
						player2=0;
					chance=1;
					System.out.println("Player 2 postion:"+ player2);
					continue;
				}
				else 
				{
					chance=1;
					System.out.println("No change in the position of Player 2.");
					continue;
				}
			}
			
		}
		if(winner==player1)
			System.out.println("Player 1 wins with " +dicecount1 +" throws.");
		else
			System.out.println("Player 2 wins with " +dicecount2 +" throws.");
	}
}
