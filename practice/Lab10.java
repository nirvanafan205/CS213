import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

enum colors
{
	CYAN,
	MAGENTO,
	YELLOW,
	BLACK
}

public class Lab10
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab10 \n");
		Scanner nmbrs = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);

		ArrayList<String> schools = new ArrayList<String>();
		HashMap<String, String> department = new HashMap<String, String>();

		System.out.println("Toner:");

		for(colors n : colors.values() )
		{
			System.out.println(n);
		}

		System.out.println("\nArrayList");
		System.out.println("How many schools do you want to enter?");
		int school_amount = nmbrs.nextInt();

		for(int i = 0; i < school_amount; i++)
		{
			System.out.println("Enter a college name:");

			String school_name = strings.nextLine();

			schools.add(school_name);
		}

		System.out.println("\nHere are your colleges");

		for(int j = 0; j < schools.size(); j++)
		{
			System.out.println(schools.get(j) );
		}

		System.out.println("\nHashMap \nHow many departments do you want to enter?");
		int departments_amount = nmbrs.nextInt();

		for(int d = 0; d < departments_amount; d++)
		{
			System.out.println("Enter the department name:");

			String dep_name = strings.nextLine();

			System.out.println("Enter the name of the department chair");

			String dep_chair = strings.nextLine();

			department.put(dep_name + " chair is", dep_chair);
		}

		System.out.println("\nHere are your department chars");

		Map<String, String> sorted = new TreeMap<String,String>(department);

		for(String m : sorted.keySet() )
		{
			System.out.println(m + sorted.get(m) );
		}
	}
}
