
public class AB_MethodsWithParams {

	public static void main(String[] args) {

		String message = "Weather is nice today";
		String newMesssage = message.substring(0,8);
		String city = getCity();
		int total = sum(5, 9);
		
		int total2 = sum2(5,2,4,8,7,6);
		
		System.out.println(newMesssage);
		System.out.println(total);
		System.out.println(city);
		System.out.println(total2);
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sum2(int... nums) {
		int sum = 0;
		for(int x : nums) {
			sum += x;
		}
		return sum;
	}
	public static String getCity() {
		return "Bursa";
	}
}
