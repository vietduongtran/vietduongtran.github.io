package buoi7;
public class dog extends animal {

    public dog (String breed, String name) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void speak() {
   
        System.out.println(this.name + ": gau gau gau!");
        
    }

    public void move() {
        super.move();
        // super.getName();
        System.out.println(super.getName() + " Dog move");
    }
    
}
