package Hotel;

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Font;
//import net.miginfocom.swing.MigLayout;
//import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageRoomScreen extends JFrame {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageRoomScreen window = new ManageRoomScreen();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageRoomScreen() {
		//initialize();
		
		getContentPane().setBackground(new Color(255, 204, 255));
		setBounds(100, 100, 513, 702);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		JLabel lblNewLabel = new JLabel("ROOM DETAILS");
		lblNewLabel.setBounds(74, 28, 288, 49);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 40));
		
		JLabel lblNewLabel_1 = new JLabel("Number :");
		lblNewLabel_1.setBounds(23, 95, 115, 25);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Type : ");
		lblNewLabel_2.setBounds(23, 138, 115, 25);
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3 = new JLabel("Price (RM):");
		lblNewLabel_3.setBounds(23, 182, 115, 25);
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(142, 95, 160, 25);
		textPane.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(142, 139, 160, 25);
		comboBox.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Single", "Queen", "Suite"}));
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(142, 182, 160, 25);
		textPane_1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(200, 274, 78, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomManager roomManager = new RoomManager();
				Room room = new Room();
				room.setType(comboBox.getSelectedItem().toString());
				room.setPrice(Double.parseDouble(textPane_1.getText()));
				roomManager.addRoom(room);
				JOptionPane.showMessageDialog(null,"DONE!");

			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel);
		getContentPane().add(lblNewLabel_3);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(lblNewLabel_2);
		getContentPane().add(comboBox);
		getContentPane().add(textPane);
		getContentPane().add(textPane_1);
		getContentPane().add(btnNewButton);

		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setBounds(288, 274, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomManager roomManager = new RoomManager();
				Room room = new Room();
				room.setRoomNum(textPane.getText());
				room.setType(comboBox.getSelectedItem().toString());
				room.setPrice(Double.parseDouble(textPane_1.getText()));
				roomManager.UpdateRoomDetails(room);
				JOptionPane.showMessageDialog(null,"UPDATED!");

			}
		});
		getContentPane().add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Back To Staff Menu");
		btnNewButton_1.setBounds(33, 274, 157, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffMenuScreen staffMenupage = new StaffMenuScreen();
				staffMenupage.setVisible(true);
				dispose();
			}
		});
		getContentPane().add(btnNewButton_1);
	}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	//private void initialize() {
		
//}


