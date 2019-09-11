public class switch_ 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");

		int day = 4;

		// switch is being being used, different scenarious are given
		// day is the variable that is being called on
		switch (day) 
		{
			case 1:
				System.out.println("Yo mama");
				break; // if day were to be made 1, 'Yo mama' would be printed out 
			case 2:
				System.out.println("Yeyeyey");
				break;
				// if day were to be 2 then 'Yeyeyeyey' would be printed out
			case 3:
				System.out.println("toooopppp");
				break;
			case 4:
				System.out.println("chicken");
				break; //break is to stop the switch once condition is meet. I.e when day == 4
				// since day equals to 4, 'chicken' will be printed out
			case 5:
				System.out.println("top hatg");
				break;
			case 6:
				System.out.println("The mad man");
				break;
			case 7:
				System.out.println("yoouou");
				break;

			default:
				System.out.println("This is the default message");
				// default is called on when condition hasn't been met. Break is not needed since default statement is used at the last statement in the switch block
		}
	}
}
