package video45;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		product.id = 1;
		product.name = "Mouse";
		product.price = 50;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
