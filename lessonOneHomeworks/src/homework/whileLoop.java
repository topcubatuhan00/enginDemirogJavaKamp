package homework;

public class whileLoop {

	public static void main(String[] args) {

		boolean condition = true;
		
		int i = 0;
		while(condition) {
			System.out.println(i);
			i++;
			if(i == 10) {
				condition = false;
			}
		}

	}

}
