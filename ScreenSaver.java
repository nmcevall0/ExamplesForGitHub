//ScreenSaver.java
//Created by: ???_7087
//Last Modified 10/16/15

package lab4_7087;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScreenSaver extends JPanel 
implements ActionListener, MouseWheelListener{

	private int x[] = new int[60]; //The declaration of all the variables
	private int y[] = new int[60]; //that will be used throughout the program
	private int numOfPoints=0;
	private int radius = 10;
	private int delay = 1000;
	private Timer timer = null;
	
	public ScreenSaver(){
		addMouseWheelListener(this); //the constructor of the program 
		timer = new Timer(1000, this);
		timer.start();
	}
	public void actionPerformed(ActionEvent e){
		//indicates that each time an ActionEvent happens
		//the program is to add a point and then repaint the image
		//with a new point
		addAPoint();
		repaint();
	}
	
	private void addAPoint(){
		//the add a point method determines the center of the spiral
		//then uses the numOfpoints to determine the new coordinate
		//of where the new point should be
		int centerX = (int) (getSize().getWidth() / 2);
		int centerY = (int) (getSize().getHeight() / 2);
		double x = centerX + Math.cos(numOfPoints*Math.PI/3)*radius;
		double y = centerY + Math.sin(numOfPoints*Math.PI/3)*radius;
		radius +=3;
		this.x[numOfPoints] = (int) x;
		this.y[numOfPoints]	= (int) y;
		numOfPoints++;
		//the if statement of this program says that if numOfPoints is 60
		//then the numOfPoints is to reset itself, which would restart the 
		//process of drawing a spiral
		if(numOfPoints == 60){
			numOfPoints =0;
			radius =10;
		}
	}
	
	public void paintComponent(Graphics g){
		//the paintComponent method first clears what has already been drawn
		//then draws a line from the x and y components for numOfPoints times.
		g.clearRect(0, 0, (int)getSize().getWidth(), (int)getSize().getHeight());
		g.drawPolyline(x, y, numOfPoints);
	}
	public void mouseWheelMoved(MouseWheelEvent e){
		//the mouseWheelMoved responds to MouseWheelEvents
		//to either slow down or speed up the speed in which the timer's
		//delay is set, which would also speed up or slow down the speed 
		//in which the spiral is drawn.
		int r = e.getWheelRotation();
		if(r<0){
			delay += 50; //makes the delay longer which slows down drawing
		}
		else{
			delay -= 50; //shortens the timer delay which speeds up drawing
		}
		//the calls below set the timer delay to the new number in response
		//to the mouseWheelEvent and then restarts the timer.
		timer.setDelay(delay);
		timer.start();
	}

}
