package com.ibm.training.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.ibm.training.jdbc.Product;
import com.ibm.training.jdbc.ProductDAO;

public class ProductFormSwingApp extends WindowAdapter implements ActionListener,ItemListener {
	
	JFrame frame = new JFrame("ProductApp v2.0");
	
	JLabel lblName = new JLabel("Product Name");
	JLabel lblPrice = new JLabel("Product Price");
	JLabel lblQoh = new JLabel("Qty On Hand");
	
	JTextField txtName = new JTextField(15);
	JTextField txtPrice = new JTextField(15);
	JTextField txtQoh = new JTextField(15);
	
	JButton btnSave = new JButton("Save Data");
	JButton btnClear = new JButton("Clear Form");
	
	JLabel lblStatus = new JLabel("                                  ");
	String[] lnfnames = {"Windows","Metal","Motif","Nimbus"};
	JLabel lblLnf = new JLabel("Choose your UI preference");
	
	JComboBox<String> lnf = new JComboBox<>(lnfnames) ;
	
	public ProductFormSwingApp() {
		//Arrange the ui
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(lblName);contentPane.add(txtName);
		contentPane.add(lblPrice);contentPane.add(txtPrice);
		contentPane.add(lblQoh);contentPane.add(txtQoh);
		contentPane.add(btnSave);contentPane.add(btnClear);
		contentPane.add(lblStatus);
		
		contentPane.add(lblLnf);contentPane.add(lnf);
		
		frame.setContentPane(contentPane);
		
		//register event handlers
		frame.addWindowListener(this);
		btnClear.addActionListener(this);
		btnSave.addActionListener(this);
		lnf.addItemListener(this);
		
		
		//make ui visible
		frame.setLocation(300, 400);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		ProductFormSwingApp app = new ProductFormSwingApp();

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object srcOfEvent = event.getSource();
		if(srcOfEvent == btnClear) {
			clearTextFields();
		}else if(srcOfEvent == btnSave) {
			String name = "";
			float price = 0;
			int qoh = 0;
			
			name = txtName.getText();
			
			try {
				price = Float.parseFloat(txtPrice.getText());
			} catch (NumberFormatException e) {
				lblStatus.setText(txtPrice.getText()+" is not a valid number");
				lblPrice.setForeground(Color.RED);
				return;
			}
			
			try {
				qoh = Integer.parseInt(txtQoh.getText());
			} catch (NumberFormatException e) {
				lblStatus.setText(txtQoh.getText()+" is not a valid number");
				lblQoh.setForeground(Color.RED);
				return;
			}
			
			Product p = new Product();
			p.setName(name);p.setPrice(price);p.setQoh(qoh);
			
			ProductDAO dao = new ProductDAO();
			dao.save(p);
			
			clearTextFields();
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String look = lnf.getSelectedItem().toString();
		try {
			switch (look) {
			case "Windows":
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				break;
			case "Motif":
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				break;
			case "Nimbus":
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				break;
			case "Mac":
				UIManager.setLookAndFeel("javax.swing.plaf.mac.MacLookAndFeel");

				break;
			case "Metal":
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
				break;
			}
			SwingUtilities.updateComponentTreeUI(frame);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	private void clearTextFields() {
		txtName.setText("");
		txtPrice.setText("");
		txtQoh.setText("");
		
		lblStatus.setText("                         ");
		
		lblPrice.setForeground(Color.BLACK);
		lblQoh.setForeground(Color.BLACK);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
