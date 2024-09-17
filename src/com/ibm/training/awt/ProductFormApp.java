package com.ibm.training.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.ibm.training.jdbc.Product;
import com.ibm.training.jdbc.ProductDAO;

public class ProductFormApp implements ActionListener{
	
	Frame mainFrame = new Frame("Product App v1.0.9");
	
	Label lblName = new Label("Product Name");
	Label lblPrice = new Label("Product Price");
	Label lblQoh = new Label("Qty On Hand");
	Label lblStatus = new Label("                                      ");
	
	TextField txtName = new TextField(15);
	TextField txtPrice = new TextField(15);
	TextField txtQoh = new TextField(15);
	
	Button btnSave = new Button("Save Data");
	Button btnClear = new Button("Clear Form");
	
	public ProductFormApp() {
		Panel panel = new Panel();
		
		panel.add(lblName);panel.add(txtName);
		panel.add(lblPrice);panel.add(txtPrice);
		panel.add(lblQoh);panel.add(txtQoh);
		panel.add(btnSave);panel.add(btnClear);
		panel.add(lblStatus);
		
		mainFrame.add(panel);
		
		mainFrame.setSize(300, 250);
		mainFrame.setLocation(400, 250);
		mainFrame.setVisible(true);
		
		btnClear.addActionListener(this);
		btnSave.addActionListener(this);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnClear) {
			clearTextFields();
		}else if(e.getSource() == btnSave) {
			String name = txtName.getText();
			float price = 0;
			try {
				price = Float.parseFloat(txtPrice.getText());
			}catch (NumberFormatException ex) {
				lblStatus.setForeground(Color.RED);
				lblStatus.setText(txtPrice.getText()+" is not a number");
				txtPrice.setText("");
				return;
			}
			int qoh = Integer.parseInt(txtQoh.getText());
			Product p = new Product();
			p.setName(name);
			p.setPrice(price);
			p.setQoh(qoh);
			
			ProductDAO dao = new ProductDAO();
			dao.save(p);
			lblStatus.setText("Saved!!");
			clearTextFields();		
		}
		
	}

	private void clearTextFields() {
		txtName.setText("");
		txtPrice.setText("");
		txtQoh.setText("");
	}

	public static void main(String[] args) {
		new ProductFormApp();

	}

}
