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

	static void web_57()
	{

		System.out.println("What class Muay Thai kickboxing would you be???? Enter your weight");

		Scanner myObj = new Scanner(System.in);

		int weight = myObj.nextInt();

		switch (weight)
		{
			case 1:
				if(weight >= 0 || weight <= 112)
				{
					System.out.println("Flyweight");
				}
			case 2:
				if(weight > 112 || weight <= 115)
				{
					System.out.println("Super Flyweight");
				}
			case 3:
				if(weight > 115 || weight <= 118)
				{
					System.out.println("Bantamweight");
				}
			case 4:
				if(weight > 118 || weight <= 122)
				{
					System.out.println("Super bantamweight");
				}
			case 5:
				if(weight > 122 || weight <= 126)
				{
					System.out.println("Featherweight");
				}
			case 6:
				if(weight > 126 || weight <= 130)
				{
					System.out.println("Super featherweight");
				}
			case 7:
				if(weight > 131 || weight <= 135)
				{
					System.out.println("Lightweight");
				}
			case 8:
				if(weight > 131 || weight <= 140)
				{
					System.out.println("Super lightweight");
				}
			case 9:
				if(weight > 140 || weight <= 147)
				{
					System.out.println("Welterweight");
				}
			case 10:
				if(weight > 147 || weight <= 154)
				{
					System.out.println("Super Welterweight");
				}
			case 11:
				if(weight > 154 || weight <= 160)
				{
					System.out.println("Middleweight");
				}
			case 12:
				if(weight > 160 || weight <= 167)
				{
					System.out.println("Super Middleweight");
				}
			case 13:
				if(weight > 167 || weight <= 175)
				{
					System.out.println("Light heavyweight");
				}
			case 14:
				if(weight > 175 || weight <= 183)
				{
					System.out.println("Super Light heavyweight");
				}
			case 15:
				if(weight > 183 || weight <= 190)
				{
					System.out.println("Cruiserweight");
				}
			case 16:
				if(weight > 190 || weight <= 220)
				{
					System.out.println("Heavyweight");
				}
			case 17:
				if(weight > 220)
				{
					System.out.println("Super heavyweight");
				}
		}
	}

	public static void main(String[] args)
	{
		exercise_1();

		exercise_9();

		web_3();

		web_57();
	}
}
