import java.util.Scanner;

abstract class Vehicle {
    int speed;
    int gear;

    void setSpeedAndGear(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }
    abstract void displaySpeed();
}

class Truck extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("The Truck is moving at " + speed + " km/h in gear " + gear + ".");
    }
}

class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("The Bike is moving at " + speed + " km/h in gear " + gear + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle truck = new Truck();
        Vehicle bike = new Bike();

        System.out.print("Enter the speed of the Truck: ");
        int truckSpeed = scanner.nextInt();
        System.out.print("Enter the gear of the Truck: ");
        int truckGear = scanner.nextInt();
        truck.setSpeedAndGear(truckSpeed, truckGear);

        System.out.print("Enter the speed of the Bike: ");
        int bikeSpeed = scanner.nextInt();
        System.out.print("Enter the gear of the Bike: ");
        int bikeGear = scanner.nextInt();
        bike.setSpeedAndGear(bikeSpeed, bikeGear);

        truck.displaySpeed();
        bike.displaySpeed();

        scanner.close();
    }
}
