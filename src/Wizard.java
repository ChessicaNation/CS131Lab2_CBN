
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author chessicanation
 * @version 1.1
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	private boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		
		super();
		this.setName("");
		this.setHealth(100);
		this.setKey(0);
		this.setLocked(false);
	
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		
		super();
		this.setName(name);
		this.setHealth(100);
		this.setKey(0);
		this.setLocked(false);
	
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightning, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		
		if(this.isLocked()==false)
			health = health - power;
		else
			System.out.println("Damage unsuccessful.");
		
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		
		return name;
	
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
	
		this.name = name;
		
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		
		return health;
	
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		
		this.health = health;
		
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		
		return key;
	
	}//end getKey
	
	/**
	 * Setter for locked
	 * @param locked
	 */
	public void setLocked(boolean locked) {
		
		this.locked = locked;
	
	}//end setLocked

	/**
	 * Returns this wizard
	 * as a string
	 * @return
	 */
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	/**
	 * Setter for the key.
	 * Can only be set if key 
	 * is not 0 and if key has not 
	 * previously been set.
	 * @param key
	 */
	@Override
	public void setKey(int key) {

		if(key>0 && this.key==0)
			this.key = key;
		
	}//end setKey

	/**
	 * Allows the wizard to be
	 * locked if the correct key
	 * is entered. Locked wizards 
	 * cannot take damage.
	 * @param key
	 */
	@Override
	public void lock(int key) {

		if(key==this.key)
			locked = true;
		else
			System.out.println("Lock unsuccessful.");
		
	}//end lock
	
	/**
	 * Allows the wizard to be
	 * unlocked if the correct key
	 * is entered. Unlocked wizards 
	 * can take damage.
	 * @param key
	 */
	@Override
	public void unlock(int key) {

		if(key==this.key)
			locked = false;
		else
			System.out.println("Unlock unsuccessful.");
		
	}//end unlock

	/**
	 * Getter for locked. 
	 * Shows the status of
	 * whether the wizard
	 * is locked or unlocked.
	 * @return
	 */
	@Override
	public boolean isLocked() {

		return locked;
	}//end isLocked
	
}//end class
