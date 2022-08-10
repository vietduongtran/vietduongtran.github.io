package buoi7;

public abstract class animal {
    protected String name; 
    protected String breed;
    protected double weight;

    public String getName() {
        return this.name;
    }
    public void move() {
        System.out.println("Animal move");
    }

    public abstract void speak();
}
