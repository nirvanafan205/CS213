import java.util.Scanner;

public class classes
{
	int x = 2019

	static int asking (int number)
	{
		return number;
	}

	public void car(String name)
	{
		return name;
	}

	static int year(int x)
	{
		return x;
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

		System.out.prinlnt(nameObj.car(car));

		System.out.println(year.x);
	}
}
