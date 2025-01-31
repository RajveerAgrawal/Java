import java.util.Scanner;
public class project
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("enter two numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x + " / " + y + " = " + z);
        }

        catch (ArithmeticException ex)
        {
            System.out.println("--- catch block ---");
            System.out.println(ex.toString());
        }
        catch (Exception ex)
        {
            System.out.println("Exception occured");
            System.out.println(ex.toString());
        }
        finally
        {
            System.out.println("Application Designed & Developed by Rajveer");
        }
    }
}