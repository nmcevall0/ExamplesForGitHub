//Student.java
//created by: ????_7087
//last modified: 09/14/2015

package Lab2_7087;

import java.util.Scanner;

public class Student {
	
	//Since student is the superclass in this assignment
	//all variables that each student will have regardless of
	//whether they are Grad or GradTA will be initiated here.
	
	Scanner scan = new Scanner(System.in);
	private String name;
	private int ssn;
	private int numOfCourses;
	private Date birthDate;
	protected char gender;
	protected String gend;
	public String m;
	
	public Student(){
		
		//The Student class's default construct
		
		readData();
	
	}

private void readData(){
	
	//the readData method that prompts the user for the 
	//necessary inputs.
	
	System.out.print("Please input the name: ");
	name = scan.nextLine();
	System.out.print("Please input the ssn(EX. 123456789): ");
	ssn = scan.nextInt();
	System.out.print("Male or Female (m/f): ");
	gend = scan.next();
	gender = gend.charAt(0);
	if( gender == 'm'){
		System.out.print("How many courses is he taking: ");
		numOfCourses = scan.nextInt();
		System.out.println("Please input his birth date: ");
		birthDate = new Date();
		
	}
	else{
		System.out.print("How many courses is she taking: ");
		numOfCourses = scan.nextInt();
		System.out.println("Please input her birth date: ");
		birthDate = new Date();
	}
}
public void print(){
	
	//the print method of this class prints only the items that 
	//are a part of this class
	
	System.out.println();
	System.out.println("The information you input was:");
	System.out.println(name+ "'s ssn is " +ssn);
	System.out.println("is taking "+numOfCourses +" courses");
	if(gender == 'm'){
		System.out.println("He is taking " +numOfCourses+ " courses.");
		System.out.print("His birthday is ");
		birthDate.print();
		
	}
	else{
		System.out.println("She is taking " +numOfCourses+ " courses.");
		System.out.print("Her birthday is ");
		birthDate.print();
	
	}
}
}
