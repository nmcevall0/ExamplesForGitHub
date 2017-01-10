package lab6_7087;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleClient {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		String Char;
		char answer;
		double A=0;
		double B=0;
		double C=0;
		double temp1, root1, root2;
		// connecting to the server
		System.out.println("Connecting to the server...");
		Socket client=new Socket("localhost",12345);
		System.out.println("Server connected.");

		ObjectOutputStream output=
			new ObjectOutputStream(client.getOutputStream());
		output.flush();
		ObjectInputStream input=
			new ObjectInputStream(client.getInputStream());
		System.out.println("I/O streams established.");
		System.out.println("Do you have any quadratic equations to solve? Y/N");	
		Scanner scan = new Scanner(System.in);
		Char=scan.next();
		answer=Char.charAt(0);
		if(answer=='Y'||answer=='y'){
			System.out.println("Please input the parameters for the quadratic equation.");
			System.out.print("A= ");
			A=scan.nextDouble();
			output.writeDouble(A);
			output.flush();
			System.out.print("B= ");
			B=scan.nextDouble();
			output.writeDouble(B);
			output.flush();
			System.out.print("C= ");
			C=scan.nextDouble();
			output.writeDouble(C);
			output.flush();
	        
			temp1 = Math.sqrt((Math.pow(B, 2)) - 4 * A * C );
	        
	        root1 = (- B + temp1 / (2 * A));
	        root2 = (- B - temp1 / (2 * A));
	 
	        System.out.println( "Root1 = " + root1);
	        System.out.println("Root2 = " + root2);
		}
		else{
			System.out.println("you said no!!");
			output.writeObject("Terminate");
			output.flush();
		}
		output.writeDouble(A);
		output.flush();

		Object obj;
			obj = input.readObject();
			System.out.println(obj);
		input.close();
		output.close();
		client.close();

		System.out.println("Client shut down");
	}
}
