package abstractfactory;

public interface OSfactory {
    public ButtonFactory createButton();    
    public TextFactory createText();    

}

class macFactory implements OSfactory{

    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public TextFactory createText() {
       
        return new MacText();
    }

}
class windowFactory implements OSfactory{

    @Override
    public WindowButton createButton() {
        return new WindowButton();
    }

    @Override
    public WindowText createText() {
       
        return new WindowText();
    }

}