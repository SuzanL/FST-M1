package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car Tesla = new Car();
        Tesla.Make = 2022;
        Tesla.Color = "Black";
        Tesla.Transmission = "Automatic";
        Tesla.displayCharacteristics();
        Tesla.accelerate();
        Tesla.brake();
    }
}
