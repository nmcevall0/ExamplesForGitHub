package lab3_7087;

import java.util.Scanner;

public abstract class Crate implements Package {
	
	Scanner scan = new Scanner(System.in);
	public double cost = 0;
	public double weight;
	
	public void input(){
		
		if(this instanceof MetalCrate){
			System.out.print("Please enter the weight for the MetalCrate (lbs) : ");
			weight = scan.nextInt();
		}
		else{
			System.out.print("Please enter the weight for the WoodCrate (lbs) : ");
			weight = scan.nextInt();
		}
		
	}
	public double cost(){
	if(this instanceof MetalCrate){
		cost = (weight*1.3);
	}
	else{
		cost = (weight*1.4);
	}
	return cost;
	}
}
