import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.SystemColor;
import javax.swing.JComboBox;

public class SalesFrm extends JFrame {

	private JPanel contentPane;
	private JTextField dateField;
	private JTextField rateField_1;
	private JTextField quantiyField_2;
	private JTextField customerField_3;
	private JTextField productField_4;
	private JTextField paymentField_5;
	private JTextField amountField;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Scanner sc = new Scanner(System.in);
					//String a = sc.next();
					SalesFrm frame = new SalesFrm("maher");
					frame.setVisible(true);
				//	sc.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SalesFrm(String name) {
		setTitle("Sales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(260, 150, 1127, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("Accounting Software Package");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 38));
		lblNewLabel.setBounds(130, 10, 836, 54);
		getContentPane().add(lblNewLabel);
		setBackground(Color.DARK_GRAY);
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(10, 72, 159, 404);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PurchaseFrm pf = new PurchaseFrm(name);
				pf.setVisible(true);
			}
		});
		btnPurchase.setBounds(10, 45, 136, 40);
		btnPurchase.setForeground(Color.WHITE);
		btnPurchase.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnPurchase.setBackground(Color.BLACK);
		panel.add(btnPurchase);
		
		JButton btnNewButton_1_1 = new JButton("Customer");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			Customerfrm c = new Customerfrm(name);
			c.setVisible(true);
			
			
			
			}
		});
		btnNewButton_1_1.setBounds(10, 115, 136, 40);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton_1_1.setBackground(Color.BLACK);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Supplier");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			SupplierFRM s = new SupplierFRM(name);
			s.setVisible(true);
			
			}
		});
		btnNewButton_1_2.setBounds(10, 187, 136, 40);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton_1_2.setBackground(Color.BLACK);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Inventory");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
				ProductFRM p = new ProductFRM(name);
				p.setVisible(true);
			
			}
		});
		btnNewButton_1_3.setBounds(10, 264, 136, 40);
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton_1_3.setBackground(Color.BLACK);
		panel.add(btnNewButton_1_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 95, 155, 225);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 167, 155, 153);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 244, 155, 76);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 310, 155, 10);
		panel.add(separator_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 205));
		panel_1.setBounds(169, 72, 464, 404);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerField_3.setText(comboBox.getSelectedItem().toString());
			
			}
		});
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				productField_4.setText(comboBox_1.getSelectedItem().toString());
			
			
			}
		});
		comboBox_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		comboBox_1.setBounds(250, 165, 181, 24);
		panel_1.add(comboBox_1);
		
		
		
		comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		comboBox.setBounds(261, 111, 181, 24);
		
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter sale!!!");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(33, 24, 438, 53);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 111, 82, 24);
		panel_1.add(lblNewLabel_2);
		
		dateField = new JTextField();
		dateField.setBackground(UIManager.getColor("FormattedTextField.background"));
		dateField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		dateField.setBounds(67, 111, 107, 24);
		panel_1.add(dateField);
		dateField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(10, 223, 82, 24);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Product");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(184, 165, 73, 24);
		panel_1.add(lblNewLabel_2_1_1);
		
		rateField_1 = new JTextField();
		
		
		
		
					
					
					
		rateField_1.setBackground(UIManager.getColor("FormattedTextField.background"));
		rateField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		rateField_1.setColumns(10);
		rateField_1.setBounds(67, 167, 107, 24);
		panel_1.add(rateField_1);
		
		quantiyField_2 = new JTextField();
		quantiyField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		quantiyField_2.setColumns(10);
		quantiyField_2.setBounds(82, 223, 116, 24);
		panel_1.add(quantiyField_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Customer");
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(184, 111, 73, 24);
		panel_1.add(lblNewLabel_2_2);
		
		customerField_3 = new JTextField();
		customerField_3.setEditable(false);
		customerField_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		customerField_3.setColumns(10);
		customerField_3.setBounds(261, 111, 94, 24);
		panel_1.add(customerField_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Rate");
		lblNewLabel_2_3.setForeground(Color.BLACK);
		lblNewLabel_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_3.setBounds(10, 165, 82, 24);
		panel_1.add(lblNewLabel_2_3);
		
		productField_4 = new JTextField();
		productField_4.setEditable(false);
		productField_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		productField_4.setColumns(10);
		productField_4.setBounds(250, 165, 181, 24);
		panel_1.add(productField_4);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Payment");
		lblNewLabel_2_3_1.setForeground(Color.BLACK);
		lblNewLabel_2_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_3_1.setBounds(210, 223, 82, 24);
		panel_1.add(lblNewLabel_2_3_1);
		
		paymentField_5 = new JTextField();
		paymentField_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		paymentField_5.setColumns(10);
		paymentField_5.setBounds(292, 221, 150, 24);
		panel_1.add(paymentField_5);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Amount");
		lblNewLabel_2_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_3_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_3_1_1.setBounds(138, 271, 82, 24);
		panel_1.add(lblNewLabel_2_3_1_1);
		
		amountField = new JTextField();
		amountField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double r = Double.parseDouble(rateField_1.getText());
			double q = Double.parseDouble(quantiyField_2.getText());
						double a = r*q;
						amountField.setText(Double.toString(a));
			
			}
		});
		amountField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		amountField.setColumns(10);
		amountField.setBounds(200, 271, 150, 24);
		panel_1.add(amountField);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dateField.setText(null);
				amountField.setText(null);
				rateField_1.setText(null);
				quantiyField_2.setText(null);
				customerField_3.setText(null);
				productField_4.setText(null);
				paymentField_5.setText(null);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(40, 321, 158, 40);
		panel_1.add(btnNewButton);
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBounds(632, 72, 481, 404);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 461, 314);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Object[] coloumns = {"Date", "Customer", "Product", "Rate", "Quantity", "Amount", "Payment"};
		DefaultTableModel model = new DefaultTableModel();
		
		Object[] row = new Object[7];
		
		model.setColumnIdentifiers(coloumns);
		table.setModel(model);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sales Details !!");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(21, 17, 438, 53);
		panel_2.add(lblNewLabel_1_1);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(72);
		table.getColumnModel().getColumn(1).setPreferredWidth(101);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
	
		
		
		try {
			File f = new File("F:\\JAVA\\files\\"+name+"Sale.txt");
			Scanner fr = new Scanner(f);
			
				while(fr.hasNext()) {
				row[0]= fr.next();
				row[1]= fr.next();
				row[2]= fr.next();
				
				row[3]= Double.parseDouble(fr.next());
				row[4]= Double.parseDouble(fr.next());
				row[5]= Double.parseDouble(fr.next());
				row[6]= Double.parseDouble(fr.next());
				
				model.addRow(row);
				 
				}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		
		}
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales s = new Sales(name);
				s.addSales(dateField.getText(), customerField_3.getText(), productField_4.getText(), Double.parseDouble(quantiyField_2.getText()), Double.parseDouble(rateField_1.getText()) , Double.parseDouble(paymentField_5.getText()));
				boolean ab = s.saveSale();
				
				if(ab) {
					JOptionPane.showMessageDialog(null, "Sales added successfully");
					row[0]= dateField.getText();
					row[1]= customerField_3.getText();
					row[2]= productField_4.getText();
					
					row[3]= Double.parseDouble(quantiyField_2.getText());
					row[4]= Double.parseDouble(rateField_1.getText());
					row[5]= Double.parseDouble(amountField.getText());
					row[6]= Double.parseDouble(paymentField_5.getText());
					
					model.addRow(row);

					
					dateField.setText(null);
					amountField.setText(null);
					rateField_1.setText(null);
					quantiyField_2.setText(null);
					customerField_3.setText(null);
					productField_4.setText(null);
					paymentField_5.setText(null);
					
				}
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnAdd.setBackground(Color.BLACK);
		btnAdd.setBounds(284, 321, 158, 40);
		panel_1.add(btnAdd);
		
		try {
			File f = new File("F:\\JAVA\\files\\"+name+"Details.txt");
			Scanner fr = new Scanner(f);
		
			while(fr.hasNext()) {
				
				String a = fr.next();
				String b = fr.next();
				if(a.equals(".")) {}
				else {	
				comboBox.addItem(a);	
				}
				if(b.equals(".")) {}
				else {	
					comboBox_1.addItem(b);
				}
				
				fr.next();
				
				 
				}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		
		}
		
		JLabel lblNewLabel_2_4 = new JLabel("Welcome "+name);
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_4.setBounds(981, 10, 142, 24);
		contentPane.add(lblNewLabel_2_4);
		
		JButton btnLogOut = new JButton("Log Out?");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
				LoginWindow.main(null);
			}
		});
		btnLogOut.setForeground(Color.BLUE);
		btnLogOut.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnLogOut.setBackground(SystemColor.activeCaptionText);
		btnLogOut.setBounds(991, 37, 99, 16);
		contentPane.add(btnLogOut);
		
		
		
	}
}

