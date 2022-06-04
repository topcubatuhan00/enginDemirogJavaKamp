package homework;

public class biggestNumber {

	public static void main(String[] args) {

		int number1 = 500, number2 = 800, number3 = 400;
		int biggestN = number1;
		
		if(number2 > number1 && number2 > number3) {
			biggestN = number2;
		}else if(number3 > number1 && number3 > number2) {
			biggestN = number3;
		}
		System.out.println("The biggest number is : "+biggestN);
	}

}
