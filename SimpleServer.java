package lab6_7087;


import java.net.*;
import java.io.*;

public class SimpleServer {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		double a;
		double b;
		double c=0.12;
		double array[] = null;
		double temp1, root1, root2;
		int arraypos=0;
		// creating the server
		ServerSocket server=new ServerSocket(12345, 100);

		System.out.println("Server is listening at port 12345...");
		Socket connection=server.accept();

		System.out.println("A client connected.");
		ObjectOutputStream output=
			new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		ObjectInputStream input = new ObjectInputStream(connection.getInputStream());

		System.out.println("I/O streams established.");
		final Object obj = input.readObject();
		if(obj instanceof Double) {
				Double variable=(Double) input.readDouble();
				array[arraypos]=variable;
				System.out.println("Client said "+variable);
				if(((arraypos+1)%3)==0){
					a=array[arraypos-2];
					b=array[arraypos-1];
					c=array[arraypos];

			        double discriminant = b * b - 4 * a * c;
					if (discriminant > 0){
						 
			            // r = -b / 2 * a;  
			            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			            //Equation has two roots
			            output.writeObject("Root1= ");
						output.writeDouble(root1);
						output.flush();
			            output.writeObject("Root2= ");
						output.writeDouble(root2);
						output.flush();
			        }
			 
			 
			        if (discriminant == 0){
			        	//Equation has one root
			            root1 = -b / (2 * a);
			            root2 = -b / (2 * a);

						output.writeDouble(root1);
						output.flush();
			 
			        }
			 
			        if (discriminant < 0){
			        	//Equation has no roots
			        	output.writeObject("no root");
			        }
				}
				arraypos++;
		} else {
			input.close();
			output.close();
			connection.close();
		}

		output.writeDouble(c);
		output.flush();



		System.out.println("Server shut down");
	}
}
