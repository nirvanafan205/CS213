import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab09
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia : Lab 9 \n");

		System.out.println("How many students do you want to enter?");

		Scanner myObj = new Scanner(System.in);

		int students_nmbr = myObj.nextInt();

		System.out.println("How many scores do you want to enter for each student?");

		int scores_amount = myObj.nextInt();

		HashMap<String, Integer> information = new HashMap<String, Integer>();

		for(int i = 0; i < students_nmbr; i++)
		{
			System.out.println("Enter student number " + (i + 1) + " name:");

			Scanner names = new Scanner(System.in);

			String name = names.nextLine();

			for(int j = 0; j < scores_amount; j++)
			{
				System.out.println("Enter score " + (j + 1) + " for " + name);

				int number = myObj.nextInt();

				information.put(name + " score " + (j + 1) + ",",number);
			}
		}

		Map<String, Integer> sorted = new TreeMap<String, Integer>(information);

		for(String z : sorted.keySet() )
		{
			System.out.println("key: " + z + " value: " + sorted.get(z) );
		}
	}
}
