class truck extends Vehicle
{
	private int weight;

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public int getWeight()
	{
		return weight;
	}

	public truck(String truck_make, String truck_model)
	{
		make = truck_make;

		model = truck_model;
	}

	public void truck_distance()
	{
		System.out.println(make + " " + model + " holds " + tank + " gallons and gets " + mileage + " mpg, " + "and can carry " +  weight + " tons.");

		int tonage_calc = (tank * mileage) / 2;

		System.out.println(make + " " + model + " can travel " + tonage_calc + " miles on a tank of gas when fully loaded with cargo.");
	}
}
