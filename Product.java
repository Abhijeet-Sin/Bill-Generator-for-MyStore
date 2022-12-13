package project;

public class Product {
	
	@Override
	public String toString() {
		return "Product name =" + pname + "  Product Id =" + pid + "  Quantity You Bought =" + quantity + "  Price =" + price;
	}

	private long pid;
	private String pname;
	private int quantity;
	private double price;
	
	public Product(String pname) {
		super();
		this.pname = pname;
		this.pid = generateProductId();
	}

	private long generateProductId() {
		long low =(long)Math.round(Math.random()*20000);
		return low;
	}

	public Product(String pname, int quantity, double price) {
		super();
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.pid = generateProductId();
	}

	public long getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
