
public class Main {

	public static void main(String[] args) {

		BaseKrediManager[] krediManagers = new BaseKrediManager[] {
				new TarimKrediManager(),
				new MemurKrediManager(),
				new OgrenciKrediManager()
		};
		
		for(BaseKrediManager manager : krediManagers) {
			System.out.println(manager.calc(1000));
		}

	}

}
