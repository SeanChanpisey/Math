package math;
import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("=====Welcome to Vending Machine!=====");
		System.out.println("0.Check Balance");
		System.out.println("1.Coke");
		System.out.println("2.Pepi");
		System.out.println("3.Milk");
		System.out.println("4.Water");
		System.out.println("choose from (0 to 4)=");
		num= input.nextInt();
		float price;
		float total;
		float UserBal=10;
		switch(num) {
		case 0:
			System.out.println("Your balance is ="+UserBal+"$");
			break;
		case 1: System.out.println("price for Coke is 1.25$");
		  total = UserBal-1.25f;
		  System.out.println("Your Remaining Balance="+total+"$");
		case 2: System.out.println("price for Pepi is 1.50$");
		  total = UserBal-1.50f;
		  System.out.println("Your Remaining Balance="+total+"$");
		}
	}
}
