import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Lab10
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab10 \n");
		Scanner nmbrs = new Scanner(System.in);
		Scanner strings = new Scanner(System.in);

		ArrayList<String> schools = new ArrayList();
		HashMap<String, String> department = new HashMap<String, String>();

		System.out.println("Toner:");

		enum colors
		{
			CYAN,
			MAGENTO,
			YELLOW,
			BLACK
		}

		for(String n : colors.values() )
		{
			System.out.println(n.toString() );
		}

		System.out.println("ArrayList");
		System.out.println("How many schools do you want to enter");
		int school_amount = nmbrs.nextInt();

		for(int i = 0; i < school_amount; i++)
		{
			System.out.println("Enter a college name");
			
			String school_name = strings.nextLine();
		}

		System.out.println("Here are your colleges");
		for(int j = 0; j < schools.size(); j++)
		{

			System.out.println(schools.get(j);
		}

		System.out.println("HashMap \n How many departments do you want to enter?");
		int departments_amount = nmbrs.nextInt();

		for(int d = 0; d < departments_amount; d++)
		{
			System.out.println("Enter the department name:");

			String dep_name = strings.nextLine();

			System.out.prinln("Enter the name of the department chair");

			String dep_chair = strings.nextLine();

			department.put(dep_name + " chair is", dep_chair);
		}

		System.out.println("Here are your department chars");
		for(String m : department.value() )
		{
			System.out.println(m + department.value(m) );
		}
	}
}
