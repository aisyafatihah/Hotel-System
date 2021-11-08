//Nur Aisya Fatihah bt Azhar
package Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.border.MatteBorder;

public class roomDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roomDetails frame = new roomDetails();
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
	public roomDetails() {
		setBackground(SystemColor.desktop);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 666);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Room Details");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 21));
		lblNewLabel.setBounds(43, 31, 223, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1) SINGLE ROOM");
		lblNewLabel_1.setBounds(43, 77, 118, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RM150/NIGHT");
		lblNewLabel_2.setBounds(272, 77, 91, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2) QUEEN ROOM");
		lblNewLabel_3.setBounds(43, 217, 118, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RM248/NIGHT");
		lblNewLabel_4.setBounds(272, 217, 91, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("3) SUITE");
		lblNewLabel_5.setBounds(43, 362, 61, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RM 400/NIGHT");
		lblNewLabel_6.setBounds(272, 362, 91, 13);
		contentPane.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBounds(43, 95, 312, 112);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(152, 5, 0, 0);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("FACILITIES");
		lblNewLabel_8.setBounds(10, 5, 81, 13);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("-1x SUPER SINGLE BED");
		lblNewLabel_9.setBounds(20, 28, 243, 13);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("-AIR CONDITIONER");
		lblNewLabel_10.setBounds(20, 44, 243, 13);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("-FREE PARKING");
		lblNewLabel_11.setBounds(20, 61, 260, 13);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("-1x FREE BREAKFAST");
		lblNewLabel_12.setBounds(20, 75, 260, 12);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("-WATER HEATER");
		lblNewLabel_13.setBounds(20, 84, 243, 23);
		panel.add(lblNewLabel_13);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel1.setBounds(43, 240, 312, 112);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("FACILITIES");
		lblNewLabel_14.setBounds(10, 10, 175, 13);
		panel1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("-1x QUEEN BED");
		lblNewLabel_15.setBounds(30, 33, 245, 13);
		panel1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("-AIR CONDITIONER");
		lblNewLabel_16.setBounds(30, 43, 245, 18);
		panel1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("-FREE PARKING");
		lblNewLabel_17.setBounds(30, 56, 245, 20);
		panel1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("-2x FREE BREAKFAST");
		lblNewLabel_18.setBounds(30, 71, 245, 13);
		panel1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("-WATER HEATER");
		lblNewLabel_19.setBounds(30, 86, 245, 13);
		panel1.add(lblNewLabel_19);
		panel.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel2.setBounds(43, 385, 312, 112);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblNewLabel_20 = new JLabel("FACILITIES");
		lblNewLabel_20.setBounds(10, 10, 122, 13);
		panel2.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("-1x KING BED");
		lblNewLabel_21.setBounds(10, 33, 248, 13);
		panel2.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("-2x SUPER SINGLE BED");
		lblNewLabel_22.setBounds(10, 46, 248, 13);
		panel2.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("-AIR CONDITIONER");
		lblNewLabel_23.setBounds(10, 56, 248, 13);
		panel2.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("-FREE PARKING");
		lblNewLabel_24.setBounds(10, 69, 263, 13);
		panel2.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("-WATER HEATER");
		lblNewLabel_25.setBounds(10, 79, 263, 23);
		panel2.add(lblNewLabel_25);
	}
}
