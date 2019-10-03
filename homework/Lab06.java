import java.util.Scanner;

public class Lab06
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab06 \n");

		Scanner myObj = new Scanner(System.in);

		Student id[] = {new Student(), new Student()  };
		id[0].setID(123);
		id[1].setID(234);
		
		for(int i = 0; i < id.length; i++)
		{
			System.out.println("Enter Student " + id[i].getID() + " first name:");
			String fname = myObj.nextLine();
			id[i].setFirst(fname);
			
			System.out.println("Enter Student " + id[i].getID() + " last name:");
			String lname = myObj.nextLine();
			id[i].setLast(lname);

			System.out.println("Enter Student " + id[i].getID() + " year:");
			String school_year = myObj.nextLine();
			id[i].setYear(school_year);

			System.out.println("Enter Student " + id[i].getID() + " major:");
			String major = myObj.nextLine();
			id[i].setMajor(major);
			
				System.out.println("\n");
		}

			for(int i = 0; i < id.length; i++)
			{
				id[i].display();
			}

	}
}
