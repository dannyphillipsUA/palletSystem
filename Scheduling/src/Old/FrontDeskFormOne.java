package Old;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import New.Item;
import New.Order;

public class FrontDeskFormOne extends JFrame{

	private Order order;
	private ArrayList orders;
	private Item item;
	private Date today;
	private static JTextField textField = new JTextField();
	private ArrayList<String> words = new ArrayList<>();
	
	public FrontDeskFormOne(){
        
		//this.setUpPersistence();
		
        Order row1 = new Order("", "", 0, 0.00, today);
        Order row2 = new Order("", "", 0, 0.00, today);
        Order row3 = new Order("", "", 0, 0.00, today);
        Order row4 = new Order("", "", 0, 0.00, today);
        Order row5 = new Order("", "", 0, 0.00, today);
        Order row6 = new Order("", "", 0, 0.00, today);
        Order row7 = new Order("", "", 0, 0.00, today);
        Order row8 = new Order("", "", 0, 0.00, today);
        Order row9 = new Order("", "", 0, 0.00, today);
        Order row10 = new Order("", "", 0, 0.00, today);
        Order row11 = new Order("", "", 0, 0.00, today);
        Order row12 = new Order("", "", 0, 0.00, today);
        Order row13 = new Order("", "", 0, 0.00, today);
        Order row14 = new Order("", "", 0, 0.00, today);
        Order row15 = new Order("", "", 0, 0.00, today);
        Order row16 = new Order("", "", 0, 0.00, today);
        Order row17 = new Order("", "", 0, 0.00, today);
        Order row18 = new Order("", "", 0, 0.00, today);
        Order row19 = new Order("", "", 0, 0.00, today);
        Order row20 = new Order("", "", 0, 0.00, today);
        Order row21 = new Order("", "", 0, 0.00, today);
        Order row22 = new Order("", "", 0, 0.00, today);
        Order row23 = new Order("", "", 0, 0.00, today);
        Order row24 = new Order("", "", 0, 0.00, today);
        Order row25 = new Order("", "", 0, 0.00, today);
        Order row26 = new Order("", "", 0, 0.00, today);
        Order row27 = new Order("", "", 0, 0.00, today);
        Order row28 = new Order("", "", 0, 0.00, today);
        Order row29 = new Order("", "", 0, 0.00, today);
        Order row30 = new Order("", "", 0, 0.00, today);
        Order row31 = new Order("", "", 0, 0.00, today);
        Order row32 = new Order("", "", 0, 0.00, today);
        Order row33 = new Order("", "", 0, 0.00, today);
        Order row34 = new Order("", "", 0, 0.00, today);
        Order row35 = new Order("", "", 0, 0.00, today);
        Order row36 = new Order("", "", 0, 0.00, today);
        Order row37 = new Order("", "", 0, 0.00, today);
        Order row38 = new Order("", "", 0, 0.00, today);
        Order row39 = new Order("", "", 0, 0.00, today);
        Order row40 = new Order("", "", 0, 0.00, today);
        Order row41 = new Order("", "", 0, 0.00, today);
        Order row42 = new Order("", "", 0, 0.00, today);
        Order row43 = new Order("", "", 0, 0.00, today);
        Order row44 = new Order("", "", 0, 0.00, today);
        Order row45 = new Order("", "", 0, 0.00, today);
        Order row46 = new Order("", "", 0, 0.00, today);
        Order row47 = new Order("", "", 0, 0.00, today);
        Order row48 = new Order("", "", 0, 0.00, today);
        Order row49 = new Order("", "", 0, 0.00, today);
        Order row50 = new Order("", "", 0, 0.00, today);
        Order row51 = new Order("", "", 0, 0.00, today);
        Order row52 = new Order("", "", 0, 0.00, today);
        Order row53 = new Order("", "", 0, 0.00, today);
        Order row54 = new Order("", "", 0, 0.00, today);
        Order row55 = new Order("", "", 0, 0.00, today);
        Order row56 = new Order("", "", 0, 0.00, today);
        Order row57 = new Order("", "", 0, 0.00, today);
        Order row58 = new Order("", "", 0, 0.00, today);
        Order row59 = new Order("", "", 0, 0.00, today);
        Order row60 = new Order("", "", 0, 0.00, today);
        Order row61 = new Order("", "", 0, 0.00, today);
        Order row62 = new Order("", "", 0, 0.00, today);
        Order row63 = new Order("", "", 0, 0.00, today);
        Order row64 = new Order("", "", 0, 0.00, today);
        Order row65 = new Order("", "", 0, 0.00, today);
        Order row66 = new Order("", "", 0, 0.00, today);
        Order row67 = new Order("", "", 0, 0.00, today);
        Order row68 = new Order("", "", 0, 0.00, today);
        Order row69 = new Order("", "", 0, 0.00, today);
        Order row70 = new Order("", "", 0, 0.00, today);
        Order row71 = new Order("", "", 0, 0.00, today);
        Order row72 = new Order("", "", 0, 0.00, today);
        Order row73 = new Order("", "", 0, 0.00, today);
        Order row74 = new Order("", "", 0, 0.00, today);
        Order row75 = new Order("", "", 0, 0.00, today);
        Order row76 = new Order("", "", 0, 0.00, today);
        Order row77 = new Order("", "", 0, 0.00, today);
        Order row78 = new Order("", "", 0, 0.00, today);
        Order row79 = new Order("", "", 0, 0.00, today);
        Order row80 = new Order("", "", 0, 0.00, today);
        Order row81 = new Order("", "", 0, 0.00, today);
        Order row82 = new Order("", "", 0, 0.00, today);
        Order row83 = new Order("", "", 0, 0.00, today);
        Order row84 = new Order("", "", 0, 0.00, today);
        Order row85 = new Order("", "", 0, 0.00, today);
        Order row86 = new Order("", "", 0, 0.00, today);
        Order row87 = new Order("", "", 0, 0.00, today);
        Order row88 = new Order("", "", 0, 0.00, today);
        Order row89 = new Order("", "", 0, 0.00, today);
        Order row90 = new Order("", "", 0, 0.00, today);
        Order row91 = new Order("", "", 0, 0.00, today);
        Order row92 = new Order("", "", 0, 0.00, today);
        Order row93 = new Order("", "", 0, 0.00, today);
        Order row94 = new Order("", "", 0, 0.00, today);
        Order row95 = new Order("", "", 0, 0.00, today);
        Order row96 = new Order("", "", 0, 0.00, today);
        Order row97 = new Order("", "", 0, 0.00, today);
        Order row98 = new Order("", "", 0, 0.00, today);
        Order row99 = new Order("", "", 0, 0.00, today);
        Order row100 = new Order("", "", 0, 0.00, today);
        Order row101 = new Order("", "", 0, 0.00, today);
        Order row102 = new Order("", "", 0, 0.00, today);
        Order row103 = new Order("", "", 0, 0.00, today);
        Order row104 = new Order("", "", 0, 0.00, today);
        Order row105 = new Order("", "", 0, 0.00, today);
        
        //build the list
        List<Order> orders = new ArrayList<Order>();
        orders.add(row1);
        orders.add(row2);
        orders.add(row3);
        orders.add(row4);
        orders.add(row5);
        orders.add(row6);
        orders.add(row7);
        orders.add(row8);
        orders.add(row9);
        orders.add(row10);
        orders.add(row11);
        orders.add(row12);
        orders.add(row13);
        orders.add(row14);
        orders.add(row15);
        orders.add(row16);
        orders.add(row17);
        orders.add(row18);
        orders.add(row19);
        orders.add(row20);
        orders.add(row21);
        orders.add(row22);
        orders.add(row23);
        orders.add(row24);
        orders.add(row25);
        orders.add(row26);
        orders.add(row27);
        orders.add(row28);
        orders.add(row29);
        orders.add(row30);
        orders.add(row31);
        orders.add(row32);
        orders.add(row33);
        orders.add(row34);
        orders.add(row35);
        orders.add(row36);
        orders.add(row37);
        orders.add(row38);
        orders.add(row39);
        orders.add(row40);
        orders.add(row41);
        orders.add(row42);
        orders.add(row43);
        orders.add(row44);
        orders.add(row45);
        orders.add(row46);
        orders.add(row47);
        orders.add(row48);
        orders.add(row49);
        orders.add(row50);
        orders.add(row51);
        orders.add(row52);
        orders.add(row53);
        orders.add(row54);
        orders.add(row55);
        orders.add(row56);
        orders.add(row57);
        orders.add(row58);
        orders.add(row59);
        orders.add(row60);
        orders.add(row61);
        orders.add(row62);
        orders.add(row63);
        orders.add(row64);
        orders.add(row65);
        orders.add(row66);
        orders.add(row67);
        orders.add(row68);
        orders.add(row69);
        orders.add(row70);
        orders.add(row71);
        orders.add(row72);
        orders.add(row73);
        orders.add(row74);
        orders.add(row75);
        orders.add(row76);
        orders.add(row77);
        orders.add(row78);
        orders.add(row79);
        orders.add(row80);
        orders.add(row81);
        orders.add(row82);
        orders.add(row83);
        orders.add(row84);
        orders.add(row85);
        orders.add(row86);
        orders.add(row87);
        orders.add(row88);
        orders.add(row89);
        orders.add(row90);
        orders.add(row91);
        orders.add(row92);
        orders.add(row93);
        orders.add(row94);
        orders.add(row95);
        orders.add(row96);
        orders.add(row97);
        orders.add(row98);
        orders.add(row99);
        orders.add(row100);
        orders.add(row101);
        orders.add(row102);
        orders.add(row103);
        orders.add(row104);
        orders.add(row105);
        
        //create the model
        OrderTableModel model = new OrderTableModel(orders);
        //create the table
        JTable table = new JTable(model); 
        table.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
        table.setRowHeight(getHeight() + 30);
        
        textField.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
        textField.setBorder(new LineBorder(Color.BLACK));
        DefaultCellEditor dce = new DefaultCellEditor( textField );
        table.getColumnModel().getColumn(0).setCellEditor(dce);
        table.getColumnModel().getColumn(1).setCellEditor(dce);
        table.getColumnModel().getColumn(4).setCellEditor(dce);
        
        //create words for dictionary could also use null as parameter for AutoSuggestor(..,..,null,..,..,..,..) and than call AutoSuggestor#setDictionary after AutoSuggestr insatnce has been created
        words.add("ACS International");
        words.add("Active Screw");
        words.add("Air Concepts");
        words.add("Architecual Elements");
        words.add("AZ Chile Roasters");
        words.add("Arizona corrugated");
        words.add("AZ Electrical Apparatus");
        words.add("Ascent Aviation");
        words.add("Aura");
        words.add("Avent");
        words.add("Bakehouse Bread");
        words.add("Best Salavage");
        words.add("Green Valley");
        words.add("GW Plastics");
        words.add("ICS Company");
        words.add("Inter Fab");
        words.add("Intelight");
        words.add("Johns Manville");
        words.add("Mortex");
        words.add("Offshore");
        words.add("Pace Technologies");
        words.add("Schnipke");
        words.add("Secure Lane");
        words.add("Solar Industries");
        words.add("Solid Surface");
        words.add("Supply One");
        words.add("Tatoo");
        words.add("Tucson Cactus & Koi");
        words.add("Tucson Container");
        words.add("Tucson Precision");
        words.add("Ultralights");
        words.add("Wear Pro");
        words.add("XPI Composites");
        words.add("48x40");

        AutoSuggestor autoSuggestor = new AutoSuggestor(textField, this, words, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) {
            @Override
            boolean wordTyped(String typedWord) {
                return super.wordTyped(typedWord);//checks for a match in dictionary and returns true or false if found or not
            }
        };

        
        //add the table to the frame
        this.add(new JScrollPane(table));
        this.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
        this.setTitle("Editable Order Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args){
    	
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
				new FrontDeskFormOne();
            }
        });
    }

	public static JTextField getTextField() {
		return textField;
	}   

	// When the window opens, the user gets the option to pull the saved data down.
		private void setUpPersistence() throws IOException, ClassNotFoundException {
			int userInput =    
				    JOptionPane.showConfirmDialog(null, "Start with previous save state?");
				  if (userInput == JOptionPane.YES_OPTION) {
					  
					  FileInputStream fis = new FileInputStream("textField.txt");
					  ObjectInputStream ois = new ObjectInputStream(fis);
					  JTextField oldTextField = (JTextField) ois.readObject();
					  textField = oldTextField;
					  
					  fis = new FileInputStream("words.txt");
					  ois = new ObjectInputStream(fis);
					  ArrayList<String> oldWords = (ArrayList<String>) ois.readObject();
					  words = oldWords;
					  
					  repaint();
					  
				  }
				  else {
					  
				  }
				  
		}
		
		// This class checks to see if the user closes the window, and asks if they wish to save
		// their data.
		 private class ListenForWindowClose extends WindowAdapter {

			    @Override
			    public void windowClosing(WindowEvent e) {
			    	int userInput =    
			    		    JOptionPane.showConfirmDialog(null, "Save data?");
			    	if (userInput == JOptionPane.YES_OPTION) {
			    	try {
						
						FileOutputStream fos = new FileOutputStream("textField.txt");
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(textField);
						
						fos = new FileOutputStream("words.txt");
						oos = new ObjectOutputStream(fos);
						oos.writeObject(words);
						
						fos.close();
						oos.close();
						
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			    	}
			    	
			    }
			  }
}
