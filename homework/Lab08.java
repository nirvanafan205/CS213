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

			int max = scores.get(0);
			int min = scores.get(0);

			for(int z = 0; z < scores.size(); z++)
			{
				if(scores.get(z) > max)
				{
					max = scores.get(z);
				}
				else if(scores.get(z) < min)
				{
					min = scores.get(z);
				}
			}

			for(int highest = 0; highest < scores.size(); highest++)
			{
				if(scores.get(highest).equals(max) )
				{
					scores.remove(highest);
				}
			}

			for(int lowest = 0; lowest < scores.size(); lowest++)
			{
				if(scores.get(lowest).equals(min) )
				{
					scores.remove(lowest);
				}
			}

			System.out.println("Removing the lowest score and highest score...\nHere are your scores for " + students.get(names) );

			Collections.reverse(scores);

			for(int m = 0; m < scores.size(); m++)
			{
				System.out.println(scores.get(m) );
			}

			scores.clear();
		}
	}	
}
