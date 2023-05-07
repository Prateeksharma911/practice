package abstractfactory;

import org.omg.PortableInterceptor.RequestInfo;

public class GUIAbstractFactory {
    public static OSfactory createFactory(String osdata) {
        if (osdata == "win") {
            return new windowFactory();
        }
        if (osdata == "mac") {
            return new macFactory();
        }
        return null;
    }
}
