package buoi5oop;


public class Dog {
    enum GENDER {
        MALE,
        FEMALE,
    }

        public static int var;

        public String breed;
        public String size;
        public int age;
        public String color;

        public GENDER gender; //1-male , 2-female

        public Dog() {
            breed = "abx";
            size = "small";
            age = 2; 
            color = "grey";
        }

        public Dog(String breed, String size, int age, String color) {
            this.breed = breed;
            this.size = size;
            this.age = age;
            this.color = color;
        }

        public void printGender() {
            if (this.gender == GENDER.MALE) {
                System.out.println("gioi tinh duc");
            } else if (this.gender == GENDER.FEMALE) {
                System.out.println("gioi tinh cai");
            } else {
                System.out.println("ko biet gioi tinh");
            }
            }
                
            
        

    public void eat () {
        System.out.println("mam mam mam");

    }

    public void bark() {
        System.out.println("go go go...");
    }
    
    /**
    * in ra ten cac thuoc tinh
    **/
    public void print () {
        // System.out.println(breed);
        // System.out.println(size);
        // System.out.println(age);
        // System.out.println(color);
        String textToPrint = this.toString();
        System.out.println(textToPrint);
    }

    // convert object to text
    public String testString() {
        String text = this.breed + " " + this.size + " " + this.age + " " + this.color + " ";
        return text;
    }

    }

