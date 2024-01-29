package math;

import java.util.Scanner;

public class kare {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input x=");
		x= scanner.nextDouble();
		System.out.println("Input y=");
		y= scanner.nextDouble();
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("z= "+z+" cm");
		
		

	}

}
