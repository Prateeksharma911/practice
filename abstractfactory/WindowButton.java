package abstractfactory;

public class WindowButton implements ButtonFactory {

    @Override
    public void press() {
        System.out.println("Pressed windows button");
    }
    
}
