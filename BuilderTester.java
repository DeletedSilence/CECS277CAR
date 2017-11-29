import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Jose Ramirez
 * CECS 277
 * 11/28/17 
 *
 */
public class BuilderTester {
	public static void main(String[]args){
		Dealer dealer = new Dealer();
		
		CarBuilder challenger = new ChallengerBuilder();
		CarBuilder camaro = new CamaroBuilder();
		CarBuilder mustang = new MustangBuilder();
		CarBuilder gtr = new GTRBuilder();
		CarBuilder aventador = new AventadorBuilder();
		CarBuilder R8 = new R8Builder();
		
		List<Car> inventory = new ArrayList<Car>();
		
		dealer.setCarBuilder(challenger);
		dealer.constructCar();
		Car ch = dealer.getCar();
		inventory.add(ch);
		
		dealer.setCarBuilder(camaro);
		dealer.constructCar();
		ch = dealer.getCar();
		inventory.add(ch);
		dealer.setCarBuilder(mustang);
		dealer.constructCar();
		ch = dealer.getCar();
		inventory.add(ch);
		
		dealer.setCarBuilder(gtr);
		dealer.constructCar();
		ch = dealer.getCar();
		inventory.add(ch);
		
		dealer.setCarBuilder(aventador);
		dealer.constructCar();
		ch = dealer.getCar();
		inventory.add(ch);
		
		dealer.setCarBuilder(R8);
		dealer.constructCar();
		ch = dealer.getCar();
		inventory.add(ch);
		
		for (Car car:inventory){
			System.out.println(car);
		}
	}

}
