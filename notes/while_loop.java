public class while_loops 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");

		// variable my_number is given a value of 0
	
		int i = 0;

		// The while loop loops through a block of code as long as the condition is true
		// so in this case, as i is less than 5, it will Print out 'Your number is: ' and whatever number it is {1, 2, 3, 4} 

		while( i < 5)
		{
			System.out.println("Your number is: " + i);

			i++;

			// variable i is being itterated by one for each time the loop is going by 1
		}

		
		// The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
		

		int i = 0;

		do
		{
			// code block to be executed

			System.out.println(i);
			
			i++;
		}
			while (i < 5>);

	}
}
