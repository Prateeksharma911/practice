package Strategy;

public class animalThing {
    public static void main(String[] args) {
        animal ob = new dog();
        ob.tryToFly();
        ob.setAbilityToFly(new canFly());
        ob.tryToFly();
    }
}
