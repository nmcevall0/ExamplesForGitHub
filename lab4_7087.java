//lab4_7078.java
//Created by: ???_7087
//Last Modified 10/16/15

package lab4_7087;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab4_7087 extends JFrame {
	public lab4_7087(){
		super("Lab4");
		ScreenSaver saver = new ScreenSaver();
		setLayout(new BorderLayout());
		add(saver,BorderLayout.CENTER);
	}
	public static void main(String args[]){
		lab4_7087 lab4 = new lab4_7087();
		lab4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lab4.setSize(200,210);	//set frame size
		lab4.setResizable(true);
		lab4.setVisible(true); //display frame
	}
}
