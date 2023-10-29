import java.util.*;

public class Calculator 
{
    //function to compute sum
    public static double addition(double x, double y) 
    {
        double sum = x + y;
        return sum;
    }

    //function to compute quotient
    public static double division(double x, double y)
    {
        if (y != 0)
        {
            double quotient = x/y;
            return quotient;
        }

        //error handling
        return Double.NaN;
    }

    //function to compute logarithm of a number to any base
    //loga_b = loga_e/logb_e
    public static double logarithm(double number, double base)
    {
        if ((number > 0)&&(base > 0))
        {
            double result = Math.log(number) / Math.log(base);
            return result;
        }

        //error handling
        return Double.NaN;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Welcome to the Calculator!");
        System.out.println("Choice of operations:");
        System.out.println("1. For addition operation");
        System.out.println("2. For division operation");
        System.out.println("3. For logarithm operation");
        System.out.println("4. To Exit\n");

        int choice = scanner.nextInt();

        //if sum is chosen
        if (choice == 1) 
        {
            System.out.print("Enter 2 numbers for computing sum: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double result = addition(x, y);
            System.out.println("The addition result is: " + result);
        } 

        //if quotient is chosen
        else if (choice == 2)
        {
            System.out.print("Enter 2 numbers for computing quotient: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double result = division(x, y);
            //error handling
            
            if (Double.isNaN(result))
                System.out.println("Invalid input: Division by zero");
            else
                System.out.println("The division result is: " + result);
        }


        //if quotient is chosen
        else if (choice == 3)
        {
            System.out.print("Enter 2 numbers for computing logarithm: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double result = logarithm(x, y);
            //error handling
            if (Double.isNaN(result))
                System.out.println("Invalid input: Both inputs should be positive");
            else
                System.out.println("The logarithm result is: " + result);
        } 

        //if user wants to exit
        else 
        {
            System.out.println("Thanks for using the Calculator Program. Goodbye!");
        }

        scanner.close();
    }
}

