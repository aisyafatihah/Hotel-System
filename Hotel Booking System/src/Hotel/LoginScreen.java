package Hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.SystemColor;

public class LoginScreen extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
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
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;

	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 702);
		getContentPane().setBackground(new Color(255, 204, 255));
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username : ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(57, 92, 110, 14);
		getContentPane().add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(169, 87, 151, 22);
		getContentPane().add(textArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("Password : ");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(57, 125, 110, 14);
		getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 122, 151, 20);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(231, 175, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back to Main Page");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen main =new MainScreen();
				main.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(70, 175, 151, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Staff Login");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(172, 41, 98, 22);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterNewUserScreen regStaff =new RegisterNewUserScreen();
				regStaff.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(184, 209, 136, 23);
		getContentPane().add(btnNewButton_2);
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StaffManager staffManager = new StaffManager();
				
				String inputUsername = textArea_1.getText();
				char[] userPassword = passwordField.getPassword();
				String inputPassword = String.valueOf(userPassword);

					if(staffManager.validateStaffLogin(inputUsername,inputPassword)) {
						JOptionPane.showMessageDialog(null,"Welcome.");
						StaffMenuScreen staffMenu =new StaffMenuScreen();
						staffMenu.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null,"Wrong username or password.");
					
			}
		});
	}
}
