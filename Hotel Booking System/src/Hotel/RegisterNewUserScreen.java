package Hotel;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterNewUserScreen extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterNewUserScreen frame = new RegisterNewUserScreen();
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
	private JTextField textField;
	private JTextField textField_1;
	
	public RegisterNewUserScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 702);
		getContentPane().setBackground(new Color(255, 204, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New User");
		lblNewLabel_2.setBounds(114, 73, 69, 19);
		lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 15));
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("       Enter Name : ");
		lblNewLabel.setBounds(34, 122, 123, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(188, 119, 171, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Password :");
		lblNewLabel_1.setBounds(34, 147, 123, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 144, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(188, 169, 96, 23);
		btnNewButton.setBackground(new Color(248, 248, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
					try {
						Staff staff = new Staff();
						StaffManager staffManager = new StaffManager();
						
						staff.setName(textField.getText());
						staff.setPassword(textField_1.getText());
						
						staffManager.addUser(staff);
						String useThisUsername = "LOGIN IN WITH THIS USERNAME : " + staff.getUsername();
						JOptionPane.showMessageDialog(null,useThisUsername);
						
						LoginScreen loginsc = new LoginScreen();
						loginsc.setVisible(true);
						dispose();
						
					} catch (HeadlessException e1) {
						e1.printStackTrace();
					}
		
			}
		});
		getContentPane().add(btnNewButton);
	}

}
