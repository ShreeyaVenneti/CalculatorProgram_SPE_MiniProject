import java.util.*;

public class Calculator 
{
    public static double addition(double x, double y) 
    {
        double sum = x + y;
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Welcome to the Calculator!");
        System.out.println("Choice of operations:");
        System.out.println("1. For addition operation");
        System.out.println("2. To Exit\n");

        int choice = scanner.nextInt();

        if (choice == 1) 
        {
            System.out.print("Enter 2 numbers for computing sum: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double result = addition(x, y);
            System.out.println("The addition result is: " + result);
        } 

        else 
        {
            System.out.println("Thanks for using the Calculator Program. Goodbye!");
        }

        scanner.close();
    }
}
