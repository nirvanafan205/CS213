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

		System.out.println("");
	}

	static void exercise_9()
	{
		for(int i = 1000; i < 2001; i++)
		{
			int first = i / 1000;
			int second = (i / 100) % 10;
			int third = (i / 10) % 100  % 10;
			int fourth = i % 10;

			System.out.println(first + " " + second + " " + third + " " + fourth);
		}

		System.out.println("");
	}

	static void web_3()
	{
		System.out.println("Gimme 5 numbers");

		Scanner nmbrs = new Scanner(System.in);
		int nber_one = nmbrs.nextInt();
		int nber_two= nmbrs.nextInt();
		int nber_three = nmbrs.nextInt();
		int nber_four = nmbrs.nextInt();
		int nber_five = nmbrs.nextInt();
		
		int add = nber_one + nber_two + nber_three + nber_four + nber_five; 

		int median = add / 5;	
		
		System.out.println("");

		System.out.println("The mean is: " + median);

		System.out.println("");
	}
		public static void main(String[] args)
		{
			exercise_1();

			exercise_9();

			web_3();
		}
}
