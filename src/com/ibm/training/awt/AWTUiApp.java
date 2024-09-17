package com.ibm.training.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class AWTUiApp extends MouseAdapter {

	Frame mainWindow = new Frame("My Java UI App :)");
	Label lblName = new Label("Enter Your Name");
	TextField txtName = new TextField(25);
	Button btnOK = new Button("Click Me!");
	Choice chcCountry = new Choice();
	List lstSkills = new List(4, true);
	
	public AWTUiApp() {
		
		chcCountry.addItem("India");
		chcCountry.addItem("Sri Lanka");
		chcCountry.addItem("Singapore");
		chcCountry.addItem("UAE");

		
		lstSkills.add("Java");
		lstSkills.add("MySql");
		lstSkills.add("Maven");
		lstSkills.add("JUnit");

		Panel panel = new Panel();

		panel.add(lblName);
		panel.add(txtName);
		panel.add(btnOK);
		panel.add(chcCountry);
		panel.add(lstSkills);

		mainWindow.add(panel);

		mainWindow.setLocation(300, 400);
		mainWindow.setSize(300, 250);
		mainWindow.setVisible(true);
		
		txtName.addMouseListener(this);
		mainWindow.addWindowListener(new WindowCloser());
	}

	public static void main(String[] args) {
		new AWTUiApp();
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		txtName.setBackground(Color.RED);
		txtName.setForeground(Color.WHITE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		txtName.setBackground(Color.WHITE);
		txtName.setForeground(Color.BLACK);
	}

	class WindowCloser extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
