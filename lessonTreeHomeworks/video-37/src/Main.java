
public class Main {

	public static void main(String[] args) {

		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Calc();
		
		KrediUI keKrediUI = new KrediUI();
		keKrediUI.KrediHesapla(new TarimKrediManager());
		
	}

}
