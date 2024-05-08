package textShow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela01 {

	private JFrame frmMytext;
	private JTextField txtUser;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 window = new Tela01();
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
	public Tela01() {
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
		
		JLabel lblNewLabel = new JLabel("MYTEXT");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 45));
		lblNewLabel.setBounds(127, 11, 182, 52);
		frmMytext.getContentPane().add(lblNewLabel);
		
		txtUser = new JTextField();
		txtUser.setBounds(127, 109, 182, 20);
		frmMytext.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setBounds(127, 84, 81, 14);
		frmMytext.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(127, 140, 81, 14);
		frmMytext.getContentPane().add(lblNewLabel_2);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(127, 165, 182, 20);
		frmMytext.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("SignIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUser.getText();
				String password = txtPassword.getText();
				Tela02.main(null);
			}
		});
		btnLogin.setBounds(176, 227, 89, 23);
		frmMytext.getContentPane().add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUser.setText(null);
				txtPassword.setText(null);
			}
		});
		btnClear.setBounds(10, 227, 89, 23);
		frmMytext.getContentPane().add(btnClear);
		
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
