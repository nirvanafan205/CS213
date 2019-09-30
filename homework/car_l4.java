class Car extends Vehicle
{
	private String top_type;

	private int car_doors;

	// setter top
	
	public void setTop(String top_type)
	{
		this.top_type = top_type;
	}

	public String getName()
	{
		return top_type;
	}

	public void setCar_d(int car_doors)
	{
		this.car_doors = car_doors;
	}

	public int setCar_d()
	{
		return car_doors;
	}

	public Car(String car_make, String car_model)
	{
		make = car_make;
		model = car_model;
	}

	public void car_distance()
	{
		System.out.println(make + " " + model + " with " + car_doors + " doors and " + top_type + " top holds " + tank + " gallons and gets " + mileage + " mpg.");
		System.out.printf(make + " " + model + " " + car_doors + "-door");
	}
}
