package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registrationform {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationform window = new registrationform();
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
	public registrationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.setBounds(100, 100, 450, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(141, 24, 168, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRollNo = new JLabel("ROLL NO:");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRollNo.setBounds(56, 78, 59, 14);
		frame.getContentPane().add(lblRollNo);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(56, 132, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblBranch = new JLabel("BRANCH");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBranch.setBounds(56, 178, 46, 14);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGender.setBounds(56, 241, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JLabel lblProgLangs = new JLabel("PROG LANGS");
		lblProgLangs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProgLangs.setBounds(56, 316, 80, 14);
		frame.getContentPane().add(lblProgLangs);
		
		tb1 = new JTextField();
		tb1.setBounds(202, 75, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(202, 129, 86, 20);
		frame.getContentPane().add(tb2);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBackground(new Color(50, 205, 50));
		r1.setBounds(164, 237, 59, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBackground(new Color(255, 0, 0));
		r2.setBounds(227, 237, 72, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		c1.setBackground(new Color(210, 105, 30));
		c1.setBounds(153, 312, 46, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBackground(new Color(0, 191, 255));
		c2.setBounds(227, 312, 82, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBackground(new Color(220, 20, 60));
		c3.setBounds(324, 312, 80, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(new Color(255, 0, 0));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "ECE", "EEE"}));
		cb1.setBounds(202, 174, 72, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				String langs="";
				if(r1.isSelected())
				{
					gender="male";
					
				}
				if(r2.isSelected())
				{
					gender="female";
					
				}
				if(c1.isSelected())
				{
					langs=langs+" C";
				
				}
				if(c2.isSelected())
				{
					langs=langs+" JAVA";
			}
				if(c3.isSelected())
				{
					langs=langs+" PYTHON";
				}
				JOptionPane.showMessageDialog(btnNewButton,"Roll No :"+roll+"\n NAME : "+name+ "\n BRANCH :"+branch+"\n GENDER :"+gender+ "\n PROG LANGS :"+langs);
			
			}});
		btnNewButton.setForeground(new Color(0, 51, 204));
		btnNewButton.setBounds(173, 368, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
