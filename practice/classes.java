import java.util.Scanner;

public class classes
{
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
		System.out.println("Hello World");

		Scanner myObj = new Scanner(System.in);

		classes nameObj = new classes();

		int nmbr = myObj.nextInt();

		System.out.println("What is your favorite number? \n");

		System.out.println(asking(nmbr));

		System.out.println("What is your dream car? \n");

		String car = myObj.next();

		System.out.prinlnt(nameObj.car(car));
	}
}
