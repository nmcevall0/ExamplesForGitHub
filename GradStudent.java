//GradStudent.java
//created by: ????_7087
//last modified: 09/14/2015

package Lab2_7087;

import java.util.Scanner;

public class GradStudent extends Student{
	
	//As an extension of Student a GradStudent will have
	//all of the variables of the student class, as well
	//as all the variables related to being a GradStudent.
	
	Scanner scan = new Scanner(System.in);
	private String researchTopic;
	private String advisor;
	
	public GradStudent(){
		
		//The gradStudent's default constructor makes a call to the 
		//super's constructor which in this case would be the constructor
		//of the Student class. This enables a user to initiate a new
		//Grad Student who will have all the variables of both student and
		//Grad Student.
		super();
		readData();
	}
	
	private void readData(){
		
		//This method reads all the data necessary for only the Grad Student.
		
		if(gender == 'm'){
			
			System.out.print("Please input his research topic: ");
			researchTopic = scan.nextLine();
			System.out.print("Please input his research advisor: ");
			advisor = scan.nextLine();
			
		}
		else{
			
			System.out.print("Please input her research topic: ");
			researchTopic = scan.nextLine();
			System.out.print("Please input her research advisor: ");
			advisor = scan.nextLine();
			
		}
	}
	public void print(){
		
		//This method prints all the variables that belong to a Grad Student.
		//The call to super.print calls the print methods of the Student class 
		//so that all data related to a Grad Student, including their Student
		//variables, will be printed.
		
		super.print();
		
		if( gender == 'm'){
			
			System.out.println("His research topic is " +researchTopic + ".");
			System.out.println("His advisor's name is " + advisor + ".");
			
		}
		else{
			
			System.out.println("Her research topic is "+researchTopic + ".");
			System.out.println("Her advisor's name is " + advisor + ".");
			
		}
	}
}
