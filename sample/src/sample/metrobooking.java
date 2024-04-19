package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metrobooking {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metrobooking window = new metrobooking();
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
	public metrobooking() {
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
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setBounds(138, 11, 122, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("NAME");
		tb1.setForeground(new Color(211, 211, 211));
		tb1.setBounds(44, 46, 46, 21);
		frame.getContentPane().add(tb1);
		
		JLabel tb2 = new JLabel("SOURCE");
		tb2.setForeground(new Color(211, 211, 211));
		tb2.setBounds(44, 97, 46, 14);
		frame.getContentPane().add(tb2);
		
		JLabel tb3 = new JLabel("DESTINATION");
		tb3.setForeground(new Color(192, 192, 192));
		tb3.setBounds(45, 143, 74, 14);
		frame.getContentPane().add(tb3);
		
		tb5 = new JTextField();
		tb5.setBounds(160, 46, 86, 20);
		frame.getContentPane().add(tb5);
		tb5.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MGBS", "SEC EAST", "JNTU"}));
		cb1.setBounds(160, 94, 100, 21);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CHAI PURI", "MGBS", "SEC WEST"}));
		cb2.setBounds(160, 139, 100, 18);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "COMBO"}));
		cb3.setBounds(161, 181, 99, 21);
		frame.getContentPane().add(cb3);
		
		JLabel tb4 = new JLabel("NUMBER OF TICKETS");
		tb4.setForeground(new Color(192, 192, 192));
		tb4.setBounds(44, 184, 107, 14);
		frame.getContentPane().add(tb4);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  String nam = tb5.getText();
			  String source = (String) cb1.getSelectedItem();
			  String destination = (String)cb2.getSelectedItem();
			  String numberoftickets = (String) cb3.getSelectedItem();
			  int nt= Integer.parseInt(numberoftickets);
			  if(source.equals(destination)) {
				 JOptionPane.showMessageDialog(btnNewButton, "Please check the stations");
			  }
			  else
			  {
				  int bill = 0;
				  bill = bill+nt*50;
				  int res = 0;
				  res = JOptionPane.showConfirmDialog(btnNewButton, "name :"+nam+"\n source :"+source+"\n destination :"+destination+"\n numberoftickets :"+nt+"\n amount :"+bill);
				  if(res==YES_OPTION)
				  {
					  JOptionPane.showMessageDialog(btnNewButton, "Booking Confirmed");
				  }
				  else {
					  JOptionPane.showMessageDialog(btnNewButton, "Booking Cancelled");
				  }
				  
			  }
			}
		});
		btnNewButton.setForeground(new Color(192, 192, 192));
		btnNewButton.setBounds(138, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Desktop\\metro.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
