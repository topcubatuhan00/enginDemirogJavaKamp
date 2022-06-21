package video45;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Default Constructor");
		// static class newlenirse calisir sadece.
	}
	
	static {
		System.out.println("Static Constructor");
		// static class kullanimlarinda calisir.
	}
	
	
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
