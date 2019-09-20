public class Lab04
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab 04");

		Car myObj = new Car();

		Car cars[] = {new Car(), new Car()};

		cars[0].setName("Ford");
		cars[0].setMod("Mustang");
		cars[0].setGas(16);
		cars[0].setMile(28);

		cars[1].setName("Nissan");
		cars[1].setMod("Versa");
		cars[1].setGas(12);
		cars[1].setMile(36);

		for(int nmbr = 0; nmbr < cars.length; nmbr++)
		{
			System.out.println("\nCar " + (nmbr + 1) + ":\n");
			System.out.println(cars[nmbr].getName() + " " + cars[nmbr].getMod() + " tank holds " + cars[nmbr].getGas() + " gallons and gets " + cars[nmbr].getMile() + " mpg. \n");
			System.out.printf(cars[nmbr].getName() + " " + cars[nmbr].getMod() );
			myObj.calculations(cars[nmbr].getMile() , cars[nmbr].getGas() );
		}
	}
}
