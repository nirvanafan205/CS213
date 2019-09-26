public class Truck extends Vehicle
{
	private int weight;

	// setter
	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	// getter

	public int getWeight()
	{
		return weight;
	}

	public constructor(String truck_model, String truck_make)
	{
		truck_model = nextLine();

		truck_make = nextLine();
	}

	public void distance(String make, String model, int mileage, int tank)
	{
		System.out.println(make);
		System.out.println(model);
		System.out.println(mileage);
		System.out.println(tank);
	}
}
