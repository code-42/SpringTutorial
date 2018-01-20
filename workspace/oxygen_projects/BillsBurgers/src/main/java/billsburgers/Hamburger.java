package billsburgers;

public class Hamburger {
	
    private String name;
    private String meat;
    private String bread;
    private double price;
    
	public Hamburger() {
	}
	
	public Hamburger(String name, String meat, String bread, double price) {
		this.name = name;
		this.meat = meat;
		this.bread = bread;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getMeat() {
		return meat;
	}
	public String getBread() {
		return bread;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Hamburger [name=" + name + ", meat=" + meat + ", bread=" + bread + ", price=" + price + "]";
	}
    
    

}
