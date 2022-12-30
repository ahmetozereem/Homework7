package simplegame;

import java.util.Scanner;

public class SimpleGame {

	
	public String convertTime(int seconds){
		
		if (seconds>0) {
			int hours= seconds/(60*60);
			int seconds2=seconds %60;
			
			String strhours = Integer.toString(hours);
			String strminutes = Integer.toString(((seconds-(hours*60*60))/60));
			String strseconds2 = Integer.toString(seconds2);
			
			String convert=strhours+":"+strminutes+":"+strseconds2;
			return convert;
					
		}
		else if (seconds==0) {
		
			String strseconds = Integer.toString(seconds);
			
			String convert=strseconds + ":"+strseconds+":"+strseconds;
			return convert;
						
			}
		else {
			int negativ=-1;					
			String strseconds = Integer.toString(negativ);
			
			String convert=strseconds + ":"+strseconds+":"+strseconds;
			return convert;
			
			}
		
	}

	
	 public int digitsSum(int input){
		
		int summe = 0;
		while (input>=1) {
			

			summe = summe + input%10;
			
			input = input/10;
			
				}
		return summe;
	}
	
	public static void main(String[] args) {
				
		SimpleGame game = new SimpleGame();
		
		System.out.println("which game to play: 1 or 2 ");
		Scanner sc = new Scanner(System.in);
		try {
			int sc1= sc.nextInt();
			
			
			if (sc1==1) {
				
				System.out.println("choose a seconds ");
						
				System.out.println(game.convertTime(sc.nextInt()));
				
				}
			
			else if (sc1==2) {
				
				System.out.println("choose an Input ");
				int seconds= sc.nextInt();
				
				System.out.println(game.digitsSum(seconds));
			}
			else {
				System.out.println("Error");
			}
			
		}
		
		finally {
	        sc.close();
	    }
		
	}	
}