package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 667, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(192, 33, 282, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(121, 189, 84, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(121, 292, 93, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CKN MANDI 1PC-250", "MTTN MANDI 2PC-600", "BIRYANI-200"}));
		c1.setBounds(254, 195, 169, 30);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(254, 298, 169, 30);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String quantity=t1.getText();
				int q=Integer.parseInt(quantity);
				int bill=0;
				if(item.equals("CKN MANDI 1PC-250"))
				{
					bill=q*250;
					JOptionPane.showMessageDialog(btnNewButton, "Good Evening\n selected item: "+item+" \n quantity: "+q+" \n your bill:"+bill);
					
				}
				else if(item.equals("MTTN MANDI 2PC-600"))
						{
					bill=q*600;
					JOptionPane.showMessageDialog(btnNewButton, "Good Evening\n selected item: "+item+" \n quantity: "+q+" \n your bill:"+bill);
					}
				else if(item.equals("BIRYANI-200"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton, "Good Evening\n selected item: "+item+" \n quantity: "+q+" \n your bill:"+bill);
				}
			    
				}
				
				
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(254, 391, 146, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
