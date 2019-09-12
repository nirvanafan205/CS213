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

		if(weight >= 0 || weight <= 112)
		{
			weight = 1;
		}

		else if(weight > 112 || weight <= 115)
		{
			weight = 2;
		}

		else if(weight > 115 || weight <= 118)
		{
			weight = 1;
		}

		else if(weight > 118 || weight <= 122)
		{
			weight = 3;
		}

		else if(weight > 122 || weight <= 126)
		{
			weight = 4;
		}

		else if(weight > 126 || weight <= 130)
		{
			weight = 5;
		}

		else if(weight > 131 || weight <= 135)
		{
			weight = 6;
		}

		else if(weight > 131 || weight <= 140)
		{
			weight = 7;
		}

		else if(weight > 140 || weight <= 147)
		{
			weight = 8;
		}

		else if(weight > 147 || weight <= 154)
		{
			weight = 9;
		}

		else if(weight > 154 || weight <= 160)
		{
			weight = 10;
		}

		else if(weight > 160 || weight <= 167)
		{
			weight = 11;
		}

		else if(weight > 167 || weight <= 175)
		{
			weight = 12;
		}

		else if(weight > 175 || weight <= 183)
		{
			weight = 13;
		}

		else if(weight > 183 || weight <= 190)
		{
			weight = 14;
		}

		else if(weight > 190 || weight <= 220)
		{
			weight = 15;
		}

		else if(weight > 220)
		{
			weight = 16;
		}

		switch (weight)
		{


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
