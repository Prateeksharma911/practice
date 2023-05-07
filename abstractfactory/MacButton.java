package abstractfactory;

public class MacButton implements ButtonFactory {

    @Override
    public void press() {
        System.out.println("Presed mac button");

    }
    
}
