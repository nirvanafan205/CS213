public class lab02
{
	public static void main(String[] args)
	{
		int[][] darray = { {1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
		}

		int subtotal, total;
		String oddeven;

		for(int i = 0; i < darray.length; i++)
		{
			System.out.println("Row: " + i);

			for(int j = 0; j < darray.size; i++)
			{
				System.out.println(darray[i][j]);
			}
		}

	}
}
