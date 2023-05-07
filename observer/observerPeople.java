package observer;

public class observerPeople implements Observer {
    private int observerID;
    observerPeople(int observerID) {
        this.observerID = observerID;
    }

    @Override
    public void notifyuser(String msg) {
        System.out.println("Observer:" + this.observerID + " is getting msg:" + msg);
    }

    public int getId() {
        return this.observerID;
    }
    
}
