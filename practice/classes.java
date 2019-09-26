import java.util.Scanner;

public class classes
{
	int x = 5;
	int y;
	int z;

	static int asking (int number)
	{
		return number;
	}

	public String car(String name)
	{
		return name;
	}

	public static void main(String[] args)
	{
		System.out.println("Hello World \n");

		Scanner myObj = new Scanner(System.in);

		classes nameObj = new classes();

		System.out.println("What is your favorite number?");

		int nmbr = myObj.nextInt();

		nameObj.y = nmbr;

		System.out.println(asking(nmbr));

		System.out.println("\n" + "What is your dream car?");

		String car = myObj.next();

		System.out.println(nameObj.car(car) + "\n");

		System.out.println("Enter a number m8");
		
		nameObj.z = nmbr + 10;

		System.out.println("Your favorite number has been added);
	}
}
