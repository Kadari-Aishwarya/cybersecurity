package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bookstore {
    int items=0;
    int total =0;
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
					bookstore window = new bookstore();
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
	public bookstore() {
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
		
		JLabel lblNewLabel = new JLabel("BOOK STORE APPLICATION");
		lblNewLabel.setForeground(new Color(204, 102, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(111, 0, 203, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				total=total+1000;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\book 4.png"));
		btnNewButton.setBounds(145, 70, 115, 148);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				total=total+500;
				tb1.setText(""+items);
				tb2.setText(""+total);
				}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\book 5.png"));
		btnNewButton_1.setBounds(10, 29, 125, 189);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				total=total+700;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\images.jfif"));
		btnNewButton_2.setBounds(270, 70, 154, 148);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setForeground(new Color(204, 0, 51));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(232, 24, 67, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setForeground(new Color(204, 102, 102));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setBounds(232, 49, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(309, 21, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(309, 46, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("RS : 500/-");
		lblNewLabel_3.setBounds(32, 230, 100, 0);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS : 1000/-");
		lblNewLabel_4.setBounds(171, 221, 92, 8);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS :700/-");
		lblNewLabel_5.setBounds(327, 218, 67, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("delete");
		btnNewButton_3.setBackground(new Color(204, 102, 102));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items-1;
				total=total-500;
				tb1.setText(""+items);
				tb2.setText(""+total);
				
			}
		});
		btnNewButton_3.setBounds(32, 234, 89, 27);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("delete");
		btnNewButton_4.setBackground(new Color(204, 102, 102));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			items = items-1;
			total=total-1000;
			tb1.setText(""+items);
			tb2.setText(""+total);}
		});
		btnNewButton_4.setBounds(171, 238, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("delete");
		btnNewButton_5.setBackground(new Color(204, 102, 102));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items-1;
				total=total-700;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton_5.setBounds(302, 238, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS : 500/-");
		lblNewLabel_6.setBounds(42, 218, 67, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\pexels-pixabay-36717.jpg"));
		lblNewLabel_7.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
