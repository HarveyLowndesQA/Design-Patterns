
public class One {

	private static int count = 0;
	
	private One() {
		
	}
	
	public static One createObj() {
		try {
			if(count <= 2) {
				count++;
				return new One();
			} else {
				throw new Exception("To many One instances.");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
