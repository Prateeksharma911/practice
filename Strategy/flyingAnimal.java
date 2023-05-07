package Strategy;

public interface flyingAnimal {
    void fly();
}

class canFly implements flyingAnimal {
    @Override
    public void fly() {
        System.out.println("Hi, I can fly");
    }
    
}


class cantFly implements flyingAnimal {
    @Override
    public void fly() {
        System.out.println("Hi, I cannot fly");    
    }
    
}