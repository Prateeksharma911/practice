package abstractfactory;

import javafx.scene.control.ButtonBar.ButtonData;

public class main {
    public static void main(String[] args) {
        OSfactory xfac = GUIAbstractFactory.createFactory("win");
        ButtonFactory xbutton = xfac.createButton();
        xbutton.press();
        TextFactory xtext = xfac.createText();
        xtext.showText();
    }
    
}
