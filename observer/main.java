package observer;

public class main {
    public static void main(String[] args) {
        observerPeople p1 = new observerPeople(1);
        observerPeople p2 = new observerPeople(3);
        observerPeople p3 = new observerPeople(5);

        subjectcollection publisher = new subjectcollection();
        publisher.register(p1);
        publisher.register(p2);
        publisher.register(p3);
        publisher.notifyuser("Hello Guys");
        
        publisher.unregister(p3);
        publisher.notifyuser("Hello Guys new notification is here");

    }
}
