
public class Main {

	public static void main(String[] args) {

		/*MailLogger mailLogger = new MailLogger();
		mailLogger.Log("log message");
		
		BaseLogger[] loggers = new BaseLogger[] {new DBLogger(), new MailLogger(), new FileLogger()};
		
		for(BaseLogger logger : loggers) {
			logger.Log("asd");
		}*/
		
		CustomerManager customerManager = new CustomerManager(new DBLogger());
		customerManager.Add();
	}

}
