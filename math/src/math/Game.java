package math;
import java.util.Scanner;
import java.util.Random;
public class Game {

	public static void main(String[] args) {
		int min=1;
		int max=100;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(max-min+1)+min;
		System.out.println("Do you want to guessing number? ");
        int guess;
        int attem=0;
        do {
        	System.out.println("Enter number here=");
        	guess = input.nextInt();
        	if(guess < attem){
        		System.out.print("Your guessing is too low\n");
        	}else if(guess > randomNumber){
        		System.out.print("Your guessing is too high\n");
        	
        	}else {
        		attem++;
        		System.out.print("Congratulation your guess is right!!");
        	   break;
        	}
        }while(guess!= randomNumber);
        input.close(); 
	}
   
}
