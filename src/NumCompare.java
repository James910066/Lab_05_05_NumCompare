public class NumCompare
{
    public static void main(String[] args)
    {
        //num firstNumber
        //num secondNumber
        //input firstNumber
        //input secondNumber
        //If firstNumber == secondNumber then
        //output firstNumber + “ is equal to “ + secondNumber
        //elseIF firstNumber > secondNumber then
        //output secondNumber + “ is less than “ + firstNumber
		//	else
        //output firstNumber + “ is less than “ + secondNumber
        //endIf

        int firstNumber = 0;
        int secondNumber = 1;

        if (firstNumber == secondNumber)
        {
            System.out.println(firstNumber + " and " + secondNumber + " are equal");
        }
        else if (firstNumber > secondNumber)
        {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        }
        else
        {
            System.out.println(firstNumber + " is less than " + secondNumber);
        }
    }
}