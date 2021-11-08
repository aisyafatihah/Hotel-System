package Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Hotel.Booking;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import Hotel.BookingManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingDetails frame = new BookingDetails();
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
	public BookingDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BookingManager bookingMgr = new BookingManager();
		Booking book = new Booking();
		String id = book.getUsername();
		
		Guest g=new Guest();

		String s = bookingMgr.showBooking(id);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(51, 42, 667, 201);
		textArea.setText(s);

		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen ms=new MainScreen();
				ms.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(340, 592, 89, 23);
		contentPane.add(btnNewButton);
	}
}
