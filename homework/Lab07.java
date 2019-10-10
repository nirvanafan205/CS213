import java.util.Scanner;

interface Major 
{
	public void setMajor(String major);
	public String getMajor();
	public boolean requestMajor();

	enum Majors
	{
		ART,
		HISTORY,
		MATH,
		MUSIC
	}
}

interface Payment
{
	public void setDeposit(int deposit);
	public int getDeposit();
}

class Student implements Major, Payment
{
	Scanner myobj = new Scanner(System.in);

	private String major;
	private int deposit;

	public void setMajor(String major)
	{
		this.major = major;

	}
	public String getMajor()
	{
		return major;
	}
	public boolean requestMajor()
	{
		System.out.printf("Available majors are: \n");	

		for(Majors myVar : Majors.values())
		{
			System.out.println(myVar);
		}

		System.out.println("Please enter a major");

		String major = myobj.nextLine();


		for(int i = 0; i < Majors.values().length; i++)
		{
			major.toUpperCase();

			Majors[] myVar_ = Majors.values();
// left off here finish this 
// left off here finish this 
// left off here finish this 
// left off here finish this 
// left off here finish this 
// left off here finish this 
			if(major.equals(myVar_[i]) )
			{

				System.out.println("Hello");
			}
		}

		return true;
	}

	public void setDeposit(int deposit)
	{
		this.deposit = deposit;
	}

	public int getDeposit()
	{
		return deposit;
	}
}

public class Lab07
{
	public static void main(String[] args)
	{
		Student myObj = new Student();

		myObj.requestMajor();
	}
}
