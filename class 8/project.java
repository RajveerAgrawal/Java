class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class project
{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5, 10 and 15: " + calc.add(5, 10, 15));
    }
}
