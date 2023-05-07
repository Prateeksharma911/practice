package observer;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class subjectcollection implements subject {

    private ArrayList<observerPeople> observers  = new ArrayList<observerPeople>(); 

    @Override
    public void register(observerPeople o) {
        observers.add(o);
    }

    @Override
    public void unregister(observerPeople o) {
        System.out.println("Unsubscribing user "+ o.getId());
        observers.remove(o);
    }

    @Override
    public void notifyuser(String msg) {
        for (observerPeople people : observers) {
            people.notifyuser(msg);
        }
    }
    
}
