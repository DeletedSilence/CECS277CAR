/**Car Class*/
public class Car {
	/*String name();
	Interior interior();
	Exterior exterior();
	Powertrain powertrain();*/
	/**
	 * private attributes
	 */
	private String name;
	private String color;
	private String engine;
	private String transmission;
	private String seats;
	private String navigator;
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getNavigator() {
		return navigator;
	}
	public void setNavigator(String navigator) {
		this.navigator = navigator;
	}
	
	/**
	 * prints all attributes of the Car class 
	 */
	@Override
	public String toString() {
		return "Name: " + name + "\ncolor: " + color + "\nengine: " + engine + "\ntransmission: " + transmission
				+ "\nseats: " + seats + "\nnavigator: " + navigator + "\n";
	}
	
	
	
	

}
