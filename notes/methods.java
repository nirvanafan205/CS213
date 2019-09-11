public class methods
{
	// static means the method belongs in the methods class and not an object of the methods class			
	static void a_method()
	{
		// void means the method doesn't return a value

		// a_method is the name of the method


		// code to be executed

		System.out.println("It's called on");
	}


	// Info can be passed to functions as parameters
	// Parameters act as variables inside of the method
	static void names(String names)
	{
		System.out.println(names + " yo ");
	}

	static int numbers(int x)
	{
		return 5 + x;
	}

	public static void main(String[] args)
	{
		System.out.println("Hello World");

		a_method(); // to call the method
		// will print out 'It's called on' since it is called 
		// can call it multiple times
		
		names("Chicken");
		names("Yeller");
		names("hi");

		// methods can also return a value by replaceing void with primitive data types

		System.out.println(numbers(3));
		// will be printing out 5 + 3 i.e.. 8
	}
}
