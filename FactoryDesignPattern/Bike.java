package FactoryDesignPattern;

public class Bike implements Vehicle{

    @Override
    public void createVehicle() {
        
        System.out.println("Bike vehicle create");
    }
    
}
