class shape {
    public double getArea()
    {
        return 0;
    }
}

class Triangle extends shape
{
    private double base;
    private double height;
    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    public double getArea()
    {
        return 0.5 * base * height;
    }
}

class Square extends shape
{
    private double side;
    public Square(double side)
    {
        this.side = side;
    }
    public double getArea()
    {
        return side * side;
    }
}
class test {
    public static void main(String args[])
    shape[] shape = new shape[2];
    shape[0] = new Square(5)
    shape[1] = new Triangle(2, 2);
    System.out.println("Area of the square: " + shape[0].getArea());
    System.out.println("Area of Triangle: " + shape[1].getArea());
}