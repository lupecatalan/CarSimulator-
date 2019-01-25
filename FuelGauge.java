
public class FuelGauge {

	private int gallons;
	private final int MAX_GALLONS = 15;
	
	// Constructor 
	public FuelGauge()
	{
		gallons = 0;
	}
	
	// To know the car's current amount of fuel, in gallons.
	public FuelGauge(int gallons)
	{
		if(gallons <= MAX_GALLONS)
			this.gallons = gallons;
		else 
			gallons = MAX_GALLONS;
		
	}
	
	// Retrieve max gallons
	public int getMaxGallons()
	{
		return MAX_GALLONS;
	}
	
	// To report the car's current amount of fuel, in gallons
	public int getFuel()
	{
		return gallons;
	}
	
	// To be able to increment the amount of fuel by 1 gallon. This simulated putting fuel in the car.
	public void increase()
	{
		gallons++;
	}
	
	// To be able to decrement the amount of fuel by 1 gallon. This simulated burning fuel as the car runs.
	public void decrease()
	{
		gallons--;
	}
}
