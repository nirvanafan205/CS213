public class attributes
{
	int x = 5;
	// x and why are attributes of the class
	// they are variables within a class
	int y = 3;

	public static void main(String[] args)
	{
		// attributes can be accessed by createing an object of the class
		// and by using the dot syntax(.)

		attributes myObj = new attributes();

		System.out.println(myObj.x);
	}
}
