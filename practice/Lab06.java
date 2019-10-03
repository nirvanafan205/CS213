import java.util.Scanner;

public class Lab06
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab06");

		Scanner myObj = new Scanner(System.in);

		Student id = {new Student(123), new Student(234)  };

		Student calling = new Student();

		for(int i = 0; i < id.length; i++)
		{
			System.out.println("Enter Student " + id[i] + " first name:");
			String fname = myObj.nextLine();
			calling.setFirst(fname);
			
			System.out.prinln("Enter Student " + id[i] + " last name:");
			String lname = myObj.nextLine();
			calling.setLast(lname);

			System.out.println("Enter Student " + id[i] + " year:");
			String school_year = myObj.nextLine();
			calling.setYear(school_year);

			System.out.println("Enter Student " + id[i] + " major:");
			String major = myObj.nextLine();
			calling.setMajor(major);
		}

		for(int i = 0; i < id.length; i++)
		{
			[i]calling.display();
		}
	}
}
