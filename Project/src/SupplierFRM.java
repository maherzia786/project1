import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SupplierFRM extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierFRM frame = new SupplierFRM("maher");
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
	public SupplierFRM(String name) {
		setTitle("Supplier");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(260, 150, 901, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("Accounting Software Package");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 38));
		lblNewLabel.setBounds(114, 10, 602, 52);
		getContentPane().add(lblNewLabel);
		setBackground(Color.DARK_GRAY);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(10, 72, 159, 404);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnPurchase = new JButton("Sales");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
				SalesFrm s = new SalesFrm(name);
			s.setVisible(true);
			
			
			}
		});
		btnPurchase.setForeground(Color.WHITE);
		btnPurchase.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnPurchase.setBackground(Color.BLACK);
		btnPurchase.setBounds(10, 57, 136, 40);
		panel.add(btnPurchase);
		
		JButton btnNewButton_1_1 = new JButton("Purchases");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
				PurchaseFrm p = new PurchaseFrm(name);
			p.setVisible(true);
			
			
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(10, 127, 136, 40);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Customer");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Customerfrm p = new Customerfrm(name);
			p.setVisible(true);
			
			
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(10, 199, 136, 40);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Inventory");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			ProductFRM p = new ProductFRM(name);
			p.setVisible(true);
			
			
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton_1_3.setBackground(Color.BLACK);
		btnNewButton_1_3.setBounds(10, 276, 136, 40);
		panel.add(btnNewButton_1_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 107, 155, 225);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 179, 155, 153);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 256, 155, 76);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 322, 155, 10);
		panel.add(separator_3);
		
		

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 205));
		panel_1.setBounds(169, 72, 709, 404);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Supplier");
		lblNewLabel_2_2.setBounds(27, 171, 77, 24);
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(111, 171, 171, 24);
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textField.setColumns(10);
		panel_1.add(textField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(305, 69, 394, 325);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Object[] coloumns = {"Sl", "Supplier Name", "Total Purchase", "Total Payment", "Balance"};
		DefaultTableModel model = new DefaultTableModel();
		
		Object[] row = new Object[5];
		
		model.setColumnIdentifiers(coloumns);
		table.setModel(model);
		
		
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(55);
		table.getColumnModel().getColumn(3).setPreferredWidth(55);
		table.getColumnModel().getColumn(2).setPreferredWidth(55);
		
		try {
			File f = new File("F:\\JAVA\\files\\"+name+"Details.txt");
			Scanner fr = new Scanner(f);
			Purchase s = new Purchase(name);
			
			for(int i=1;fr.hasNext();i++) {
				fr.next();
				fr.next();
				String a = fr.next();
				if(a.equals(".")) {}
				else {
			double ta = s.totalPurchase(a);
			double tp = s.totalPayment(a);
			
				row[0]= i;
				row[1]= a;
				row[2]= ta;
				
				row[3]= tp;
				row[4]= ta - tp;
				model.addRow(row);
				}
				
				
				 
				}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		
		}
		
		
		
		JButton btnPurchase_1 = new JButton("Search");
		btnPurchase_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				for(int i = model.getRowCount()-1	;i>-1;i--) {
					model.removeRow(i);
					
					
				}
				
				Purchase s = new Purchase(name);
			
					
					String a = textField.getText();
					if(a.equals("")) {}
					else {
					
				double ta = s.totalPurchase(a);
				double tp = s.totalPayment(a);
				
					row[0]= 1;
					row[1]= a;
					row[2]= ta;
					
					row[3]= tp;
					row[4]= ta - tp;
					
					model.addRow(row);
					textField.setText("");
					
					}
			
			}
		});
		btnPurchase_1.setBounds(100, 240, 122, 41);
		btnPurchase_1.setForeground(Color.WHITE);
		btnPurchase_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnPurchase_1.setBackground(Color.BLACK);
		panel_1.add(btnPurchase_1);
		
		JButton btnPurchase_2 = new JButton("Clear");
		btnPurchase_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			
			}
		});
		btnPurchase_2.setBounds(10, 304, 129, 41);
		btnPurchase_2.setForeground(Color.WHITE);
		btnPurchase_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnPurchase_2.setBackground(Color.BLACK);
		panel_1.add(btnPurchase_2);
		
		JButton btnPurchase_3 = new JButton("Add Supplier");
		btnPurchase_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				File f = new File("F:\\JAVA\\files\\"+name+"Details.txt");
				FileWriter fw = new FileWriter(f,true);
				
				String a = textField.getText();
				fw.write(".");
				fw.write(" ");
				fw.write(".");
				fw.write(" ");
				fw.write(a);
				fw.write("\n");
			
				textField.setText("");
			fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		btnPurchase_3.setBounds(166, 304, 129, 41);
		btnPurchase_3.setForeground(Color.WHITE);
		btnPurchase_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnPurchase_3.setBackground(Color.BLACK);
		panel_1.add(btnPurchase_3);
		
		JLabel lblNewLabel_1 = new JLabel("Suppliers Details !!");
		lblNewLabel_1.setBounds(100, 10, 438, 53);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		panel_1.add(lblNewLabel_1);
		
		JButton btnLogOut = new JButton("Log Out?");
		btnLogOut.setForeground(Color.BLUE);
		btnLogOut.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnLogOut.setBackground(Color.BLACK);
		btnLogOut.setBounds(736, 37, 99, 16);
		contentPane.add(btnLogOut);
		
		JLabel lblNewLabel_2_4 = new JLabel("Welcome "+name);
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_2_4.setBounds(726, 10, 142, 24);
		contentPane.add(lblNewLabel_2_4);
		
		
	}
}
