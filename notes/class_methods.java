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

	public void favColor()
	{
		System.out.println("My favorite color is blue m8! What is yours?");
	}
	public void yourColor(String color)
	{
		System.out.println("Your favorite color is " + color);
	}

	public static void main(String[] args)
	{
		staticMethod(); // called without an object

		class_methods myObj = new class_methods(); // object created in classes_methods

		myObj.publicMethod(); // call the public method on the object
		//if just called without and object like
		//publicMethod();
		//it would compile an error
		
		myObj.favColor();

		myObj.yourColor("Green");
	}
}

