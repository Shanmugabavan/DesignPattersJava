package Flyweight_Design_Patterns;

/**
 * This is the "Heavyweight" soldier object 
 * which is the client of the flyweight soldier
 *  this object provides all soldier services and is used in the game 
 */
public class SoldierClient {

	/**
	 * Reference to the flyweight
	 */
	private SoldierFlyweight soldier = SoldierFactory.getSoldier();
	
	/**
	 * this state is maintained by the client 
	 */
	private int currentLocationX = 0;
	
	/**
	 * this state is maintained by the client 
	 */
	private int currentLocationY=0;
	
	
	public void moveSoldier(int newLocationX, int newLocationY){

		// here the actual rendering is handled by the flyweight object 
		soldier.moveSoldier(currentLocationX, 
			currentLocationY, newLocationX, newLocationY);
		
		// this object is responsible for maintaining the state
		// that is extrinsic to the flyweight
		currentLocationX = newLocationX;
		
		currentLocationY = newLocationY;

		System.out.println("Im in X:"+currentLocationX+" Y:"+currentLocationY);
	}
}