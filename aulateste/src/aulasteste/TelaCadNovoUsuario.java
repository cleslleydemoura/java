package aulasteste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;

public class TelaCadNovoUsuario {

	private JFrame frmSignup;
	private JTextField txtUser;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadNovoUsuario window = new TelaCadNovoUsuario();
					window.frmSignup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadNovoUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignup = new JFrame();
		frmSignup.setTitle("SignUp");
		frmSignup.setBounds(100, 100, 450, 300);
		frmSignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignup.getContentPane().setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(117, 101, 192, 20);
		frmSignup.getContentPane().add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(117, 76, 46, 14);
		frmSignup.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(117, 132, 46, 14);
		frmSignup.getContentPane().add(lblNewLabel_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(117, 157, 192, 20);
		frmSignup.getContentPane().add(txtPassword);
		
		JLabel lblNewLabel_2 = new JLabel("SignUp");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 50));
		lblNewLabel_2.setBounds(131, 11, 178, 59);
		frmSignup.getContentPane().add(lblNewLabel_2);
		
		JButton btnSalvar = new JButton("SignUp");
		btnSalvar.setBounds(173, 227, 89, 23);
		frmSignup.getContentPane().add(btnSalvar);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
