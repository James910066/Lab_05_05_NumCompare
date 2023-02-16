import java.util.Scanner; //Scanner for user input

public class NumCompare
{
    public static void main(String[] args)
    {
        int secondNumber = 0; //Declaration and assignment of int variable
        int firstNumber = 0; //Declaration and assignment of int variable
        String trash = ""; //Declaration and assignment of string variable
        Scanner in = new Scanner(System.in); //Scanner for user input

            System.out.println("Enter first number to compare: "); //Output to user to get input
        while (firstNumber == 0) //Keep looping for input until variable changes from 0
            if (in.hasNextInt()) //Check for valid input from user
                {
                    firstNumber = in.nextInt(); //User input
                    in.nextLine(); //Clearing buffer
                }
            else //Next step if input is invalid
                {
                    trash = in.nextLine(); //Variable used to return bad input to user
                    System.out.println(trash + " is an invalid input. Please enter first number "); //Output statement to user
                }

            System.out.println("Enter second number to compare: "); //Output to user to get input
        while (secondNumber == 0) //Keep looping for input until variable changes from 0
            if (in.hasNextInt()) //Check for valid input from user
                {
                    secondNumber = in.nextInt(); //User input
                    in.nextLine(); //Clearing buffer
                }
            else //Next step if input is invalid
                {
                    trash = in.nextLine(); //Variable used to return bad input to user
                    System.out.println(trash + " is an invalid input. Please enter second number "); //Output statement to user
                }

            if (firstNumber == secondNumber) //Check if both inputs are equal
                {
                    System.out.println(firstNumber + " and " + secondNumber + " are equal"); //Output statement to user
                }
            else if (firstNumber > secondNumber) //Check if one input is larger than other
                {
                    System.out.println(firstNumber + " is greater than " + secondNumber); //Output statement to user
                }
            else //Next step if input is invalid
                {
                    System.out.println(firstNumber + " is less than " + secondNumber); //Output statement to user
                }

    }
}