
public class FB_Product {
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	
	public FB_Product(int id, String name, String description, double price, int stockAmount, String color){
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.color = color;
	}
	
	public FB_Product() {}

	public String getName() {return name;}
	public int getId() {return id;}
	public String getDesc() {return description;}
	public double getPrice() {return price;}
	public int getStcAmount() {return stockAmount;}
	public String getColor() {return color;}
	
	public void setName(String name){this.name = name;}
	public void setId(int id){this.id = id;}
	public void setDesc(String desc){this.description = desc;}
	public void setPrice(double price){this.price = price;}
	public void setStcAmount(int stockAmount){this.stockAmount = stockAmount;}
	public void setColor(String color){this.color = color;}
	
}
