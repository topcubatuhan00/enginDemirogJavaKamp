package homework;

public class searchNumber {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		
		int searched = 5;
		boolean condition = false;
		
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] == searched) {
				condition = true;
			}
		}
		
		if(condition) {
			System.out.println("I found");
		}else {
			System.out.println("I cant found");
		}

	}

}
