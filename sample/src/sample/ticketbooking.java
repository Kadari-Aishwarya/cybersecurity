package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class ticketbooking {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel tb1 = new JLabel("NAME");
		tb1.setForeground(new Color(255, 255, 255));
		tb1.setBounds(27, 67, 98, 22);
		frame.getContentPane().add(tb1);
		
		JLabel tb2 = new JLabel("MOVIE NAME");
		tb2.setForeground(new Color(255, 255, 255));
		tb2.setBounds(27, 100, 106, 30);
		frame.getContentPane().add(tb2);
		
		JLabel tb3 = new JLabel("NUMBER OF TICKETS");
		tb3.setForeground(new Color(255, 255, 255));
		tb3.setBounds(27, 143, 116, 30);
		frame.getContentPane().add(tb3);
		
		textField = new JTextField();
		textField.setBounds(135, 68, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "PREMALU", "HANMAN", "TRUE LOVER"}));
		cb1.setBounds(135, 104, 86, 26);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "COMBO"}));
		cb2.setBounds(135, 147, 86, 22);
		frame.getContentPane().add(cb2);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(UIManager.getColor("CheckBox.foreground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill =0;
				String name =tb1.getText();
				String movie =(String) cb1.getSelectedItem();
				String tickets = (String) cb2.getSelectedItem();
				int nt= Integer.parseInt(tickets);
				if(movie.equals("PREMALU"))
					{
					 bill = bill+nt*150;
					}
				if(movie.equals("HANMAN"))
				{
				bill = bill+nt*150;
				}
				if(movie.equals("TRUE LOVER"))
				{
					bill = bill+nt*150;
				}
				JOptionPane.showMessageDialog(btnNewButton,"NAME:"+name+"\n MOVIENAME:"+movie+"\nNUMBER OF TICKETS:"+nt+"\nAmount"+bill);
			}
		});
		btnNewButton.setBounds(143, 207, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_3 = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(120, 11, 194, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\film-3057394_640.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 266);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
