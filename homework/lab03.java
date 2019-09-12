public class lab03
{

        static void concatName(String firstName, String lastName)
        {
                System.out.printl("Hello " + firstName + " " + lastName);
        }

        static void checkAge(int check)
        {
                if(check >= 18)
                {
                        System.out.println("You are " + check + "years old.");

                        System.out.println("You can vote");
                }
                else
                {
                        System.out.println("You are " + check + "years old.");

                        System.out.println("You can't vote");
                }
        }

        public static void main(String args[])
        {
                System.out.println("Student Name: Lab03");

                firstName = args[0];
                lastName = args[1];
                check = args[3];

                concatName(firsName, lastName);

                checkAge(check);
        }
}
