package Hotel;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CheckInRoomScreen extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckInRoomScreen frame = new CheckInRoomScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	public CheckInRoomScreen() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 702);
		getContentPane().setBackground(new Color(255, 204, 255));
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(220, 121, 204, 60);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Room Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(52, 125, 158, 47);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back To Staff Menu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffMenuScreen staffMenupage =new StaffMenuScreen();
				staffMenupage.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(121, 220, 177, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffManager staffManager = new StaffManager();
				int inputRoomNum = Integer.parseInt(textField.getText());
				String currentRoomStatus = "Booked";
				try {
					staffManager.changeRoomStatus(inputRoomNum,currentRoomStatus);
					JOptionPane.showMessageDialog(null,"Done!");

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(308, 220, 116, 29);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Check-In Guest");
		lblNewLabel_1.setBounds(34, 29, 213, 29);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	}
}
