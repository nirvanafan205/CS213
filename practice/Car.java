public class Car
{
	private String car_brand;
	private String car_model;
	private String car_gas;
	private String car_gasTank;

	// getter 1
	public String getCar_brand()
	{
		return car_brand;
	}

	// setter
	public void setBrand_name(String naming)
	{
		this.car_brand = naming;
	}

	// getter 2
	public String getCar_model()
	{
		return car_model;
	}

	// setter
	public void setCar_type(String model)
	{
		this.car_model = model;
	}

	// getter 3
	public String getCar_gas()
	{
		return car_gas;
	}

	// setter
	public void setCar_milage(String mileage)
	{
		this.car_gas = mileage;
	}

	// getter 4
	public String getCar_gasTank()
	{
		return car_gasTank;
	}

	// setter
	public void setCar_gas(String tank)
	{
		this.car_brand = tank;
	}

}
