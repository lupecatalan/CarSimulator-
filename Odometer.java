
public class Odometer {
	
	private int miles = 999992;
	private final int MAX_MILES = 999999;
	private final int MPG = 24;
	
	//Constructor
	public Odometer()
	{
		
	}
	
	// To know the car's current mileage
	public Odometer(int miles)
	{
		this.miles = miles;
	}
	// To report the car's current mileage
	public int getMiles()
	{
		return miles;
	}
	
	// To be able to increment the current mileage by 1 mile
	// When the amount is exceeded, the odometer resets
	public void incMileage(FuelGauge fg)
	{
		if(miles < MAX_MILES)
			miles++;
		else
			miles = 0;
		
		if(miles % MPG == 0)
			fg.decrease(); 
	}
}
