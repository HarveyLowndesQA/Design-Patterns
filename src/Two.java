
public class Two {

	private static Two instance = null;
	
	private Two() {
		
	}
	
	public static Two getInstance() {
		if(instance == null)
			instance = new Two();
		return instance;
	}
	
}
