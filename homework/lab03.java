public class lab03
{

	static void concatName(String firstName, String lastName)
	{
		return firstName + " " + lastName;
	}

	static void checkAge(int check)
	{
		if(check >= 18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You can't vote");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Student Name: Lab03");

		concatName();

		checkAge();
	}
}

