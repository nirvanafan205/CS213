abstract class Car
{
	protected String make;
	protected String model;

	protected int mileage;
	protected int tank;

	// setter 1
	public void setName(String make)
	{
		this.make = make;
	}

	// getter 1
	public String getName()
	{
		return make;
	}

	// setter 2

	public void setMod(String model)
	{
		this.model = model;
	}

	// getter 2
	public String getMod()
	{
		return model;
	}

	// setter 3
	public void setMile(int mileage)
	{
		this.mileage = mileage;
	}

	// getter 3
	public int getMile()
	{
		return mileage;
	}

	// setter 4
	public void setGas(int tank)
	{
		this.tank = tank;
	}

	// getter 4 
	public int getGas()
	{
		return tank;
	}

	public void calculations(int mileage, int tank)
	{
		int calc = mileage * tank;

		System.out.println(" can travel " + calc + " miles on a tank of gas.");
	}
}
