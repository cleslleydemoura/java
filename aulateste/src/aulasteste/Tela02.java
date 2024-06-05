package aulasteste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Tela02 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela02 window = new Tela02();
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
	public Tela02() {
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
		
		JLabel lblNewLabel = new JLabel("text here");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 50));
		lblNewLabel.setBounds(115, 51, 199, 96);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(172, 227, 89, 23);
		frame.getContentPane().add(btnExit);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
