import java.util.HashMap; // to be able to use hashmaps, must import it
// hashmaps are stores items in 'key/value' pairs. can be accessed by amother index type
// can have string/integer types and values
// I.e String "string value" 
// int 0100110
class hasmaps
{
	public static void main(String[] args)
	{
		//Created a HashMap object called Millermac

		HashMap<String, String> Millermac = HashMap<String, String>();
		// Adding keys and Values (album, song)

		Millermac.put("GO:OD AM", "Perfect Circle / God SPeed");
		Millermac.put("Swimming", "Self Care");
		Millermac.put("Blue Side Park", "Missed Calls");
		Millermac.put("Macadelic", "Clarity");

		System.out.println(Millermac);
	}
}
