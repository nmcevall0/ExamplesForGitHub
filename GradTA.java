//GradTA.java
//created by: ????_7087
//last modified: 09/14/2015

package Lab2_7087;

import java.util.Scanner;

public class GradTA extends GradStudent{
	
	//GradTA is an extension of GradStudent so it has all the
	//variables of both student and grad student.
	
	Scanner scan = new Scanner(System.in);
	
	private String taCourse;
	private String taInstructor;
	private Date hireDate;

	public GradTA() {
		
		super();
		readData();
		
	}
	private void readData(){
		
		//read Data reads all the data related to the GradTA class.
		
		if( gender == 'm'){
			System.out.print("Please input his TA Course: ");
			taCourse = scan.nextLine();
			System.out.print("Please input his TA Instructor: ");
			taInstructor = scan.nextLine();
			System.out.println("Please input his hire date: ");
			hireDate = new Date();
			
		}
		else {
			System.out.print("Please input her TA Course: ");
			taCourse = scan.nextLine();
			System.out.print("Please input her TA Instructor: ");
			taInstructor = scan.nextLine();
			System.out.println("Please input her hire date: ");
			hireDate = new Date();
			
		}
	}
	public void print(){
		
		//The print method for the GradTA class that prints the variables
		//for the GradTA class as well as making a call to print the variables
		//of the preceding super class.
		
		super.print();
		if( gender == 'm'){
			System.out.println("His TA Course is " + taCourse + ".");
			System.out.println("His TA Instructor is " + taInstructor + ".");
			System.out.print("His hire date is: ");
			hireDate.print();
			
		}
		else {
			System.out.println("Her TA Course is " + taCourse + ".");
			System.out.println("Her TA Instructor is " + taInstructor + ".");
			System.out.print("Her hire date is: ");
			hireDate.print();
			
		}
	}
}
