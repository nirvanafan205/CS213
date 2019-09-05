public class tryncatch
{
	public static void main(String[] args()
	{
		System.out.println("Hello World");

		// Java has something called try and catch code block
		
		// try statement allows you to define a block of code to be tested for errors while it is being executed

		// catch statements allows you to define a block of code to be executed, if an error occurs in the try block.

		
		try
		{
			//block of code to try
		}
		catch(Exception e)
		{
			//block of code to handle error
		}

		//exampe error

		int[] nmbrs = {1, 2, 3};

		System.out.println(nmbrs[10]);

		// error messsage will pop up saying that there is no element 10
		
		// try and catch will help execute some code to handle it than getting the compiler error

		try
		{
			// try will test out the code

			int[] nmbrs = {1, 2, 3};

			System.out.println(nmbrs[10]);
		}
		catch (Exception e)
		{
			// if an error has been made, Something went wrong. will be printed out
			System.out.println("Something went wrong.");
		}
		finally 
		{
			// finally is a statement that lets you execute code, after try catch, regardless of the result
			System.out.println("The 'try catch' is finished.");
		}

		// thro statements could also be used to allow a person to create a custom error message
		// The throw statements is used together with an exception type. The tapes are
		// ArithmeticException
		// ClassNotFoundException
		// ArrayIndexOutOfBoundsException
		// SecurityException

		// Bellow will throw an acception if age is below 18 (Prints "Access denied") If age is 18 or older, prints "Access granted"
		
		/*
		 public class example
		 {

		 static void checkAge(int age)

		 {

		 if (age < 18)
		 {
		 throw new ArithmeticException("Access denied - You must be at least 18 ears old.");
		 }

		 else
		 {
		 System.out.println("Access granted - You are old enough!");
		 }

		 }

		 public static void main(String[] args)
		 {
		 checkAge(15); // set age to 15 ( which is below 18)
		 }

		 }
		 */
	}
}
