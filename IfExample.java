import java.util.Scanner;

public class IfExample 
{
    public static void main(String[] args)
    {
        int number;         // number entered by the user
        int unitsDigit;     // the units digit of this number
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print ("Please enter an integer > ");
        number = keyboard.nextInt ();
        
        unitsDigit = number % 10;
        
        if (unitsDigit == 0)
        {
            System.out.println ("\nThe value you entered is a multiple of 10");
        }
        else
        {
            System.out.println ("\nThe else block is executing");
            System.out.println ("The units digit is " + unitsDigit);
        }
     
    }

}