
public class AA_Methods {

	public static void main(String[] args) {

		findNumber();
		sayHello("Batuhan");

	}
	
	public static void findNumber() {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		int searched = 3;
		boolean condition = false;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == searched) {
				condition = true;
			}
		}
		
		if (condition) {
			System.out.println("Number is in the array");
		}else {
			System.out.println("Not in");
		}
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello : "+name);
	}

}
