/*Name: Austin Gilmore
 *Email: acgilmor@asu.edu
 *ID: 1216396051
 *Course: CSE 360 Tu 9-10:15am
 */
package cse360assignment02;

public class Driver {
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		myCalculator.clear();
		System.out.println(myCalculator.toString());
	}

}
