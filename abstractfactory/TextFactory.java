package abstractfactory;

public interface TextFactory {
    public void showText();
}



class MacText implements TextFactory {
    @Override
    public void showText() {
        System.out.println("Showing text for mac");
     
    }
}

class WindowText implements TextFactory {
    @Override
    public void showText() {
        System.out.println("Showing text for window");
     
    }
}