import java.util.Scanner;

class Lab05
{
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		Scanner otherScan = new Scanner(System.in);

		System.out.println("Matthew Garcia: Lab 05 \n");

		System.out.println("Enter car make");
		String make = myScan.nextLine();

		System.out.println("Enter car model");
		String model = myScan.nextLine();

		Car something = new Car(make, model);
		something.setName(make);
		something.setMod(model);

		System.out.println("Enter truck make");
		String make_truck = myScan.nextLine();

		System.out.println("Enter truck model");
		String model_truck = myScan.nextLine();

		truck other = new truck(make, model);
		other.setName(make_truck);
		other.setMod(model_truck);

		System.out.println("\nHow many gallons does the " + model + " gas tank hold?");
		int car_tank = myScan.nextInt();
		something.setGas(car_tank);

		System.out.println("What is the " + model + " mpg?");
		int car_mpg = myScan.nextInt();
		something.setMile(car_mpg);

		System.out.println("What kind of top does the " + model + " have?");
		String car_top = otherScan.nextLine();
		something.setTop(car_top);

		System.out.println("How many doors does the " + model + " have?");
		int car_doors = otherScan.nextInt();
		something.setCar_d(car_doors);

		System.out.println("How many gallons does the " + model_truck + " gas tank hold?");
		int truck_tank = otherScan.nextInt();
		other.setGas(truck_tank);

		System.out.println("What is the " + model_truck + " mpg?");
		int truck_mpg = otherScan.nextInt();
		other.setMile(truck_mpg);

		System.out.println("What tonage can the Ram carry?");
		int weight = otherScan.nextInt();
		other.setWeight(weight);

		System.out.println("\n");

		something.car_distance();	

		something.calculations(car_mpg,car_tank);

		other.truck_distance();

	}
}
