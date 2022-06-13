
public class FA_classesWithAttributes {

	public static void main(String[] args) {

		FB_Product product1 = new FB_Product(1, "Monster", "Abra A7", 11750, 20, "Black");
		
		FB_Product product2 = new FB_Product();
		product2.setId(1);
		product2.setName("Macbook");
		product2.setDesc("Air");
		product2.setPrice(13500);
		product2.setStcAmount(100);
		product2.setColor("Gray");
		
		
		FC_ProductManager productManager = new FC_ProductManager();
		
		productManager.AddProduct(product1);
		productManager.AddProduct(product2);
		
		productManager.SeeDetails(product2);
		
	}

}
