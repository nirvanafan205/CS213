public class lab03
{
	// something wrong with methods
	// not being used
	// add space to return it together with a space inbetween
	static String concatName(String firstName, String lastName)
	{
		return firstName + " " + lastName;
	}

	static int checkAge(int age)
	{
		return age;
	}

	public static void main(String[] args)
	{
		//changed Student Name: to Matthew Garcia

		System.out.println("Matthew Garcia: Lab 03");
		System.out.println();

		String firstName = "";
		String lastName = "";
		int age = 0;

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
			age = Integer.parseInt(args[2]);
		}
		catch (Exception e)
		{
			System.out.println("Please submit your age when you run this program.");
			System.exit(0);
		}

		concatName(firstName, lastName);

		checkAge(age);

		System.out.println("Hello " + firstName + " " + lastName);
		System.out.println("You are " + age + " years old.");
		
		if(age >= 18)
		{
			System.out.println("You can vote.");
		}
		else
		{
			System.out.println("You cannot vote.");
		}
	}
}
