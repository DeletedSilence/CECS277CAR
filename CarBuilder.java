/**Builder class*/
public abstract class CarBuilder {
	/**Car object*/
	private Car car;
	
	/**returns car object*/
	public Car getCar(){
		return car;
	}
	/**instantiate car object */
	public void createNewCarProduct(){
		car = new Car();
		
	}
	
	/**
	 *abstract classes to be implemented in other classes 
	 */
	public abstract void buildInterior();
	public abstract void buildExterior();
	public abstract void buildPowertrain();

}
