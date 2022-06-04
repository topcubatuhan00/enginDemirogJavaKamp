package homework;

public class letterCheck {

	public static void main(String[] args) {

		String letter = "a";
		
		switch(letter.toLowerCase()) {
		case "a","ı","o","u":
			System.out.println("not a vowel");
			break;
		case "e","i","ü","ö":
			System.out.println("vowel");
			break;
		default:
			System.out.println("normal letter");
			break;
		}

	}

}
