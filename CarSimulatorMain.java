
public class CarSimulatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Odometer odo = new Odometer();
		FuelGauge fuel = new FuelGauge();
		
		// Simulate filling the car up with fuel
		for(int i = 0; i < fuel.getMaxGallons(); i++)
		{
			fuel.increase();
		}
			
		// Run a loop that increments the odometer until the car runs out of fuel
		// Print the car's current mileage and amount of fuel 
		while (fuel.getFuel() > 0)
		{
			odo.incMileage(fuel);
			
			System.out.println("Current Miles: " + odo.getMiles());
			System.out.println("Current amount of fuel: " + fuel.getFuel());		
			
		}
	}
}
