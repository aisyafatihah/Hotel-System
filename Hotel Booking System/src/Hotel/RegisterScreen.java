//Nur Aisya Fatihah
package Hotel;
import javax.swing.*; 

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RegisterScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterScreen frame = new RegisterScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 702);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("NAME : ");
		name.setBounds(21, 197, 102, 13);
		contentPane.add(name);
		
		textField = new JTextField(20);
		textField.setForeground(Color.BLACK);
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(167, 194, 166, 19);
		contentPane.add(textField);
		
		JLabel ic = new JLabel("IC NO. : ");
		ic.setBounds(21, 248, 48, 13);
		contentPane.add(ic);
		
		textField_1 = new JTextField(20);
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setBounds(167, 245, 166, 19);
		contentPane.add(textField_1);
		
		JLabel phone = new JLabel("PHONE NUMBER : ");
		phone.setBounds(21, 300, 127, 13);
		contentPane.add(phone);
		
		textField_2 = new JTextField(20);
		textField_2.setBackground(new Color(220, 220, 220));
		textField_2.setBounds(167, 297, 166, 19);
		contentPane.add(textField_2);
		
		JLabel address = new JLabel("ADDRESS :");
		address.setBounds(21, 360, 72, 13);
		contentPane.add(address);
		
		textField_3 = new JTextArea();
		textField_3.setBackground(new Color(220, 220, 220));
		textField_3.setBounds(167, 338, 166, 57);
		contentPane.add(textField_3);
		
		JLabel email = new JLabel("EMAIL : ");
		email.setBounds(21, 421, 127, 13);
		contentPane.add(email);
		
		textField_4 = new JTextField(20);
		textField_4.setBackground(new Color(220, 220, 220));
		textField_4.setBounds(167, 418, 166, 19);
		contentPane.add(textField_4);
		
		//REgister
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GuestManager guestManager = new GuestManager();
				Guest guest = new Guest();

				guest.setUsername(textField_5.getText());
				guest.setName(textField.getText());
				guest.setIC(textField_1.getText());
				guest.setTelephoneNumber(textField_2.getText());
				guest.setAddress(textField_3.getText());
				guest.setEmail(textField_4.getText());

				//error
				if(textField.getText().isEmpty()||textField_1.getText().isEmpty() || textField_2.getText().isEmpty()
						||textField_3.getText().isEmpty() ||textField_4.getText().isEmpty()||textField_5.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Incomplete Information");
					RegisterScreen rg=new RegisterScreen();
				} 
				else //every thing is fine, you can continue
				{
					guestManager.insertGuest(guest);
				JOptionPane.showMessageDialog(null,"REGISTERED!");
	
				BookingScreen bm = new BookingScreen();
				bm.setVisible(true);
				
				dispose();
				}
			}
		});
		
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setBackground(new Color(0, 51, 204));
		btnNewButton.setBounds(322, 620, 89, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("GUEST REGISTRATION FORM");
		lblNewLabel.setBounds(64, -61, 219, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GUEST REGISTRATION FORM");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1.setBounds(21, 55, 370, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen main =new MainScreen();
				main.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 51, 204));
		btnNewButton_1.setBounds(226, 619, 72, 23);
		contentPane.add(btnNewButton_1);
		
		textField_5 = new JTextField(20);
		textField_5.setForeground(Color.BLACK);
		textField_5.setBackground(new Color(220, 220, 220));
		textField_5.setBounds(167, 155, 166, 19);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("USERNAME");
		lblNewLabel_2.setBounds(21, 158, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
