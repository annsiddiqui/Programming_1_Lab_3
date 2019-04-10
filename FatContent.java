import java.util.Scanner;
public class FatContent
{
    public void run()
    {
        double gramsFat;
        double totalCalories;
        double fatCalories;
        double pctgFatCalories;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the grams of fat: ");
        gramsFat = keyboard.nextInt();
        System.out.println("Enter the number of calories: ");
        totalCalories = keyboard.nextInt();
        
        fatCalories = (9.0 * gramsFat);
        pctgFatCalories = (fatCalories / totalCalories) * 100;
        
        System.out.println("The food has " + pctgFatCalories + " % fat.");
        
        if (pctgFatCalories <= 35)
        { 
            System.out.println("This food item is Heart Healthy.");
        }
        else 
        {
            System.out.println("This food item is not Heart Healthy.");
        }
    }
}
