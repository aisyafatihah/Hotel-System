package Hotel;
import javax.swing.JOptionPane; 

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Button;
import Hotel.Guest;
import Hotel.GuestManager;

public class BookingScreen extends JFrame {

	/**
	 * 
	 */
	String msg ;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingScreen frame = new BookingScreen();
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
	public BookingScreen() {
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 702);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Booking Form");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setBounds(41, 34, 253, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROOM TYPE: ");
		lblNewLabel_1.setBounds(29, 123, 110, 27);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(183, 125, 164, 22);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Single", "Queen", "Suite"}));
		
		
		JLabel lblNewLabel_2 = new JLabel("ROOM QUANTITY: ");
		lblNewLabel_2.setBounds(29, 197, 132, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO. OF NIGHT(S): ");
		lblNewLabel_3.setBounds(29, 285, 110, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PAYMENT OPTION: ");
		lblNewLabel_4.setBounds(29, 384, 146, 40);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(185, 393, 253, 22);
		contentPane.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Pay Later (At Reception Counter)","Pay Now (Online Banking)"}));
				
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roomDetails rd= new roomDetails();
				rd.setVisible(true);
			}
		});
		btnNewButton.setBounds(199, 158, 85, 21);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 200, 164, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(183, 288, 164, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Book");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingManager bookingManager = new BookingManager();
				Booking booking = new Booking();
				
				Guest guest=new Guest();
				
				booking.setRoomType(comboBox.getSelectedItem().toString());
				booking.setArrivalDate(textField_4.getText());
				booking.setRoomsQuantity(textField_1.getText());
				booking.setNight(textField_2.getText());
				booking.setPaymentOpt(comboBox_1.getSelectedItem().toString());
				booking.setUsername(guest.getUsername());
				//booking.setGuestID(textField_3.getText());

				//new
				if(textField_1.getText().isEmpty() || textField_2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Incomplete Form");
					BookingScreen bm = new BookingScreen();
				
		
				} 
				else //every thing is fine, you can continue
				{

					/*BookingManager bookingMgr = new BookingManager();
					 * System.out.println(booking.getGuestID());

					Booking book = new Booking();
					String id = book.getGuestID();*/
				bookingManager.insertBooking(booking);
				JOptionPane.showMessageDialog(null,"BOOKED!");
				
				//JOptionPane.showMessageDialog(null,booking.getTotal());

				
				BookingDetails bm=new BookingDetails();
				bm.setVisible(true);
				dispose();

	
				}
				
				
			}
		});
		btnNewButton_1.setBounds(305, 587, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setBounds(199, 587, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_10 = new JLabel("DATE OF ARRIVAL:");
		lblNewLabel_10.setBounds(29, 335, 153, 27);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("(YYYY/MM/DD)");
		lblNewLabel_11.setBounds(41, 359, 98, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_4 = new JTextField();
		textField_4.setBounds(183, 338, 164, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

	}

}
