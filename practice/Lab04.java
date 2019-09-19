public class Lab04
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab04");

		Car myObj = new Car();
		
		Car[] cars = { new Car(), new Car() };

		cars[0].setBrand_name("Ford");
		cars[0].setCar_type("Mustang");
		cars[0].setCar_mileage(16);
		cars[0].setCar_gas(28);
		
		cars[1].setBrand_name("Nissan");
		cars[1].setCar_type("Versa");
		cars[1].setCar_mileage(16);
		cars[1].setCar_gas(28);
		
		
	}
}
