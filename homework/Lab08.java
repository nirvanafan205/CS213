import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab08
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab08 \n");

		Scanner myObj = new Scanner(System.in);

		ArrayList<String> students = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();

		System.out.println("How many students do you wnat to enter?");
		int amount = myObj.nextInt();

		for(int nmbr = 0; nmbr < amount; nmbr++)
		{
			Scanner other = new Scanner(System.in);

			System.out.println("Enter student " + (nmbr + 1) + ":");

			String name = other.nextLine();
			students.add(name);
		}

		System.out.println("Here are your students:");

		for(String names : students)
		{
			System.out.println(names);
		}

		System.out.println("\nHow many Scores do you want to enter?");

		int numbers = myObj.nextInt();

		for(int names = 0; names < students.size(); names++)
		{
			System.out.println("\nEnter scores for " + students.get(names) );

			for(int grade = 0; grade < numbers; grade++)
			{
				Scanner helper = new Scanner(System.in);

				System.out.println("Enter score " + (grade + 1) + ":");
				int input = helper.nextInt();
				scores.add(input);
			}							

			System.out.println("\nRemoving the lowest score and highest score...\nHere are your scores for " + students.get(names) );

			Collections.reverse(scores);


			for(int z = 0; z < scores.size(); z++)
			{

				if(scores.get(z) > max)
				{
					scores.get(z) = max;
				}

				if(scores.get(z) > min)
				{
					scores.get(z) = min;
				}

				System.out.println(scores.get(z) );
			}
			scores.clear();
		}
	}	
}
