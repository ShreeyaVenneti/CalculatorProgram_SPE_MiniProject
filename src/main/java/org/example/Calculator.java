import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator 
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    //function to compute sum
    public static double addition(double x, double y) 
    {
        logger.info("addition operation begins");
        double sum = x + y;
        logger.info("addition operation ends");
        return sum;
    }

    //function to compute quotient
    public static double division(double x, double y)
    {
        logger.info("division operation begins");
        if (y != 0)
        {
            double quotient = x/y;
            logger.info("division operation ends");
            return quotient;
        }

        logger.warn("invalid input");
        //error handling
        return Double.NaN;
    }

    //function to compute logarithm of a number to any base
    //loga_b = loga_e/logb_e
    public static double logarithm(double number, double base)
    {
        logger.info("logarithm operation begins");
        if ((number > 0)&&(base > 0))
        {
            double result = Math.log(number) / Math.log(base);
            logger.info("logarithm operation ends");
            return result;
        }

        logger.warn("invalid input");
        //error handling
        return Double.NaN;
    }

    //function to compute square root of any number
    public static double square_root(double number)
    {
        logger.info("square root operation begins");
        if (number >= 0)
        {
            double result = Math.sqrt(number);
            logger.info("square root operation ends");
            return result;
        }

        logger.warn("invalid input");
        //error handling
        return Double.NaN;
    }

    public static void main(String[] args) 
    {
        logger.info("calculator program begins");

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Welcome to the Calculator!");
        System.out.println("Choice of operations:");
        System.out.println("1. For addition operation");
        System.out.println("2. For division operation");
        System.out.println("3. For logarithm operation");
        System.out.println("4. For square root operation");
        System.out.println("5. To Exit\n");

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

        //if quotient is chosen
        else if (choice == 4)
        {
            System.out.print("Enter 1 number for square root operation: ");
            double x = scanner.nextDouble();
            double result = square_root(x);
            //error handling
            if (Double.isNaN(result))
                System.out.println("Invalid input: Input should be positive");
            else
                System.out.println("The square root result is: " + result);
        }

        //if user wants to exit
        else 
        {
            System.out.println("Thanks for using the Calculator Program. Goodbye!");
        }

        scanner.close();

        logger.info("calculator program ends");
    }
}

