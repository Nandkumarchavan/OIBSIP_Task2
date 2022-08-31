//Nandkumar Sambhaji Chavan
//Task-2 Number guessing
//Java Development


package NUM_GUESS;

import java.util.*;
public class NUMBER_GUESSING_TASK2 {
	public static void Num_Guessing()
	{
		
		Scanner sc = new Scanner(System.in);
		int num=1+(int)(50*Math.random()); 
		int rounds=5;
		int guess,i,again,points=0;
		
		System.out.println("hello!! Welcome to Guess the Number game..");
		System.out.println("Input a number between 1 to 50");
		
		
		for(i=0;i<5;i++) {
			System.out.println("\nTry to Guess a number..");
			guess=sc.nextInt();
			
			
			
			if(guess>50 || guess<0) {
				System.out.println("Sorry!! You have to enter only number between 1 to 50");
			}
			else if(guess==num) 
			{
				System.out.println("Congrats!! You guessed right");
				points+=10;
				System.out.println("Your score is "+points);
				break;
			}
			else if (guess>num && i!=rounds-1) {
				System.out.println("Oops! Number is less than :"+guess);
				System.out.print("\nTry Again :( ");
			}
			else if(guess<num && i!=rounds-1) {
				System.out.println("Oops! Number is greater than"+guess);
				System.out.print("\nTry Again :( ");
			}
		}
		
		if(rounds==i) {
			System.out.println("\nyou have completed round");
			System.out.println("\nThe number is "+num);
			System.out.println("\n\nDo you want to continue..");
			System.out.println("Enter 1 for continue...");
			again=sc.nextInt();
			
			
			if(again==1) {
				Num_Guessing();
			}
			else {
				System.out.println("Thank You!! See You Again....");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		Num_Guessing();
	}
}