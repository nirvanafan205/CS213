public class Car extends Vehicle
{
	private String type;
	private int doors;

	//type setter
	public void setType (String type)
	{
		this.type = type;
	}

	// type getter
	public String getType()
	{
		return type;
	}

	// doors setter
	public void setDoor (int doors)
	{
		this.doors = doors;
	}

	// doors getter
	public int getDoor ()
	{
		return doors;
	}

	public _constructors()
	{
		make = nextLine()
		model = nextLine();
	}

	public void distance(String make, String model, int mileage, int tank)
	{
		System.out.println(make);

		System.out.println(model);

		System.out.println(mileage);

		System.out.println(tank);
	}
}
