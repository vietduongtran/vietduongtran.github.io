package homework1;

public class Student implements Iclassification{
    private String name;
    private int age;
    private double marks;
    private String classification;


    @Override
    public void classify() {
        // TODO Auto-generated method stub
        if (marks >=8) {
            classification = "A";
        } else if (marks >=6.5) {
            classification = "B";
        } else if (marks > 0) {
            classification = "C";
        }
        
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Sinh vien " + name + age + " tuoi, voi diem " + marks + " dat loai: " + classification);
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the age
     */
    public double getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return double return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    /**
     * @return String return the classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * @param classification the classification to set
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

}
