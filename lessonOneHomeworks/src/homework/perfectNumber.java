package homework;

public class perfectNumber {

	public static void main(String[] args) {

		int number = 28, total = 0;
		
		for(int i = 1; i<number; i++) {
			if(number % i == 0) {
				total += i;
			}
		}
		
		if(total == number) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a perfect number");
		}

	}

}
