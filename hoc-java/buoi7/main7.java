package buoi7;

import buoi5oop.Dog;

public class main7 {
    public static void main(String[] args) {
        // animal animal = new animal();
        dog dog = new dog("begie", "Alex");
        dog.speak();         
        dog.move();


        Sedan sedan = new Sedan("Toyota", "green");

        Car car = new Sedan("Honda", "white");

        car.horn(true);
    
        Sedan sedan1 = (Sedan)car;
        sedan1.getColor();

        Car car2 = new Car("Ford") ;

        if(car2 instanceof Sedan){
            System.out.println("car2 la sedan");
        } else {
            System.out.println("car2 KHONG la sedan");
            
        // Sedan sedan2 = (Sedan)car2;
        // sedan2.horn(true)
    }

    }
 }

