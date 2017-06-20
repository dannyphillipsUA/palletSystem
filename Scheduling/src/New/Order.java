package New;
import java.util.Date;

public class Order {

	private String customer;
	private String item;
	private int quantity;
	private double price;
	private Date due;
	
	public Order(String string, String string2, int i, double d, Date endDay) {
		customer = string;
		item = string2;
		quantity = i;
		price = d;
		due = endDay;
	}
	
	public String getCustomer() {
		return customer;
	}

	public String getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}

	public Object getPrice() {
		return price;
	}

	public Date getDueDate() {
		return due;
	}

	public void setCustomer(String aValue) {
		customer = aValue;
	}

	public void setItem(String aValue) {
		item = aValue;
	}

	public void setQuantity(Integer aValue) {
		quantity = aValue;
	}

	public void setPrice(Double aValue) {
		price = aValue;
	}

	public void setDueDate(Date aValue) {
		due = aValue;
	}
	
}
