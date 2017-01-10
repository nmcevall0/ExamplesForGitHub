//Date.java
//created by: ????_7087
//last modified: 09/14/2015

package Lab2_7087;

import java.util.Scanner;

public class Date {

	
	Scanner scan = new Scanner(System.in);
	private int month;
	private int day;
	private int year;
	
	public Date(){
		
		//The constructor of the date class reads the data and inputs
		//into the proper variables. It does not check for validity and
		//assumes month is entered as an integer not a string.
		
		System.out.print("Please input the month: ");
		month = scan.nextInt();
		System.out.print("Please input the day: ");
		day = scan.nextInt();
		System.out.print("Please input the year: ");
		year = scan.nextInt();
		
	}
	public void print(){
		
		//This method prints the date in month/day/year format.
		
		System.out.println(month + "/" + day + "/" + year + ".");
	}
}
