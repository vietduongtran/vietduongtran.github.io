public class Person {

    private String name; 
    private String birthDate;
    private String job;

    public Person(String name, String birthDate, String job) {
        this.name = name;
        this.birthDate = birthDate;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person [birthDate=" + birthDate + ", job=" + job + ", name=" + name + "]";
    }
    
    
}