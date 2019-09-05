public class arrays 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");

		// To declare an array, define the variable type with square brackets:

		String[] cars;

		// Now that the array is declared, it needs to be given a value. use curly braces and appropiate seperation tools

		// Since the variable type is a string, it is needed to put qutation marks for each name that will be placed into the array

		String[] cars = {"Volkeswagon", "Tesla", "BMW"};

		//since it is an int, it is only needed to be seperated by a comma

		int[] nmbrs = {1, 2, 3, 4};

		// for each of the variables, what's made inside of the brackets are given an element. It always starts with element numbe 0 for the first.

		String[] example = {"Element 0", "Element 1", "Element 2", "Element three"};

		// in total, the above has 4 elements
		// to call upon a certain element of the varialbe, one mus call that element number to display what they want

		System.out.println(example[2]);
		// Outputs Element 2

		// To change an element, do so before calling it

		String[] yo = {"this", "is", "to", "change"};

		yo[1] = "this changes is to this";

		System.out.println(yo[1]);

		// It out puts this changes is to this

		// to figure out how many elements an array has, use the length property

		System.out.println(yo.length);

		// this prints out 4

		// Multidimensional Arrays is an array containing one or more arrays
		// To create a two-dimensional array, add each array within its own set of curly braces

		int[][] nmbrs = { /* first set */ {1, 2, 3, 4}, {5, 6, 7} };

		// nmbrs is now an array with two arrays as its elements
		// To access the elements, specify two indexes: one for the array, and one for the element
		int x = nmbrs[1][2];

		System.out.println(x); // prints out second array set, elements 2 which is 7 as the output
	}
}
