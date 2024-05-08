package textShow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela02 {

	private JFrame frmMytext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela02 window = new Tela02();
					window.frmMytext.setVisible(true);
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
		frmMytext = new JFrame();
		frmMytext.setTitle("MYTEXT");
		frmMytext.setBounds(100, 100, 450, 300);
		frmMytext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMytext.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("I just added a new text!");
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 40));
		lblNewLabel.setBounds(10, 74, 414, 47);
		frmMytext.getContentPane().add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(335, 227, 89, 23);
		frmMytext.getContentPane().add(btnExit);
	}

}
