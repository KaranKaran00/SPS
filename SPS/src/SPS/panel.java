package SPS;
import java.util.Scanner;
import java.util.Random;

class panel {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		String[] game= {"STONE","PAPER","SCISSOR"};
		
		for(int i=0;i<game.length;i++) {
			System.out.print(" "+i+":"+game[i]);
		}
		System.out.print("\n");
		
		int choice=ran.nextInt(game.length);
		String v1=game[choice];
		
		
		int count1=0;
		int count2=0;
		int count3=0;
		int time=0;
		
		while(time<5) {
			String name = scan.nextLine().trim().toUpperCase();
			System.out.println("Computer Choice :"+v1);
		
		if(name.equals(v1)) 
		{
			System.out.println("It TIE! 😯");
			count1++;
			//System.out.println();
			
		}
		else if ((name.equals("STONE") && v1.equals("SCISSOR"))||
				(name.equals("PAPER")  && v1.equals("STONE"))||
				(name.equals("SCISSOR")&& v1.equals("PAPER")))
		{
			System.out.println("YOU win 😒");
			count2++;
			//System.out.println();
		}
				else
				{
					System.out.println("YOU LOST ! 😁");
					count3++;
					//System.out.println();
				}
		time++;
		}
		System.out.println();		
		System.out.println("TIE      : "+count1);
		System.out.println("You WIN  : "+count2);	
		System.out.println("You Lost : "+count3);	
		System.out.println();		
		if(time == 5)
		{
			if(count1 >= 3)
			{
				System.out.println("TIE      : "+count1);			
			}
			else if(count2 >= 3)
			{
				System.out.println("You WIN  : "+count2);			
			}
			else if(count3 >=3)
			{
				System.out.println("You Lost : "+count3);			
			}
			
			System.out.print("\nGAME END");
		}
		
		scan.close();
	}

}

