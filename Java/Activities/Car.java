package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car() {
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics() {
        System.out.println("Color of the car is " +color);
        System.out.println("Transmission of the car is " +transmission);
        System.out.println("Make of the car is " +make);
        System.out.println("Number of tyres in the car are " +tyres);
        System.out.println("Number of doors in the car are " +doors);
    }

    public void accelarate() {
        System.out.println("Car is moving forward.");
    }
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
