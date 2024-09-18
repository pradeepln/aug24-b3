package com.ibm.training.awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class MyNotePad extends WindowAdapter implements ActionListener{
	
	Frame frame = new Frame("Untitled - MyNotePad v1.0.1");
	MenuBar menuBar = new MenuBar();
	Menu fileMenu = new Menu("File");
	Menu editMenu = new Menu("Edit");
	MenuItem newItem = new MenuItem("New");
	MenuItem openItem = new MenuItem("Open");
	MenuItem exitItem = new MenuItem("Exit");
	TextArea fileContents = new TextArea();
	
	public MyNotePad() {
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		frame.setMenuBar(menuBar);
		frame.add(fileContents);
		
		frame.setSize(400, 600);
		frame.setLocation(300, 300);
		
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		newItem.addActionListener(this);
		openItem.addActionListener(this);
		exitItem.addActionListener(this);
	}

	public static void main(String[] args) {
		MyNotePad app = new MyNotePad();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == newItem) {
			fileContents.setText("");
		}else if(e.getSource() == openItem) {
			fileContents.setText("");
			FileDialog fd = new FileDialog(frame, "Select a File to Open", FileDialog.LOAD);
			fd.setVisible(true);
			String fileName = fd.getFile();
			String dir = fd.getDirectory();
			System.out.println(dir+"........."+fileName);
			try {
				FileReader fReader = new FileReader(dir+fileName);
				BufferedReader bReader = new BufferedReader(fReader);
				String aLine = null;
				while((aLine = bReader.readLine()) != null) {
					fileContents.append(aLine+"\n");
				}
				bReader.close();
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}else if(e.getSource() == exitItem) {
			System.exit(0);
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		//TO DO : handle prompting for unsaved changes 
		System.exit(0);
	}
	
	
}
