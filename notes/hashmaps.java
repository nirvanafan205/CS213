import java.util.HashMap; // to be able to use hashmaps, must import it
// hashmaps are stores items in 'key/value' pairs. can be accessed by amother index type
// can have string/integer types and values
// I.e String "string value" 
// int 0100110

import java.util.TreeMap;
import java.util.Map;

public class hasmaps
{
	public static void main(String[] args)
	{
		//Created a HashMap object called Millermac
		HashMap<String, String> Millermac = new HashMap<String, String>();
		// Adding keys and Values (album name, song)

		Millermac.put("GO:OD AM", "Perfect Circle / God Speed");
		Millermac.put("Swimming", "Self Care");
		Millermac.put("Blue Side Park", "Missed Calls");
		Millermac.put("Macadelic", "Clarity");

		System.out.println(Millermac + "\n");
		// will print {GO:OD AM=Perfect Circle / God SPeed, Macadelic=Clarity, Blue Side Park=Missed Calls, Swimming=Self Care}

		// to access a value of hashmap
		// use .get(); 
		// key_name.get(value);

		System.out.println(Millermac.get("GO:OD AM") + "\n" );
		// will print out "Perfect Circle / God Speed"

		// to remove all items, use .clear();
		// key_name.clear();
		Millermac.clear();

		System.out.println(Millermac + "\n"); // will only print {}

		// to see how many items are in the HashMap
		// .size()
		// key_name.size();
		System.out.println(Millermac.size() + "\n"); // will print 0

		Millermac.put("GO:OD AM", "Perfect Circle / God Speed");
		Millermac.put("Swimming", "Self Care");
		Millermac.put("Blue Side Park", "Missed Calls");
		Millermac.put("Macadelic", "Clarity");

		// looping through has maps have two options, one for keys and values

		// .keySet()
		for(String i : Millermac.keySet() ) // ask what order will it be printing
		{
			System.out.println(i); 
			// Will print
			// "GO:OD AM"
			// "Swimming"
			// Blue Side Park"
			// Macadelic"
		}

		System.out.println("\n");

		// .values()
		for(String z : Millermac.values() )  // ask what order will it be printing
		{
			System.out.println(z);
			// Will print 
			// "Perfect Circle / God Speed"
			// "Self Care"
			// "Missed Calls"
			// "Clarity"
		}

		System.out.println("\n");

		//to print both keys and values
		for(String b : Millermac.keySet() )
		{
			System.out.println("key: " + b + " value: " + Millermac.get(b) );
		}

		System.out.println("\n");

		// Hashmaps can also have a key being one type and the value being another type
		HashMap<String, Integer> albums = new HashMap<String, Integer>();

		// adding the album and the year it came out in
		albums.put("The Slim Shady LP", 1999);
		albums.put("The Eminem Show", 2002);
		albums.put("Relapes", 2009);
		albums.put("Recovery", 2010);
		albums.put("Encore", 2004);

		//looping through each with the key name first then the year it came out in
		for(String z : albums.keySet() )
		{
			System.out.println("key: " + z + " values: " + albums.get(z) );
		}

		// will order it by key
		Map<String, String> sorted = new TreeMap<String, String>(Millermac);

		// Will be ordered by the key in alphabetical order
		for(String z : sorted.keySet())
		{
			System.out.println("key: " + z + "value: " + sorted.get(z) );
		}

	}
}
