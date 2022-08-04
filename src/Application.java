/**
 * Driver to test all of the
 * methods from the Wizard class
 * and the Lockable interface 
 * that can be used on a 
 * wizard for a D&D type game.
 * @author chessicanation
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Application {

	public static void main(String[] args) {

		//creating wizard with empty argument constructor
		Wizard merlin = new Wizard();
		
		//testing toString
		System.out.println(merlin.toString());
		
		//testing setters and getters
		merlin.setName("Merlin");
		System.out.println("Name: " + merlin.getName());
		merlin.setHealth(99);
		System.out.println("Health: " + merlin.getHealth());
		//showing that key cannot be negative
		merlin.setKey(-2);
		System.out.println("Key (Negative Attempt): " + merlin.getKey());
		merlin.setKey(2);
		System.out.println("Key: " + merlin.getKey());
		
		//testing locking and unlocking methods
		merlin.lock(2);
		System.out.println("Locked: " + merlin.isLocked());
		merlin.unlock(2);
		System.out.println("Locked: " + merlin.isLocked());

		//testing takeDamage with merlin unlocked
		merlin.takeDamage(20);
		System.out.println("Health (After Attack): " + merlin.getHealth());
		
		//separator println
		System.out.println();
		
		//testing preferred constructor
		Wizard gandalf = new Wizard("Gandalf");
		
		//testing toString
		System.out.println(gandalf.toString());
		
		//testing setters and getters
		System.out.println("Name: " + gandalf.getName());
		gandalf.setHealth(99);
		System.out.println("Health: " + gandalf.getHealth());
		gandalf.setKey(6);
		System.out.println("Key: " + gandalf.getKey());
		//showing that key can't be set again once already set
		gandalf.setKey(4);
		System.out.println("Key (Reset Attempt): " + gandalf.getKey());
		
		//testing locking and unlocking methods
		gandalf.lock(3);
		System.out.println("Locked (Incorrect Key Lock Attempt): " + gandalf.isLocked());
		gandalf.lock(6);
		System.out.println("Locked (Correct Key Lock Attempt): " + gandalf.isLocked());
		gandalf.unlock(3);
		System.out.println("Locked (Incorrect Key Unlock Attempt): " + gandalf.isLocked());
		
		//testing takeDamage with gandalf locked
		gandalf.takeDamage(65);
		System.out.println("Health (After Attack): " + gandalf.getHealth());
		
	}//end main

}//end class
