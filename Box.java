package lab3_7087;

import java.util.Scanner;

public class Box implements Package{

	Scanner scan = new Scanner(System.in);
	public double weight;
	public double cost;
	public void input(){
		System.out.print("Please enter the weight for the Box (lbs): ");
		weight = scan.nextInt();
		
	}
	public double cost(){
		cost = (weight*1.2);
		return cost;
	}
	
}
