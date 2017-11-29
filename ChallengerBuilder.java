/**Extends from CarBuilder
 * concrete class*/
public class ChallengerBuilder extends CarBuilder{
	/**
	 * inherited from CarBuilder
	 * sets the seats and navigator attributes of the car object
	 */
	@Override
	public void buildInterior() {
		super.getCar().setSeats("Cloth");
		super.getCar().setNavigator("not included");
	}
	
	/**
	 * inherited from CarBuilder
	 * sets the name and color attributes of the car object
	 */
	@Override
	public void buildExterior() {
		super.getCar().setName("Dodge Challenger R/T");
		super.getCar().setColor("Destroyer Gray");
		
	}
	
	/**
	 * inherited from CarBuilder
	 * sets the engine and transmission attributes of the car object
	 */
	@Override
	public void buildPowertrain() {
		super.getCar().setEngine("V8");
		super.getCar().setTransmission("Manual");
		
	}

}
