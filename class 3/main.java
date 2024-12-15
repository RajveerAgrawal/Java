// class main {
//     public static void main(String[] args) 
//     {
//         for (int i=10; i>0; i--)
//         {
//             System.out.println(i);
//         }
//         int d=10;
//         System.out.println("Using while loop");
//         while(d>0)
//         {
//             System.out.println(d);
//             d--;
//         }
//     }
// }
//         int a =-2;
//         if (a==0)
//         {
//             System.out.println("A is 0");
//         }
//         else if (a<0)
//         {
//             System.out.println("A is negative");
//         }
//         else
//         {
//             System.out.println("A is positive");
//         }
//     }
// }

import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your percentage: ");
        double perc = scanner.nextDouble();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age +  "years old.");
        System.out.println("Your percentage is " + perc);
        scanner.close();
    }
}