public class lab02
{
	public static void main(String[] args)
	{
		int[][] arrays = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };
		String oddeven;

			int subtotal, total = 0;

		for(int i = 0; i < arrays.length; i ++)
		{
			System.out.println("Row: " + i);

			subtotal = 0;
			
			for(int j = 0; j < arrays[i].length; j++)
			{
				System.out.println(arrays[i][j]);

				subtotal += arrays[i][j];
			}	

			if(subtotal % 2 == 0)
			{
				oddeven = "even.";
			}
			else
			{
				oddeven = "odd.";
			}

			System.out.println("Subtotal for row " + i + " is " + subtotal + ", and is " + oddeven);

			total += subtotal;
		}

		System.out.println("Total: " + total + "\n");
	}
}
