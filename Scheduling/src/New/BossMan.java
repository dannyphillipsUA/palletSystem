package New;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.GridLayout;

public class BossMan extends JFrame{
	public BossMan() {
		jp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jp.add(btnUpdate);
		
		JLabel lblOrdersNotScheduled = DefaultComponentFactory.getInstance().createLabel("Orders not scheduled");
		lblOrdersNotScheduled.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jp.add(lblOrdersNotScheduled);
		
		DefaultTableModel tableModel = new DefaultTableModel(5, 0);
		table_1 = new JTable(tableModel);
		table_1.setCellSelectionEnabled(false);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Scheduling", "Customer", "Item", "Quantity", "Due Date"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		fillTable(table_1);
		
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jp.add(table_1);
		
		JLabel label = new JLabel("");
		jp.add(label);
		
		JLabel lblOrdersScheduled = DefaultComponentFactory.getInstance().createLabel("Orders Scheduled");
		lblOrdersScheduled.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jp.add(lblOrdersScheduled);
		
		JLabel label_1 = new JLabel("");
		jp.add(label_1);
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		jp.add(table_2);
		
		JLabel label_2 = new JLabel("");
		jp.add(label_2);
		
		jf.add(jp);
		jf.add(table_1);
		jf.add(table_2);
	}

	private static FrontDesk desk = new FrontDesk();
	private static ArrayList<Order> orders;
	private static JPanel jp = new JPanel();
	private static JTable jt = new JTable();
	private static JLabel Title = new JLabel("Orders");
	private static JButton update = new JButton();
	private static JFrame jf = new JFrame();
	private static JTable table_1;
	private JTable table_2;
	private BossMan bs = new BossMan();
	
	/**
	 * @wbp.nonvisual location=73,14
	 */
	private final JLabel lblScheduling = DefaultComponentFactory.getInstance().createTitle("Scheduling");
	
	public static void main(String[] args) throws IOException {

		desk.run();
		orders = desk.getOrders();

		table_1 = fillTable(table_1);
		
		jf.setVisible(true);
	}

	private static JTable fillTable(JTable table1) {

		DefaultTableModel tableModel = new DefaultTableModel(5, 0);
		table1 = new JTable(tableModel);

		for (int i = 0; i < orders.size(); i++) {
			boolean scheduling = false;
			String customer = orders.get(i).getCustomer();
			String item = orders.get(i).getItem();
			int quantity = orders.get(i).getQuantity();
			Date due = orders.get(i).getDueDate();

			Object[] data = { scheduling, customer, item, quantity, due };

			tableModel.addRow(data);
		}
		return table1;
		
	}

}
