import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow {
	
	
	private JFrame frmLogin;
	private JTextField idField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				LoginWindow window = new LoginWindow();
					window.frmLogin.setVisible(true);
					
				} catch (Exception e) {
				e.printStackTrace();
			}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.BLACK);
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 205));
		panel.setBounds(10, 72, 177, 404);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(189, 72, 606, 404);
		frmLogin.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please Login!!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 24, 398, 53);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(53, 126, 111, 38);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(53, 205, 111, 38);
		panel_1.add(lblNewLabel_2_1);
		
		idField = new JTextField();
		idField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		idField.setBounds(210, 126, 301, 38);
		panel_1.add(idField);
		idField.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idField.setText(null);
				passwordField.setText(null);
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(53, 299, 203, 53);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equals("")&&idField.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please, enter a valid details");
					
				}
				else {
				boolean a = Test.login(idField.getText(), passwordField.getText());
					if(a) {
					frmLogin.dispose();
					JOptionPane.showMessageDialog(null, "Login successful.");
					SalesFrm sf = new SalesFrm(idField.getText());
					sf.setVisible(true);
					
					} else
						JOptionPane.showMessageDialog(null, "Incorrect password or id.");
				}
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(297, 299, 203, 53);
		panel_1.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		passwordField.setBounds(210, 205, 301, 38);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("For sign in");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(210, 253, 81, 22);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("click here");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.setVisible(false);
				RegisterFrm.main(null);
			}
		});
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setBounds(282, 254, 111, 21);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Accounting Software Package");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 38));
		lblNewLabel.setBounds(0, 10, 795, 54);
		frmLogin.getContentPane().add(lblNewLabel);
		frmLogin.setBackground(Color.DARK_GRAY);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(370, 170, 819, 523);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
