
public class FC_ProductManager {
	
	public void AddProduct(FB_Product product) {
		System.out.println("Added : "+product.getName());
	}
	
	public void SeeDetails(FB_Product product) {
		System.out.println("Product id : " + product.getId()
				+ "\nProduct Name : " + product.getName()
				+ "\nProduct Description : " + product.getDesc()
				+ "\nProduct Price : " + product.getPrice()
				+ "\nProduct Stock Amount : " + product.getStcAmount()
				+ "\nProduct Color : "+product.getColor());
	}
	
}
