package activities;

public class Car {
    String Color;
    String Transmission;
    int Make;
    int Tyres;
    int Doors;
    Car()
    {
        Tyres=4;
        Doors=4;
    }

    public void displayCharacteristics()
    {
        System.out.println("Color of the activities.Car: " + Color);
        System.out.println("Make of the activities.Car: " + Make);
        System.out.println("Transmission of the activities.Car: " + Transmission);
        System.out.println("Number of doors on the car: " + Doors);
        System.out.println("Number of tyres on the car: " + Tyres);
    }

    public void accelerate()
    {
        System.out.println("activities.Car is moving forward.");
    }

    public void brake()
    {
        System.out.println("activities.Car has stopped.");
    }
}