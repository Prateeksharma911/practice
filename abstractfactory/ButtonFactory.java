package abstractfactory;

public interface ButtonFactory {
    public void press();
}


class MacButton implements ButtonFactory {

    @Override
    public void press() {
        System.out.println("Presed mac button");

    }
}
class WindowButton implements ButtonFactory {

    @Override
    public void press() {
        System.out.println("Pressed windows button");
    }
    
}
