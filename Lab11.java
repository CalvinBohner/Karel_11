/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.Digit;
import edu.fcps.karel2.Display; 

public class Lab11 {
	 
	 public static void main(String[] args) {
		
		 
		 
         Display.setSize(42, 37);
         Display.setSpeed(10);
		 
		 
		 
		 Digit day1 = new Two(1,35);
		 Digit day2 = new Zero(8, 35);
		 Digit month1 = new Zero(1, 25);
		 Digit month2 = new Four(8, 25);
		 Digit year1 = new One(1, 15);
		 Digit year2 = new Nine( 8, 15);
		 Digit year3 = new Nine( 15, 15);
		 Digit year4 = new Nine( 22, 15);
		 
		 day1.display();
		 day2.display();
		 month1.display();
		 month2.display();
		 year1.display();
		 year2.display();
		 year3.display();
		 year4.display();
		 
	 }
	 
 }
