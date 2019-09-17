public class class_methods
{
	// Java will either have static or public attributes and methods
	//  Static methods can be accessed without creating an object of the class

	//  public can only be accessed by objects

	static void staticMethod() // public method
	{
		System.out.println("This can be called without creating an object");
	}

	public void publicMethod() // public method
	{
		System.out.println("Needs an object to be created to be called on");
	}
	public static void main(String[] args)
	{
		staticMethod(); // called without an object

		classes_methods myObj = new classes_methods(); // object created in classes_methods

		myObj.publicMethod(); // call the public method on the object
		//if just called without and object like
		//publicMethod();
		//it would compile an error
	}
}

