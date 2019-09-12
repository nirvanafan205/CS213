public class lab03
{

	static void concatName(String firstName, String lastName)
	{
		System.out.println("Hello " + firstName + " " + lastName);
	}

	static void checkAge(int check)
	{
		if(check >= 18)
		{
			System.out.println("You are " + check + " years old.");

			System.out.println("You can vote.");
		}
		else
		{
			System.out.println("You are " + check + " years old.");

			System.out.println("You can't vote.");
		}
	}

	public static void main(String args[])
	{
		System.out.println("Student Name: Lab 03");
		System.out.println();

		String firstName = "";
		String lastName = "";
		int check = 0;

		try
		{
			firstName = args[0];
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please submit first name, last name, and age when you run this program.");	
			System.exit(0);
		}

		try
		{
			lastName = args[1];
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please submit last name and age when you run this program");
			System.exit(0);
		}

		try
		{
			check = Integer.parseInt(args[2]);
		}
		catch (Exception e)
		{
			System.out.println("Please submit your age when you run this program.");
			System.exit(0);
		}

		concatName(firstName, lastName);

		checkAge(check);
	}
}
