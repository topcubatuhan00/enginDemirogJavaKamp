
public abstract class GameCalculator {
	public abstract void calc();
	
	public final void gameOver() {
		System.out.println("Game Over");
	}
	
	/*		Yapılan islem su : gameCalc sınıfı base sınıftır ve bunun
	 * 		cocukları yani bu sınıfı extend edenler kendilerine göre
	 * 		calc() fonksiyonu yazmak zorundadırlar. gameOver() 
 	 * 		fonksiyonu herkeste aynı olması gerektigi icin final 
	 * 		parametresi aldı. override edilemez.
	 */
}
