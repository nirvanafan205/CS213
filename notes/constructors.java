public class constructors
{
	// A constructor is a special method that is used to initialize objects
	// The constructor is called when an object of a class is created
	// It can be used to set initial values for object attributes

	int x; // attribute is created
	// constructors must match the class name
	// cannot have a return type

	public constructors()
	{
		x = 666; // initial value is created for the class attribute x
	}

	public static void main(String[] args)
	{
		constructors myObj = new constructors();

		System.out.println(myObj.x); // prints x value
	}
}
