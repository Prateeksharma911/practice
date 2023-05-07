package FactoryDesignPattern;

public class Factory {
    public static Vehicle createVehicle(String vh) {
        if (vh == "car") {
            Car ob = new Car();
            return ob;
        } else {
            Bike bike = new Bike();
            return bike; 
        }
    }
    
}
