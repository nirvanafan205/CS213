public class LAB01 
{
	public static void main(String[] args)
	{
		System.out.println("Matthew Garcia: Lab 01 \n ");

		int nbr1, nbr2, sum;

		nbr1 = 5;
		nbr2 = 7;
		sum = nbr1 + nbr2;

		System.out.println("nbr1 is " + nbr1);
		System.out.println("nbr2 is " + nbr2);

		if(sum % 2 == 1)
		{
		    System.out.println("sum is" + sum);
			System.out.println("The sum is odd");
			System.out.println("");
		}
		else if(sum % 2 == 0)
		{
		    System.out.println("sum is " + sum);
			System.out.println("The sum is even");
			System.out.println("");
		}

		nbr1 = 8;
		sum = nbr1 + nbr2;

		System.out.println("nbr1 is " + nbr1);
		System.out.println("nbr2 is " + nbr2);

		if(sum % 2 == 1)
		{
			System.out.println("sum is " + sum);
			System.out.println("The sum is odd");
			System.out.println("");
		}
		else if(sum % 2 == 0)
		{
			 System.out.println("sum is " + sum);
			System.out.println("The sum is even");
			System.out.println("");
		}
	}
}
