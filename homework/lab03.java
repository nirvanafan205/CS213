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
			System.out.println("You are " + check + "years old.");

			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You are " + check + "years old.");

			System.out.println("You can't vote");
		}
	}

	public static void main(String args[])
	{
		System.out.println("Student Name: Lab03");

		String firstName = args[0];
		String lastName = args[1];
		int check = Integer.parseInt(args[3]);

		concatName(firstName, lastName);

		checkAge(check);
	}
}
