package homework;

public class friendNumber {

	public static void main(String[] args) {

		int number1 = 220, number2 = 284, total1 = 0, total2  = 0;
		
		for(int i = 1; i<number1; i++) {
			if(number1 % i == 0) {
				total1 += i;
			}
		}
		
		for(int i = 1; i<number2; i++) {
			if(number2 % i == 0) {
				total2 += i;
			}
		}
		
		if(total1 == number2 && total2 == number1) {
			System.out.println("Frined Number");
		}else {
			System.out.println("Not a frined number");
		}
		
	}

}
