package lab6_7087;

import java.util.Scanner;

public class main {
	public static void main(String arg[]){
			
			String Char;
			char answer;
			double A, B, C;
			double temp1, root1, root2;
			System.out.println("Do you have any quadratic equations to solve? Y/N");	
			Scanner scan = new Scanner(System.in);
			Char=scan.next();
			answer=Char.charAt(0);
			if(answer=='Y'||answer=='y'){
				System.out.println("Please input the parameters for the quadratic equation.");
				System.out.print("A= ");
				A=scan.nextDouble();
				System.out.print("B= ");
				B=scan.nextDouble();
				System.out.print("C= ");
				C=scan.nextDouble();
		        
				temp1 = Math.sqrt((Math.pow(B, 2)) - 4 * A * C );
		        
		        root1 = (- B + temp1 / (2 * A));
		        root2 = (- B - temp1 / (2 * A));
		 
		        System.out.println( "Root1 = " + root1);
		        System.out.println("Root2 = " + root2);
			}
			else{
				System.out.println("you said no!!");
			}
	}
