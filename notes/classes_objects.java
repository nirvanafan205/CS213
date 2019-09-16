public class classes_objects
{
	int x = 5;

	public static void main(String[] args)
	{
		System.out.println("Hello WOrld");

		// to creat an object of classes_objects, specify the class name, followed by the object name, and use the keyword 'new'

		classes_objects myObj = new classes_objects(); // this is object 1

		//multiple objects can be made in one class
		classes_objects myObj2 = new classes_objects() // this is object 2

		System.out.println(myObj.x);
		// both will be prinint 5
		System.out.println(myObj2.x);
	}
}

