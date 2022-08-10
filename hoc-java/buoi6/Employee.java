package buoi6;
import java.time.LocalDate;
import java.util.Scanner;

enum GENDER {
    MALE,
    FEMALE
   
}

public class Employee {

    Scanner scanner;
    public String id;
    public String name;
    public LocalDate birthday;
    public GENDER gender;
    public double salary;

    public Employee(String id, String name, LocalDate birthday, GENDER gender, double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString(){
        String text = "Id: " + this.id 
                    + "\n" + "name: " + this.name
                    + "\n" + "birthday " + this.birthday
                    + "\n" + "gender " + this.gender
                    + "\n" + "salary " + this.salary;
        return text; 
    }

    public void print(){
        String textToPrint = this.toString();
        System.out.println(textToPrint);
    }

    public boolean findID (String keyword) {
        boolean result = ((this.id).equals(keyword));
        return result;
    } 

    public boolean findName(String keyword) {
        boolean result = (this.name).contains(keyword);
        return result;
    }

     public boolean findGENDER (String keyword) {
        boolean result = ((this.gender).equals(keyword));
        return result;
    } 

    public int findAge(Employee employee){
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int yearOfBirth = this.birthday.getYear();
        int age = year - yearOfBirth;
        return age;
    }

    public int findMonth(){
        int month = this.birthday.getMonthValue();
        return month;
    }

    public boolean findSalary(double salary) {
        boolean result = (salary == this.salary);
        return result; 
    }
}