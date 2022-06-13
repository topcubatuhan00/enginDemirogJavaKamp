
public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void Add() {
		System.out.println("Added");
		logger.Log("Eklenme Saati - 10:58");
	}

}

/*
		Customer eklerken bunu loglama ihtiyacı duyarız. 
		Loglama yaparken de direkt olarak db loggerı newlersek
		bu clean coddan çıkıp spagetti coda dönüşür.
		Bunu önlemek için customerManager olusturulurken bir adet
		log çeşidi ister (db/file/mail). Gelen loglama cesidini (satir 6)
		olusturulan base logger referans degerine esitler ve gelen log
		classı kullanılır.
*/