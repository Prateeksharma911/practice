package FactoryDesignPattern;



public class Car implements Vehicle {

    @Override
    public void createVehicle() {
        System.out.println("Car vehicle create");
    }
    
}
