package video42;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		
		// is kodlari yazilir
		customerDal.add();
		
	}
	
}
