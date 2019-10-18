to create an array list

import java.util.ArrayList; // importing the arrayList class

import java.util.Collections; // will sort your ArrayList

ArrayList<String> cars = new ArrayList<String>(); // creat an array list

^^ as the aray list name is cars, we can use .add(); to add the values

ex)

cars.add("Volvo");
cars.add("BMW");
cars.add("ford");
cars.add("Mazda");

System.out.println(cars);

will output----

[Volvo, Bmw, Ford, Mazda]

to access an element of an arraylist use get()

	cars.get(0); // will get Volvo index 0


	import java.util.ArrayList;
	import java.util.Collections;

	public class Work08
{
	public static void main(String[] args)
	{
		ArrayList<String> cars new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("ford");
		cars.add("Mazda");

		System.out.println(cars.get(0)); //will print Volvo, index 0 if I put 8 will give an index out of bounds since no 8th placement


		// to change an index 
	
		cars.set(0, "Opel"); // put index number comma then new value this changes Volvo to Opel

		//to remove a value and index
		
		car.removve(0); 

		System.out.println(cars); // this removes Volvo or index zero and prints [BMW, Ford, Mazda]

		//to remove everything in the array
		
		cars.clear(); // will delete everything and output []

		// to set size for the arrayList

		Collections.sort(cars); // will organize the cars alphabetically can work for numbers too, it'll be least to greatest


	// to loop through it  with for-each loops
		
		for(String i : cars) // to make a loop use the type make a private varialbe name then the method its calling from
		{
			System.out.println(i); 
		}

		Collections.reverse(cars); // will reverse it

		System.out.printlncars(); // will go into revorse order Volvo Mazda Ford BMW

		for(String car: cars)
		{
			System.out.println(car);
		}

	}
}
