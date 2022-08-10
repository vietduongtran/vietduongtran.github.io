package buoi7;

public class Car {
    String brand;
    
    public Car(String brand) {
        this.brand = brand;
    }

    public void horn(boolean isCrowd) {
        if (isCrowd) {
            System.out.println(" piiiiiip piiiiiiip");
        } else {
        System.out.println("pip pip");
    }
}
}
