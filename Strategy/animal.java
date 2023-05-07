package Strategy;

public class animal {
    private String name;
    protected flyingAnimal flyingability;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void tryToFly() {
        flyingability.fly();
    }
    
    public void setAbilityToFly(flyingAnimal flytype) {
        flyingability = flytype;
        
    }
}
