package Helper;

public class CommonMethods {

	/**
	 * This method returns
	 * a random number
	 * between in the given range
	 * @param min
	 * @param max
	 * @return
	 */
	public int returnRandomNumber(int min, int max) {
		
		int b = (int)(Math.random()*(max-min+1)+min);  
		return b;
	}
}
