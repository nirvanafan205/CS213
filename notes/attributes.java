public class attributes
{
	int x = 5;
	// x and why are attributes of the class
	// they are variables within a class
	int y;

	//if you don't want the ability to override existing values
	//declare the attribute as final
	
	// final x = 10;
	// will generate an error: cannot assign a value to a final variable

	public static void main(String[] args)
	{
		// attributes can be accessed by createing an object of the class
		// and by using the dot syntax(.)

		attributes myObj = new attributes();

		System.out.println(myObj.x);

		// they can also be motified

		myObj.y = 40;

		System.out.println(myObj.y);

		// attributes can also override existing value

		myObj.x = 30;

		System.out.println(myObj.x); // was 3, now is 30
	}
}
