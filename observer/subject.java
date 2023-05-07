package observer;

public interface subject {
    public void register(observerPeople o);
    public void unregister(observerPeople o);
    public void notifyuser(String msg);
}
