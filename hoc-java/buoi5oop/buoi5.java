package buoi5oop;
public class buoi5 {

   enum Season {
      SPRING,
      SUMMER,
      AUTUMN,
      WINTER,
   }

   static int sum(int x, int y) {
      int total = x+y;
      return total;
   }


 public static void main(String[] args) {

   Dog dog1 = new Dog();
   Dog dog2 = new Dog();
   Dog dog3 = new Dog();

    System.out.println("dog1: " + dog1.breed);
    System.out.println(("dog2: " + dog2.breed));
    System.out.println("dog3: " + dog3.breed);

    System.out.println("dog1: " + dog1.age);
    System.out.println(("dog2: " + dog2.age));
    System.out.println("dog3: " + dog3.age);

    System.out.println(dog1 == dog2);
   
    dog1.breed = "Neapolitan Mastiff";
    dog1.size = "Large";
    dog1.color = "Black";
    dog1.age = 5;

    dog2.breed = "Malteese";
    dog2.size = "Small";
    dog2.color = "Brown";
    dog2.age = 2;

    dog3.breed = "Chow chow";
    dog3.size = "Medium";
    dog3.color = "Yellow";
    dog3.age = 4;


    dog1.eat();
    dog1.bark();

   Dog dog4 = new Dog("breed", "size", 1, "color");

   //  Dog dog5 = new Dog();
   //  Dog dog6 = new Dog();
   dog4.print();
   

   Season season = Season.AUTUMN;
   System.out.println(season);

   switch (season) {
      case SPRING: {
         System.out.println("mua xuan");
         break;
      }
      case SUMMER: {
         System.out.println("mua he");
         break;
      }
      case AUTUMN: {
         System.out.println("mua thu");
         break;
      }
      case WINTER: {
         System.out.println("mua dong");
         break;
      }
   }
 }  
}
