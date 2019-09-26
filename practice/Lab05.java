import java.util.Scanner;

public class Lab05
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);

		Car caller = new Car(String car_name, String car_model);

		Truck other_caller = new Truck(String truck_model, String truck_make);


		System.out.println("Enter car make");

		String car_name = nextLine();

		System.out.println("Enter car model");

		String car_model = nextLine();

		System.out.println("Enter truck make");

		String truck_make = nextLine();

		System.out.println("Enter truck model");

		String truck_model = nextLine();

		System.out.println("How many gallons does the " + model + " gas tank hold?");

		int car_tank = nextInt();

		System.out.println("What is the " + model + " mpg?");

		int car_mpg = nextInt();

		System.out.println("What kind of top does the " + model + " have?");

		String car_top = nextLine();

		System.out.println("How many doors does the " + model + " have?");

		int truck_door = nextInt();

		System.out.println("How many gallons does the does the " + model + " gas tank hold?");

		int truck_tank = nextInt();

		System.out.println("What is the " + model + " mpg?");

		int truck_mpg = nextInt();

		System.out.println("What tonage can the " + model + " carry?");

		int truck_weight = nextInt();


	}
}
