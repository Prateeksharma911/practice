package FactoryDesignPattern;

public class main {
    public static void main(String[] args) {

        Vehicle vehicless = Factory.createVehicle("bike");
        vehicless.createVehicle();
    }
}
