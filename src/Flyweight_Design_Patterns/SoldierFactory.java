package Flyweight_Design_Patterns;

/**
 * Flyweight Factory
 */
public class SoldierFactory {

	/**
	 * Pool for one soldier only 
	 * if there are more soldier types 
	 * this can be an array or list or better a HashMap
	 * 
	 */
	private static SoldierFlyweight SOLDIER;
	
	/**
	 * getFlyweight
	 * @return
	 */
	public static SoldierFlyweight getSoldier(){

		// this is a singleton 
		// if there is no soldier 
		if(SOLDIER==null){
			
			// create the soldier 
			SOLDIER = new SoldierFlyweightImp();
		}
		
		// return the only soldier reference
		return SOLDIER;
	}
}