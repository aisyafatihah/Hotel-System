package Hotel;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;

public class StaffMenuScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StaffMenuScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 702);
		
		getContentPane().setBackground(new Color(255, 204, 255));
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Manage Guest Check-Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckOutRoomScreen checkoutpage =new CheckOutRoomScreen();
				checkoutpage.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(41, 125, 192, 49);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Manage Guest Check-In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckInRoomScreen checkinpage =new CheckInRoomScreen();
				checkinpage.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(243, 122, 187, 55);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen mainpage =new MainScreen();
				mainpage.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 153));
		btnNewButton_2.setForeground(new Color(240, 255, 255));
		btnNewButton_2.setBounds(391, 254, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Staff Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(34, 29, 117, 29);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Manage Room Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageRoomScreen roompage = new ManageRoomScreen();
				roompage.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(132, 187, 187, 55);
		getContentPane().add(btnNewButton_3);
		
	}
}
