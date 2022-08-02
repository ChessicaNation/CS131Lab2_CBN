/**
 * This interface allows a 
 * character to be locked 
 * and unlocked.
 * @author chessicanation
 * @version 1.0
 * Lab 2
 * CS131ON
 */
public interface Lockable {

	/**
	 * Allows a key to be
	 * set in order to lock/unlock 
	 * the character. 
	 * @param key
	 */
	public void setKey(int key);
	
	/**
	 * Allows a character to be 
	 * locked so it cannot take damage.
	 * @param key
	 */
	public void lock(int key);
	
	/**
	 * Allows a character to be
	 * unlocked so it can take damage.
	 * @param key
	 */
	public void unlock(int key);
	
	/**
	 * Allows the user to
	 * determine if the character is 
	 * locked or unlocked.
	 * @return
	 */
	public boolean isLocked();
	
}//end interface
