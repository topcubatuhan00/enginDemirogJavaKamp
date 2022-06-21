
public class Main {

	public static void main(String[] args) {
		
		WomanGameCalc womanGameCalc = new WomanGameCalc();
		womanGameCalc.calc();
		womanGameCalc.gameOver();
		
		/*
		 * 		abstract sınıflar newlenemez. bu sebeple base class
		 * 		gizlenmek istendigi zaman da kullanılabilir.
		 * 
		 */
		
		GameCalculator gameCalculator = new ManGameCalc();
		gameCalculator.calc();
		
	}

}
