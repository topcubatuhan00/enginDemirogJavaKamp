package homework;

public class arraysSecond {

	public static void main(String[] args) {
		
		double[] numbers = {3.5, 4.2, 8.3};
		
		double total = 0;
		for(double x : numbers) {
			total += x;
		}
		System.out.println("Total : "+total);
	}

}
