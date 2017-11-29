/**Director*/
public class Dealer {
	/**CarBuilder attribute*/
	private CarBuilder carbuilder;
	
	/**setter for CarBuilder attribute*/
	public void setCarBuilder(CarBuilder cb){
		carbuilder = cb;
	}
	
	/**returns Car object from CarBuilder*/
	public Car getCar(){
		return carbuilder.getCar();
	}
	
	/**creates a Car Object*/
	public void constructCar(){
		carbuilder.createNewCarProduct();
		carbuilder.buildExterior();
		carbuilder.buildInterior();
		carbuilder.buildPowertrain();
	}

}
