package Old;
import java.awt.Font;
import java.sql.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import New.Order;

public class OrderTableModel extends AbstractTableModel {

	private final List<Order> orderList;
    
    private final String[] columnNames = new String[] {
            "Customer", "Item", "Quantity", "Price", "Due Date"
    };
    private final Class[] columnClass = new Class[] {
        String.class, String.class, Integer.class, Double.class, String.class
    };
 
    public OrderTableModel(List<Order> orderList)
    {
        this.orderList = orderList;
    }
     
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }
 
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
 
    @Override
    public int getRowCount()
    {
        return orderList.size();
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Order row = orderList.get(rowIndex);
        if(0 == columnIndex) {
            return row.getCustomer();
        }
        else if(1 == columnIndex) {
            return row.getItem();
        }
        else if(2 == columnIndex) {
            return row.getQuantity();
        }
        else if(3 == columnIndex) {
            return row.getPrice();
        }
        else if(4 == columnIndex) {
        	return row.getDueDate();
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Order row = orderList.get(rowIndex);
        if(0 == columnIndex) {
            row.setCustomer((String) aValue);
        }
        else if(1 == columnIndex) {
            row.setItem((String) aValue);
        }
        else if(2 == columnIndex) {
            row.setQuantity((Integer) aValue);
        }
        else if(3 == columnIndex) {
            row.setPrice((Double) aValue);
        }
        else if(4 == columnIndex) {
        	row.setDueDate((Date) aValue);
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return true;
    }
}
