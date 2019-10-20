public class Student extends Person
{
	private  int store_ID;
	private  String school_year;
	private String major;

	public void setID(int i_D)
	{
		this.store_ID = i_D;
	}
	
	public int getID()
	{
		return store_ID;
	}

	public void setYear(String school_year)
	{
		this.school_year = school_year;
	}
	
	public String getYear()
	{
		return school_year;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	public String getMajor()
	{
		return major;
	}
	
	public void display()
	{
		System.out.println("Student " + store_ID + ":");
		System.out.println(getFirst() + " " + getLast() + " year is " + school_year + " and major is " + major);
	}
	
	public Student()
	{
		// return null;
	}
	
	public Student(int id)
	{
		store_ID = id;
	}
}
