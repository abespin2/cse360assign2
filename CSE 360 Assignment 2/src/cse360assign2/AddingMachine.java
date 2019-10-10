/* Alejandro Espinosa
 * 1213082752
 * CSE360
 * Assignment 2
 * AddingMachine.Java is a simple program that manipulates the value of a variable
 * Using various methods. Also used to learn github and repositories.
 */

package cse360assign2;

public class AddingMachine 
{
	private int total;
	private String transactionHistory;
	
	public AddingMachine () 
	{
		//Start with values of 0
		total = 0;  // not needed - included for clarity
		transactionHistory = "0";
	}
	
	/**
	 * The getTotal method returns the current total  
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 *  The add method adds the parameter to the total variable
	 */
	public void add (int value) 
	{
		total = total + value;
		transactionHistory += " + " + value;
	}
	
	/**
	 * 
	 * The subtract method subtracts the parameter from the total variable
	 */
	public void subtract (int value) 
	{
		total = total - value;
		transactionHistory += " - " + value;
		
	}
	
	/**
	 * A history of the transactions must be kept to be returned by the 
	 * toString method.  The history should start from the initial 0 value to the last input. 
	 */
	public String toString () 
	{
		return transactionHistory;
	}

	/**
	 * Method to reset the values of total and the transactionHistory. 
	 */
	public void clear() 
	{
		total = 0;
		transactionHistory = "";
	}
}
