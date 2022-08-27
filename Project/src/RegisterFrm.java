import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterFrm extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField passField_1;
	private JTextField dobField_2;
	private JTextField emailField_3;
	private JTextField mobField_4;
	private JTextField genderField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrm frame = new RegisterFrm();
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
	public RegisterFrm() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(370, 170, 819, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		
		
		JLabel lblNewLabel = new JLabel("Accounting Software Package");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 38));
		lblNewLabel.setBounds(0, 10, 795, 54);
		getContentPane().add(lblNewLabel);
		setBackground(Color.DARK_GRAY);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 205));
		panel.setBounds(10, 72, 177, 404);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(189, 72, 606, 404);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("Please enter your details!!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 24, 438, 53);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 111, 82, 24);
		panel_1.add(lblNewLabel_2);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		nameField.setBounds(95, 111, 131, 24);
		panel_1.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(10, 165, 82, 24);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date of birth");
		lblNewLabel_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(10, 221, 82, 24);
		panel_1.add(lblNewLabel_2_1_1);
		
		passField_1 = new JTextField();
		passField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		passField_1.setColumns(10);
		passField_1.setBounds(95, 167, 131, 24);
		panel_1.add(passField_1);
		
		dobField_2 = new JTextField();
		dobField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		dobField_2.setColumns(10);
		dobField_2.setBounds(95, 223, 131, 24);
		panel_1.add(dobField_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email");
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(279, 111, 82, 24);
		panel_1.add(lblNewLabel_2_2);
		
		emailField_3 = new JTextField();
		emailField_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		emailField_3.setColumns(10);
		emailField_3.setBounds(355, 111, 140, 24);
		panel_1.add(emailField_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Mobile no.");
		lblNewLabel_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(279, 165, 82, 24);
		panel_1.add(lblNewLabel_2_3);
		
		mobField_4 = new JTextField();
		mobField_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		mobField_4.setColumns(10);
		mobField_4.setBounds(355, 165, 140, 24);
		panel_1.add(mobField_4);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameField.setText(null);
				passField_1.setText(null);
				dobField_2.setText(null);
				emailField_3.setText(null);
				mobField_4.setText(null);
				genderField_5.setText(null);
			}
			
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(33, 297, 203, 53);
		panel_1.add(btnNewButton);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a= nameField.getText();
				String b =	passField_1.getText();
				String c = dobField_2.getText();
			String d = 	emailField_3.getText();
			String g = mobField_4.getText();
			String f = genderField_5.getText();
			
				if(a.equals("") && b.equals("") && c.equals("") && d.equals("") && g.equals("") && f.equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please, enter a valid details");
					
				}
					else {	
			boolean ab = Test.register(nameField.getText(),passField_1.getText(),dobField_2.getText(),emailField_3.getText(),mobField_4.getText(),genderField_5.getText());
			
			if(ab) {
			dispose();
			LoginWindow.main(null);
			JOptionPane.showMessageDialog(null, "Registration Complete!!");
			}else
				JOptionPane.showMessageDialog(null, "Registration unsuccessful!!");
				}
			}
		});
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnSignIn.setBackground(Color.BLACK);
		btnSignIn.setBounds(292, 297, 203, 53);
		panel_1.add(btnSignIn);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Gender");
		lblNewLabel_2_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_3_1.setBounds(279, 221, 82, 24);
		panel_1.add(lblNewLabel_2_3_1);
		
		genderField_5 = new JTextField();
		genderField_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		genderField_5.setColumns(10);
		genderField_5.setBounds(355, 221, 140, 24);
		panel_1.add(genderField_5);
		
		JLabel lblNewLabel_3 = new JLabel("For Login");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(140, 265, 81, 22);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("click here");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			LoginWindow.main(null);
		
			
			}
		});
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setBounds(223, 266, 111, 21);
		panel_1.add(btnNewButton_2);
		
		
	}
}
