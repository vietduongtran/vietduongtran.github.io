
public class Course {   
    private double fee;
    private String name;

    
    public Course(String name, double fee) {
        this.name=name;
        this.fee = fee;
    }
 
    public String getName() {
        return name;
    }


    public double getFee() {
        return fee;
    }


    @Override
    public String toString() {
        return "Course [fee=" + fee + ", name=" + name + "]";
    }

    //add and complete you other methods (if needed) here   

     
}
