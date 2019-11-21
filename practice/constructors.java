interface Major
{
	String getMajor();
	void setMajor(String m);
}

interface Payment
{
	int getDeposit();
	void setDeposit(int pay);
}

class Student implements Major, Payment
{
	private String major;
	private int deposit;

	public void setMajor(String m)
	{
		major = m;
	}

	public String getMajor()
	{
		return major;
	}

	public void setDeposit(int p)
	{
		deposit = p;
	}

	public int getDeposit()
	{
		return deposit;
	}

	public Student(String m, int p)
	{
		major = m;
		deposit = p;
	}
}

public class constructors
{
	public static void main(String[] args)
	{
		Student settings[] = {new Student("Math", 25), new Student("Music", 50) };

		for(int students = 0; students < settings.length; students++)
		{
			System.out.println("Student " + (students + 1) + " major: " + settings[students].getMajor() );
			System.out.println("Student " + (students + 1) + " deposit: " + settings[students].getDeposit() );
		}
	}
}
