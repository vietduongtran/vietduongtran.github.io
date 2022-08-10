package buoi7;

public class Sedan extends Car {

    String color;
    public Sedan(String brand, String color) {
        super(brand);
        this.color = color;
        
    }

    @Override
    public void horn(boolean isCrowd) {
        System.out.println("beep beep");
    }
    
    public String getColor() {
        return this.getColor();
    }
}
