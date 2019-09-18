import java.util.Scanner;

public class classes
{
	int x = 5;
	int y;
	int z = x + y;

	static int asking (int number)
	{
		return number;
	}

	public void car(String name)
	{
		return name;
	}

	public static void main(String[] args)
	{
		System.out.println("Hello World \n");

		Scanner myObj = new Scanner(System.in);

		classes nameObj = new classes();

		int nmbr = myObj.nextInt();

		System.out.println("What is your favorite number?");

		System.out.println(asking(nmbr));

		System.out.println("What is your dream car?");

		String car = myObj.next();

		System.out.println(nameObj.car(car));

		System.out.println("Enter a number m8");

		y = nextInt();

		System.out.println(myObj.z);

	}
}
