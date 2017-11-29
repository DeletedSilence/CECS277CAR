/**Extends from CarBuilder
 * concrete class*/
public class R8Builder extends CarBuilder{
	/**
	 * inherited from CarBuilder
	 * sets the seats and navigator attributes of the car object
	 */
	@Override
	public void buildInterior() {
		super.getCar().setSeats("Leather");
		super.getCar().setNavigator("included");
	}
	/**
	 * inherited from CarBuilder
	 * sets the name and color attributes of the car object
	 */
	@Override
	public void buildExterior() {
		super.getCar().setName("Audi R8");
		super.getCar().setColor("White");
		
	}
	
	/**
	 * inherited from CarBuilder
	 * sets the engine and transmission attributes of the car object
	 */
	@Override
	public void buildPowertrain() {
		super.getCar().setEngine("V10");
		super.getCar().setTransmission("Manual");
		
	}


}
