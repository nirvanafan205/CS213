import java.util.Scanner;

public class loops
{
	static void exercise_1()
	{
		System.out.println("Enter three numbers");

		Scanner nmbrs = new Scanner(System.in);

		int nber_one = nmbrs.nextInt();
		int nber_two= nmbrs.nextInt();
		int nber_three = nmbrs.nextInt();
		
		if(nber_one == nber_two && nber_one == nber_three && nber_two == nber_three)
		{
			System.out.println("They are all equal");
		}
		else
		{
			System.out.println("They are not equal");
		}

	}
	public static void main(String[] args)
	{
		exercise_1();
	}
}
