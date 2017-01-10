package lab3_7087;

import java.util.Random;
import java.util.Scanner;


public class lab3_7087 {

	static Scanner scan=new Scanner(System.in);
	
	 public static Package load_a_package(){
		 Package pack=null;
		 int rand=(new Random()).nextInt(4);

		 switch(rand){ 
		 case 0: 
			 pack=new Box(); 
			 break; 
		 case 1: 
			 pack=new Letter(); 
			 break; 
		 case 2: 
			 pack=new MetalCrate(); 
			 break; 
		 case 3: 
			 pack=new WoodCrate(); 
			 break; 
		 } 
		pack.input(); 
		return pack; 
	 } 
	 
	 public static void main(String args[]){ 
	 
	 Package pack=null; 
	 for(int i=0;i<5;i++){ 
	 System.out.printf("\n**** package %d ****\n",i); 
	 pack=load_a_package(); 
	 System.out.printf( 
	 "The cost of this package is $%.2f\n",pack.cost()); 
	 } 
	 } 
	 } 
