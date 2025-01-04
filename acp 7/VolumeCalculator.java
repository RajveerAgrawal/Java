abstract class Shape {
    public abstract double getVolume();
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}

class Cuboid extends Shape {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}

class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height; 
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {
        Cube cube = new Cube(5); 
        Cuboid cuboid = new Cuboid(4, 6, 8); 
        Cylinder cylinder = new Cylinder(3, 7); 

        System.out.println("Volume of Cube: " + cube.getVolume() + " cm³");
        System.out.println("Volume of Cuboid: " + cuboid.getVolume() + " cm³");
        System.out.println("Volume of Cylinder: " + cylinder.getVolume() + " cm³");
    }
}
