/*Name: Austin Gilmore
 *Email: acgilmor@asu.edu
 *ID: 1216396051
 *Course: CSE 360 Tu 9-10:15am
 */
package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  //Constructor for AddingMachine. Initializes instance variables
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  //Accessor method. Returns total
  public int getTotal () {
    return total;
  }
  
  //Adds parameter to total. Adds operation to history String
  public void add (int value) {
	  total += value;
	  history += " + " + value;
  }

  //Subtracts parameter from total. Adds operation to history String
  public void subtract (int value) {
	  total -= value;
	  history += " - " + value;
  }

  //Returns history String
  public String toString () {
    return history;
  }

  //Resets history String to 0
  public void clear() {
	  history = "0";
  }
}
