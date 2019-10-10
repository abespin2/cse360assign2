package cse360assign2;

public class AddingMachine {

	private int total;
	
	/**
	 * This method will add a value to the variable and then return 
	 * 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * The subtract method should subtract the parameter from the total variable
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The getTotal method should return the current total 
	 */
	public void add (int value) {
		
	}
	
	/**
	 * A history of the transactions must be kept to be returned by the toString method. 
	 * The history should start from the initial 0 value to the last input. 
	 */
	public void subtract (int value) {
		
	}
		
	public String toString () {
		return "";
	}

	public void clear() {
	
	}
}
